public class AnotherThread extends Thread{

    public void run(){
        System.out.println(ThreadColor.ANSI_BLUE + "hello from " + currentThread().getName());

        try{
            Thread.sleep(3000);
        } catch(InterruptedException exception){
            System.out.println(ThreadColor.ANSI_BLUE + "another thread woke me up");
        }

        System.out.println(ThreadColor.ANSI_BLUE + "Three seconds have passed and I am awake");
    }

}
