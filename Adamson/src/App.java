public class App {
    public static void main(String[] args) throws Exception {

        int[] qty = {4, 10, 9, 10};
        String[] itemDetails = { "Pencils", "Duster", "Pens","Crayon"};
        double[] unitPrice = {20.0, 50.0, 30.0, 80.0};
        double[] amount = {80.0, 500.0, 270.0, 800.0};

        System.out.println("Qty\t\tItem\t\tUnit Price\t\tAmount");

        // System.out.println("Quantity");
        // for(int i=0; i < qty.length; i++){
        //     System.out.println(qty[i]);
        // }
 
        // System.out.println("Item details");
        // for(int i=0; i < itemDetails.length; i++){
        //     System.out.println(itemDetails[i]);
        // }

        System.out.println("");

        // for(int i=0; i < qty.length; i++){
        //     for(int j=0; j < itemDetails.length; j++){
        //     System.out.println(itemDetails[j]);
        // }
        //     System.out.println(qty[i]);
        // }

        
        for(int i=0; i < qty.length; i++){
            System.out.println(qty[i] + "\t\t" + itemDetails[i] + "\t\t" + unitPrice[i] + "\t\t\t" + amount[i]);
        }
        


        
    }
}
