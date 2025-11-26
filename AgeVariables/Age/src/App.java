import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;

        System.out.println("Enter your name : ");
        name = scanner.nextLine();

        System.out.println("Enter your age : ");
        age = scanner.nextInt();

        System.out.println("Name :" + name);
        System.out.println("Name :" + age);

        scanner.close();
        
    }
}
