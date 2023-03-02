public class ExceptionHandlingRunner2 {
    public static void main(String[] args) {
        method1();
        System.out.println("main ended");
    }

    private static void method1() {
        method2();
        System.out.println("method1 ended");
    }

    private static void method2() {
        try{
//            String str = null;
//            str.length(); //null pointer exception

            int[] i = {1,2};
            int number  = i[3];
            System.out.println("method2 ended");
        } catch(NullPointerException ex) {
            System.out.println("null pointer exception");
            ex.printStackTrace(); //exception is caught and shown and handled in here

        }catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("array out of bound exception");
            ex.printStackTrace(); //exception is caught and shown and handled in here

        } catch(Exception ex) {   //generic exception - not  a specific one
            System.out.println(" exception");
            ex.printStackTrace(); //exception is caught and shown and handled in here
        }

    }
}
