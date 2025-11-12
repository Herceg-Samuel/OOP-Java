import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);


        int price1;
        int price2;
        int price3;
        int price4;
        int price5;
        int total;
        double avg;

        System.out.println("Enter price 1:");
        price1 = input.nextInt();

        System.out.println("Enter price 2:");
        price2 = input.nextInt();

        System.out.println("Enter price 3:");
        price3 = input.nextInt();

        System.out.println("Enter price 4:");
        price4 = input.nextInt();

        System.out.println("Enter price 5:");
        price5 = input.nextInt();

        total = price1 + price2 + price3 + price4 + price5;
        avg = total / 5.0;
        
        System.out.println("Price Total:" + total);
        System.out.println("Price Average:" + avg);

        input.close();

    }
}
