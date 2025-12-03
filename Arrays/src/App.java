public class App {
    public static void main(String[] args) throws Exception {
        int age1 = 40;
        int age2 = 28;
        int age3 = 17;
        int age4 = 16;

        System.out.println(age1);
        System.out.println(age2);
        System.out.println(age3);
        System.out.println(age4);
        
        int[] ages = new int[4];
        ages[0] = 40;
        ages[1] = 28;
        ages[2] = 17;
        ages[3] = 16;

        System.out.println("\nWith array declaration.");
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);

        int [] moreAges = {40, 28, 17, 16};
        System.out.println("\nWith array initialization.");
        System.out.println(moreAges[0]);
        System.out.println(moreAges[1]);
        System.out.println(moreAges[2]);
        System.out.println(moreAges[3]);

        System.out.println("\nUsing for loop.");
        for(int index = 0; index <= 3; index++){
            System.out.println(index);
        }

        System.out.println("\nWith for loop.");
        for(int i = 0; i < moreAges.length; i++){
            System.out.println(moreAges[i]);
        }
    }
}
