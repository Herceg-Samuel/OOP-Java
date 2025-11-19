
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String billToName, billToNumber, billToLocation, billToCode, billToContact, billToEmail;
        String shipToName, shipToNumber, shipToLocation, shipToCode, shipToContact, shipToEmail;

        System.out.print("Enter bill to name: ");
        billToName = input.nextLine();

        System.out.print("Enter bill to number: ");
        billToNumber = input.nextLine();

        System.out.print("Enter bill to location: ");
        billToLocation = input.nextLine();

        System.out.print("Enter bill to code: ");
        billToCode = input.nextLine();

        System.out.print("Enter bill to contact: ");
        billToContact = input.nextLine();

        System.out.print("Enter bill to email: ");
        billToEmail = input.nextLine();

        System.out.println(); // spacing

        System.out.print("Enter ship to name: ");
        shipToName = input.nextLine();

        System.out.print("Enter ship to number/address line: ");
        shipToNumber = input.nextLine();

        System.out.print("Enter ship to location: ");
        shipToLocation = input.nextLine();

        System.out.print("Enter ship to postal code: ");
        shipToCode = input.nextLine();

        System.out.print("Enter ship to contact: ");
        shipToContact = input.nextLine();

        System.out.print("Enter ship to email: ");
        shipToEmail = input.nextLine();


        //Bill To Information, Ship To Information and Product Information.
        //The discount value is 0.6368%
        //PRODUCT1 INFO
        int p1SerialNumber, p1Code, p1HsnCode, p1Quantity, p1Tax;
        System.out.println("Enter product serial number");
        p1SerialNumber = input.nextInt();
        System.out.println("Enter product code");
        p1Code = input.nextInt();
        System.out.println("Enter product HSN1 code");
        p1HsnCode = input.nextInt();
        System.out.println("Enter product quantity");
        p1Quantity = input.nextInt();
        System.out.println("Enter product tax");
        p1Tax = input.nextInt();
        input.nextLine();

        String p1Name, p1Units;
        System.out.println("Enter product name");
        p1Name = input.nextLine();
        System.out.println("Enter product units");
        p1Units = input.nextLine();
        input.nextLine();

        double p1Rate;
        System.out.println("Enter rate");
        p1Rate = input.nextDouble();
        input.nextLine();

        //PRODUCT2 INFO
        int p2SerialNumber, p2Code, p2HsnCode, p2Quantity, p2Tax;
        System.out.println("Enter product serial number");
        p2SerialNumber = input.nextInt();
        System.out.println("Enter product code");
        p2Code = input.nextInt();
        System.out.println("Enter product HSN1 code");
        p2HsnCode = input.nextInt();
        System.out.println("Enter product quantity");
        p2Quantity = input.nextInt();
        System.out.println("Enter product tax");
        p2Tax = input.nextInt();
        input.nextLine();

        String p2Name, p2Units;
        System.out.println("Enter product name");
        p2Name = input.nextLine();
        System.out.println("Enter product units");
        p2Units = input.nextLine();
        input.nextLine();

        double p2Rate;
        System.out.println("Enter rate");
        p2Rate = input.nextDouble();
        input.nextLine();

        //PRODUCT3 INFO
        int p3SerialNumber, p3Code, p3HsnCode, p3Quantity, p3Tax;
        System.out.println("Enter product serial number");
        p3SerialNumber = input.nextInt();
        System.out.println("Enter product code");
        p3Code = input.nextInt();
        System.out.println("Enter product HSN1 code");
        p3HsnCode = input.nextInt();
        System.out.println("Enter product quantity");
        p3Quantity = input.nextInt();
        System.out.println("Enter product tax");
        p3Tax = input.nextInt();
        input.nextLine();

        String p3Name, p3Units;
        System.out.println("Enter product name");
        p3Name = input.nextLine();
        System.out.println("Enter product units");
        p3Units = input.nextLine();
        input.nextLine();

        double p3Rate;
        System.out.println("Enter rate");
        p3Rate = input.nextDouble();
        input.nextLine();

        // PRODUCT4 INFO
        int p4SerialNumber, p4Code, p4HsnCode, p4Quantity, p4Tax;
        System.out.println("Enter product serial number");
        p4SerialNumber = input.nextInt();
        System.out.println("Enter product code");
        p4Code = input.nextInt();
        System.out.println("Enter product HSN1 code");
        p4HsnCode = input.nextInt();
        System.out.println("Enter product quantity");
        p4Quantity = input.nextInt();
        System.out.println("Enter product tax");
        p4Tax = input.nextInt();
        input.nextLine();

        String p4Name, p4Units;
        System.out.println("Enter product name");
        p4Name = input.nextLine();
        System.out.println("Enter product units");
        p4Units = input.nextLine();
        input.nextLine();

        double p4Rate;
        System.out.println("Enter rate");
        p4Rate = input.nextDouble();
        input.nextLine();

// PRODUCT5 INFO
        int p5SerialNumber, p5Code, p5HsnCode, p5Quantity, p5Tax;
        System.out.println("Enter product serial number");
        p5SerialNumber = input.nextInt();
        System.out.println("Enter product code");
        p5Code = input.nextInt();
        System.out.println("Enter product HSN1 code");
        p5HsnCode = input.nextInt();
        System.out.println("Enter product quantity");
        p5Quantity = input.nextInt();
        System.out.println("Enter product tax");
        p5Tax = input.nextInt();
        input.nextLine();

        String p5Name, p5Units;
        System.out.println("Enter product name");
        p5Name = input.nextLine();
        System.out.println("Enter product units");
        p5Units = input.nextLine();
        input.nextLine();

        double p5Rate;
        System.out.println("Enter rate");
        p5Rate = input.nextDouble();
        input.nextLine();

// PRODUCT6 INFO
        int p6SerialNumber, p6Code, p6HsnCode, p6Quantity, p6Tax;
        System.out.println("Enter product serial number");
        p6SerialNumber = input.nextInt();
        System.out.println("Enter product code");
        p6Code = input.nextInt();
        System.out.println("Enter product HSN1 code");
        p6HsnCode = input.nextInt();
        System.out.println("Enter product quantity");
        p6Quantity = input.nextInt();
        System.out.println("Enter product tax");
        p6Tax = input.nextInt();
        input.nextLine();

        String p6Name, p6Units;
        System.out.println("Enter product name");
        p6Name = input.nextLine();
        System.out.println("Enter product units");
        p6Units = input.nextLine();
        input.nextLine();

        double p6Rate;
        System.out.println("Enter rate");
        p6Rate = input.nextDouble();
        input.nextLine();

// PRODUCT7 INFO
        int p7SerialNumber, p7Code, p7HsnCode, p7Quantity, p7Tax;
        System.out.println("Enter product serial number");
        p7SerialNumber = input.nextInt();
        System.out.println("Enter product code");
        p7Code = input.nextInt();
        System.out.println("Enter product HSN1 code");
        p7HsnCode = input.nextInt();
        System.out.println("Enter product quantity");
        p7Quantity = input.nextInt();
        System.out.println("Enter product tax");
        p7Tax = input.nextInt();
        input.nextLine(); // Consume leftover newline

        String p7Name, p7Units;
        System.out.println("Enter product name");
        p7Name = input.nextLine();
        System.out.println("Enter product units");
        p7Units = input.nextLine();

        double p7Rate;
        System.out.println("Enter rate");
        p7Rate = input.nextDouble();
        input.nextLine();


        double baseAmt1 = p1Quantity * p1Rate;
        double taxAmt1 = baseAmt1 * p1Tax / 100.0;
        double amount1 = baseAmt1 + taxAmt1;

        double baseAmt2 = p2Quantity * p1Rate;
        double taxAmt2 = baseAmt2 * p2Tax/ 100.0;
        double amount2 = baseAmt2 + taxAmt2;

        double baseAmt3 = p3Quantity * p1Rate;
        double taxAmt3 = baseAmt3 * p3Tax/ 100.0;
        double amount3 = baseAmt3 + taxAmt3;

        double baseAmt4 = p4Quantity * p1Rate;
        double taxAmt4 = baseAmt4 * p4Tax / 100.0;
        double amount4 = baseAmt4 + taxAmt4;

        double baseAmt5 = p5Quantity * p1Rate;
        double taxAmt5 = baseAmt5 * p5Tax / 100.0;
        double amount5 = baseAmt5 + taxAmt5;

        double baseAmt6 = p6Quantity * p1Rate;
        double taxAmt6 = baseAmt6 * p6Tax / 100.0;
        double amount6 = baseAmt6 + taxAmt6;

        double baseAmt7 = p7Quantity * p1Rate;
        double taxAmt7 = baseAmt7 * p7Tax / 100.0;
        double amount7 = baseAmt7 + taxAmt7;

        double total = amount1 + amount2 + amount3 + amount4 + amount5 + amount6 + amount7;
        double discountPercent = 0.6368;
        double discountAmount = total * discountPercent / 100.0;
        double grandTotal = total - discountAmount;



        System.out.println("\n\n");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("                              INVOICE                                           ");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Bill To:                                    Ship To:");
        System.out.println(billToName + "                          " + shipToName);
        System.out.println(billToNumber + "                    " + shipToNumber);
        System.out.println(billToLocation + "              " + shipToLocation);
        System.out.println("GSTIN: " + billToCode + "                         GSTIN: " + shipToCode);
        System.out.println("Contact: " + billToContact + "                   Contact: " + shipToContact);
        System.out.println("Email: " + billToEmail + "        Email: " + shipToEmail);
        System.out.println();
        System.out.println("Payment Date: 7 days from days of delivery           Payment Terms: 100% against invoice");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("S.No  Code   Product Name        HSN Code    Qty  Units   Rate     Tax   Amount");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("  " + p1SerialNumber + "     " + p1Code + "   " + p1Name + "       " + p1HsnCode + "   " + p1Quantity + "   " + p1Units + "    " + p1Rate + "   " + p1Tax + "%   " + amount1);
        System.out.println("  " + p2SerialNumber + "    " + p2Code + "   " + p2Name + "            " + p2HsnCode + "   " + p2Quantity + "   " + p2Units + "    " + p2Rate + "    " + p2Tax + "%   " + amount2);
        System.out.println("  " + p3SerialNumber + "   " + p3Code + "   " + p3Name + "   " + p3HsnCode + "   " + p3Quantity + "   " + p3Units + "    " + p3Rate + "    " + p3Tax+ "%   " + amount3);
        System.out.println("  " + p4SerialNumber + "     " + p4Code + "   " + p4Name + "      " + p4HsnCode + "   " + p4Quantity + "   " + p4Units + "    " + p4Rate + "    " + p4Tax + "%   " + amount4);
        System.out.println("  " + p5SerialNumber + "     " + p5Code + "   " + p5Name + "     " + p5HsnCode + "   " + p5Quantity + "   " + p5Units + "    " + p5Rate + "    " + p5Tax + "%   " + amount5);
        System.out.println("  " + p6SerialNumber + "     " + p6Code + "   " + p6Name + "       " + p6HsnCode + "    " + p6Quantity + "   " + p6Units + "    " + p6Rate + "    " + p6Tax + "%   " + amount6);
        System.out.println("  " + p7SerialNumber + "     " + p7Code + "   " + p7Name + "   " + p7HsnCode + "   " + p7Quantity + "   " + p7Units + "    " + p7Rate + "    " + p7Tax + "%  " + amount7);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("                                                         Total        " + total);
        System.out.println("                                                         Discounts    " + discountAmount);
        System.out.println("                                                         Grand total  " + grandTotal);
        System.out.println("--------------------------------------------------------------------------------");

        print.close();
    }
}