import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("STUDENT SCORESHEET!");

        Scanner input = new Scanner(System.in);
        String schoolName, teacherName, gradeLevel, yearValue;

        System.out.print("Enter School Name: ");
        schoolName = input.nextLine();

        System.out.print("Enter Teacher Name: ");
        teacherName = input.nextLine();

        System.out.print("Enter Grade: ");
        gradeLevel = input.nextLine();

        System.out.print("Enter Year: ");
        yearValue = input.nextLine();

        
        int subjectNumbers;
        System.out.println("Enter the no. of subjects");
        subjectNumbers = input.nextInt();
        input.nextLine();

        int studentNumbers;
        System.out.println("Enter no. of students: ");
        studentNumbers = input.nextInt();
        //loop until min of 12 students are added
        while(studentNumbers < 12) {
            System.out.println("Minimum of 12 students");
            studentNumbers = input.nextInt();
        }
        System.out.println("Number of students accepted: "+ studentNumbers);
        input.nextLine();
                
        
        String[] subjects = new String[subjectNumbers];
        String[] students = new String[studentNumbers];
        int[][] studentMarks = new int[studentNumbers][subjectNumbers];

        //compute: total marks, average and grade counts for class(Grade)
        int[] totalStudentMarks = new int[studentNumbers];
        int[] totalSubjectMarks = new int[subjectNumbers];
        char[] studentRank = new char[studentNumbers];

        // grade counters
        int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;
        
        // Enter subject names
        for (int j = 0; j < subjectNumbers; j++) {
            System.out.print("Enter subject name " + (j + 1) + ": ");
            subjects[j] = input.nextLine();
        }

        //loop through students, for each add j number of subject marks
        for(int i = 0; i < studentNumbers; i++){
            System.out.println("Enter student name: ");
            students[i] = input.nextLine();

            for(int j = 0; j < subjectNumbers; j++){
                System.out.print("Enter marks for " + subjects[j] + " : ");
                studentMarks[i][j] = input.nextInt();

                //adding marks
                // int mark = Integer.parseInt(studentMarks[i][j]);
                // studentTotals[i] += mark;       // total per student
                // subjectTotals[j] += mark;
                
                totalStudentMarks[i] += studentMarks[i][j];
                totalSubjectMarks[j] += studentMarks[i][j];

            } 
            input.nextLine();

            // ranking per student
            int total = totalStudentMarks[i];

            if (total >= 540) { studentRank[i] = 'A'; countA++; }
            else if (total >= 480) { studentRank[i] = 'B'; countB++; }
            else if (total >= 420) { studentRank[i] = 'C'; countC++; }
            else if (total >= 360) { studentRank[i] = 'D'; countD++; }
            else { studentRank[i] = 'F'; countF++; }
        }

        // ✔ FIXED — compute classTotal AFTER all student totals are computed
        int classTotal = 0;
        for (int t : totalStudentMarks) classTotal += t;

        
        //print
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("\t\t\tSchool Name: " + schoolName);
        System.out.println("\t\t\t\tTeacher: " + teacherName);
        System.out.println("\t\t\t\t\tGrade: " + gradeLevel);
        System.out.println("\t\t\t\t\tYear: " + yearValue);
        System.out.println("--------------------------------------------------------------------------");

        //header    
        System.out.print("Student Name\t");

        for (int j = 0; j < subjectNumbers; j++) {
            System.out.print(subjects[j] + "\t");
        }

        System.out.println("Total\tRank");
        System.out.println("====================================================================================================");

        for(int k = 0; k < studentNumbers; k++){
            System.out.print(students[k] + "\t");

            for(int j = 0; j < subjectNumbers; j++){
                System.out.print(studentMarks[k][j] + "\t");  // ✔ FIXED (use k, not i)
            }

            System.out.print(totalStudentMarks[k] + "\t");
            System.out.println(studentRank[k]);
        }   

        //total per subject
        System.out.println("====================================================================================================");
        System.out.print("\t\t");
        for (int j = 0; j < subjectNumbers; j++) {
            System.out.print(totalSubjectMarks[j] + "\t");
        }
        System.out.println(classTotal + "\t");

        //average per subject
        System.out.print("\t\t");
        for (int j = 0; j < subjectNumbers; j++) {
            System.out.print(String.format("%.2f", (double) totalSubjectMarks[j] / studentNumbers) + "\t");
        }
        System.out.println(String.format("%.2f", (double) classTotal / studentNumbers) + "\t");

        //grade count
        System.out.println("====================================================================================================");
        System.out.println("Ranks\tA's: " + countA + "\tB's: " + countB + "\tC's: " + countC + "\tD's: " + countD + "\tF's: " + countF);

        input.close();
    }
}
