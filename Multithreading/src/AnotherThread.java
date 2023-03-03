public class AnotherThread extends Thread{

    public void run(){
        System.out.println(ThreadColor.ANSI_BLUE + "hello from " + currentThread().getName());

        try{
            System.out.println("sone jaa rha hu !");
            Thread.sleep(3000);
            System.out.println("Kisne utha dia?");
        } catch(InterruptedException exception){
            System.out.println(ThreadColor.ANSI_BLUE + "another thread woke me up");
            return;
        }

        System.out.println(ThreadColor.ANSI_BLUE + "Three seconds have passed and I am awake");
    }

}
