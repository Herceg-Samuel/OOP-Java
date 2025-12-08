import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("STUDENT SCORESHEET!");

        Scanner input = new Scanner(System.in);
        
        int subjectNumbers = 0;
        System.out.println("Enter the no. of subjects");
        subjectNumbers = input.nextInt();
        input.nextLine();

        int studentNumbers = 0;
        System.out.println("Enter no. of students: ");
        studentNumbers = input.nextInt();
        input.nextLine();
        
        
        String[] subjects = new String[subjectNumbers];
        String[] students = new String[studentNumbers];
        String[][] marks = new String[studentNumbers][subjectNumbers];

        // Enter subject names
        for (int j = 0; j < subjectNumbers; j++) {
            System.out.print("Enter subject name " + (j + 1) + ": ");
            subjects[j] = input.nextLine();
        }
        //loop through students, for each add j number of subject marks
        for(int i = 0; i < studentNumbers; i++){
            System.out.println("Enter student: ");
            students[i] = input.nextLine();
            for(int j = 0; j < subjectNumbers; j++){
                System.out.print("Enter marks for " + subjects[j] + " : ");
                marks[i][j] = input.nextLine();
            } 
        }
        
        //print
        for(int i = 0; i < studentNumbers; i++){
            System.out.print(students[i] + "\t\t");
            for(int j = 0; j < subjectNumbers; j++){
                System.out.print(marks[i][j] + "\t");  
            } 
            System.out.println();
        }   
        input.close();
    }
}
