public class Main {
    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_PURPLE + " hello from main thread");

        //first create instance of a thread
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== AnotherMethod ==");
        anotherThread.start();
//        anotherThread.run();

//        new Thread(){
//            @Override
//            public void run() {
//                System.out.println(ThreadColor.ANSI_GREEN + " hello from anonymous classroom");
//            }
//        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable(){
            @Override
            public void run() {
//                super.run();
                System.out.println(ThreadColor.ANSI_CYAN + " hello from anonymous class's implementation of run");

                try{
                    anotherThread.join(2000);
                    System.out.println(ThreadColor.ANSI_RED + "AnotherThread terminated or timed out, so I m running again");
                }catch(InterruptedException ex){
                    System.out.println(ThreadColor.ANSI_RED + " I couldn't wait after all. I was interrupted");
                }
            }
        });
        myRunnableThread.start();
//        anotherThread.interrupt();


//        System.out.println("hello again from main thread");



    }
}