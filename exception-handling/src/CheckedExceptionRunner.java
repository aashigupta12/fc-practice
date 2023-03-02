public class CheckedExceptionRunner {
    public static void main(String[] args) {
//        try{
//            someOtherMethod();
//            Thread.sleep(2000);
//            //either handle it
//        } catch(InterruptedException e){
//            e.printStackTrace();
//        }
        someOtherMethod2();
    }

    private static void someOtherMethod2() throws RuntimeException{

    }
    //or throws it because something is risky
    private static void someOtherMethod() throws InterruptedException {

        Thread.sleep(2000);
    }
}
