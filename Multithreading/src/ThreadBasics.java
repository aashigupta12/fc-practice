
//methods for creating thread
//1) extend thread
//2) implements Runnable


class Task1 extends Thread{
    public void run(){ //SIGNATURE should exactly match this

        System.out.println("\n task1 started");
        for(int i= 101; i<=199; i++)
            System.out.print(i + " ");

//        Thread.yield();

        System.out.println("\nTask1 Done");
    }
}


class Task2 extends Thread{
    @Override
    public void run() {
        System.out.println("\n Task 2 started");
        for(int i = 201; i<=299; i++){
            System.out.print(i + " ");
        }
        System.out.println("\nTask2 Done");
    }
}

//class Task2 extends Thread {
//    public void run() {
//        System.out.println("\n Task 2 started");
//        for (int i = 201; i <= 299; i++) {
//            System.out.print(i + " ");
//        }
//
//        System.out.println("\nTask2 Done");
//    }
//}
public class ThreadBasics {
    public static void main(String[] args) throws InterruptedException {
        //Task1 - 101-199
        System.out.println("\n task1 kicked off");

        Task1 task1 = new Task1(); //NEW
        task1.setPriority(1);
        task1.start(); //task1.run() -> typical execution

        //Task2
        System.out.println("\n task2 kicked off");

        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2); //NEW
        task2Thread.setPriority(10);
        task2Thread.start();

        //wait for task1 to complete before task3 being kicked off
        task1.join();
        //now task2 is also executed and done before task3
        task2Thread.join();

        //Task3 ->not a thread
        System.out.println("\n task3 kicked off");
        for (int i = 301; i <= 399; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\nTask3 Done");

        System.out.print("\nMain Method Done");
    }
}
