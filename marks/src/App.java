import java.util.Scanner;
public class App {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter Student 1 Registration Number:");
        String student1regno = input.nextLine();
        System.out.println("Enter Student 1 Full name:");
        String fullname1 = input.nextLine();
        System.out.println("Enter marks for 7 units:");
        int mark1_1 = input.nextInt();
        int mark1_2 = input.nextInt();
        int mark1_3 = input.nextInt();
        int mark1_4 = input.nextInt();
        int mark1_5 = input.nextInt();
        int mark1_6 = input.nextInt();
        int mark1_7 = input.nextInt();
        int totalmarks1 = mark1_1  + mark1_2 + mark1_3 + mark1_4 + mark1_5 + mark1_6 +  mark1_7;
        int averagemarks1 = totalmarks1 / 7;
        input.nextLine();

        System.out.println("Enter Student 2 Registration Number:");
        String student2regno = input.nextLine();
        System.out.println("Enter Student 2 Full name:");
        String fullname2 = input.nextLine();
        System.out.println("Enter marks for 7 units:");
        int mark2_1 = input.nextInt();
        int mark2_2 = input.nextInt();
        int mark2_3 = input.nextInt();
        int mark2_4 = input.nextInt();
        int mark2_5 = input.nextInt();
        int mark2_6 = input.nextInt();
        int mark2_7 = input.nextInt();
        int totalmarks2 = mark2_1 + mark2_2 + mark2_3 + mark2_4 + mark2_5 + mark2_6 +   mark2_7;
        int averagemarks2 = totalmarks2 / 7;
        input.nextLine();

        System.out.println("Enter Student 3 Registration Number:");
        String student3regno = input.nextLine();
        System.out.println("Enter Student 3 Full name:");
        String fullname3 = input.nextLine();
        System.out.println("Enter marks for 7 units:");
        int mark3_1 = input.nextInt();
        int mark3_2 = input.nextInt();
        int mark3_3 = input.nextInt();
        int mark3_4 = input.nextInt();
        int mark3_5 = input.nextInt();
        int mark3_6 = input.nextInt();
        int mark3_7 = input.nextInt();
        int totalmarks3 = mark3_1 + mark3_2 + mark3_3 + mark3_4 + mark3_5 + mark3_6 +   mark3_7;
        int averagemarks3 = totalmarks3 / 7;
        input.nextLine();

        System.out.println("Enter Student 4 Registration Number:");
        String student4regno = input.nextLine();
        System.out.println("Enter Student 4 Full name:");
        String fullname4 = input.nextLine();
        System.out.println("Enter marks for 7 units:");
        int mark4_1 = input.nextInt();
        int mark4_2 = input.nextInt();
        int mark4_3 = input.nextInt();
        int mark4_4 = input.nextInt();
        int mark4_5 = input.nextInt();
        int mark4_6 = input.nextInt();
        int mark4_7 = input.nextInt();
        int totalmarks4 = mark4_1 + mark4_2 + mark4_3 + mark4_4 + mark4_5 + mark4_6 +  mark4_7;
        int averagemarks4 = totalmarks4 / 7;
        input.nextLine();

        System.out.println("Enter Student 5 Registration Number:");
        String student5regno = input.nextLine();
        System.out.println("Enter Student 5 Full name:");
        String fullname5 = input.nextLine();
        System.out.println("Enter marks for 7 units:");
        int mark5_1 = input.nextInt();
        int mark5_2 = input.nextInt();
        int mark5_3 = input.nextInt();
        int mark5_4 = input.nextInt();
        int mark5_5 = input.nextInt();
        int mark5_6 = input.nextInt();
        int mark5_7 = input.nextInt();
        int totalmarks5 = mark5_1 + mark5_2 + mark5_3 + mark5_4 + mark5_5 + mark5_6 +   mark5_7;
        int averagemarks5 = totalmarks5 / 7;
        input.nextLine();


        System.out.println("                                               Dedan Kimathi University of Technology");
        System.out.println("                                                  School of Computer Science and IT");
        System.out.println("                                                    Department of Computer Science");
        System.out.println("                                                       Academic Year: 2024/2025");
        System.out.println("                                                STUDENTS MARKSHEET(SECOND YEAR RESULTS)");
        System.out.println("                                                          Student Score sheet") ;
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Reg No.\t\t\t\t\tFull name\t\tCCS 2211\tCCS 2212\tCCS 2213\tCCS 2214\tCCS 2215\tCCS 2216\tCCS 2217\tTotal\tAverage\tSTATUS GRADE");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(student1regno + "  \t\t" + fullname1 + "  \t\t" + mark1_1 + "  \t\t" + mark1_2 + "  \t\t" + mark1_3 + "   \t\t" + mark1_4 + " \t\t\t" + mark1_5 + " \t\t\t" + mark1_6 + " \t\t\t" + mark1_7 + "\t\t" + totalmarks1 + " \t" + averagemarks1);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println(student2regno + "  \t\t" + fullname2 + "  \t\t" + mark2_1 + "  \t\t" + mark2_2 + "  \t\t" + mark2_3 + "   \t\t" + mark2_4 + " \t\t\t" + mark2_5 + " \t\t\t" + mark2_6 + " \t\t\t" + mark2_7 + "\t\t" + totalmarks2 + " \t" + averagemarks2);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println(student3regno + "  \t\t" + fullname3 + "  \t\t" + mark3_1 + "  \t\t" + mark3_2 + "  \t\t" + mark3_3 + "   \t\t" + mark3_4 + " \t\t\t" + mark3_5 + " \t\t\t" + mark3_6 + " \t\t\t" + mark3_7 + "\t\t" + totalmarks3 + " \t" + averagemarks3);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println(student4regno + "  \t\t" + fullname4 + "  \t\t" + mark4_1 + "  \t\t" + mark4_2 + "  \t\t" + mark4_3 + "   \t\t" + mark4_4 + " \t\t\t" + mark4_5 + " \t\t\t" + mark4_6 + " \t\t\t" + mark4_7 + "\t\t" + totalmarks4 + " \t" + averagemarks4);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println(student5regno + "  \t\t" + fullname5 + "  \t\t" + mark5_1 + "  \t\t" + mark5_2 + "  \t\t" + mark5_3 + "   \t\t" + mark5_4 + " \t\t\t" + mark5_5 + " \t\t\t" + mark5_6 + " \t\t\t" + mark5_7 + "\t\t" + totalmarks5 + " \t" + averagemarks5);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        input.close();
    }
}