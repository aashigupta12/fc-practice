import java.util.Scanner;

public class FinallyRunner {
    public static void main(String[] args) {
        Scanner scn = null;
        try {
            scn = new Scanner(System.in);
            int[] numbers = {12, 3, 4, 5};

            int number = numbers[2];

            //the above line of code is causing an index out of bound exception
            //and because of that the scanner is not closing, causing leakage of the object
            //---> to not let that happen we use try, catch , finally
//            System.out.println("Before scanner close");
//            scn.close();

        } catch(Exception ex){
            ex.printStackTrace();
        } finally {
            System.out.println("Before scanner close");
            if(scn != null){
                scn.close();
            }
        }
        System.out.println("just before closing out main");
    }
}
