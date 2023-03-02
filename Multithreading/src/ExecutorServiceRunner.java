import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


//this enables us to kick-off a lot of threads
class Task extends Thread{

    private int number;
    public Task(int number){
        this.number = number;
    }

    public void run(){ //SIGNATURE should exactly match this
        System.out.println("\n task" + number + " started");
        for(int i = number*100; i <= number*100 + 99; i++)
            System.out.print(i + " ");

//        Thread.yield();

        System.out.println("\nTask " + number +  " Done");
    }
}
public class ExecutorServiceRunner {
    public static void main(String[] args) {

        //provides facility to execute one thread at a time
        //newSingleThreadExecutor -> it only execute one thread at a time
//        ExecutorService executorService = Executors.newSingleThreadExecutor();

        //n threads are active at any pt of time,
//         as soon of the thread task is done
        //then another also start and so on , but ek time par 5 hi running onge
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new Task(1));
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));
        executorService.execute(new Task(4));
        executorService.execute(new Task(5));
        executorService.execute(new Task(6));
        executorService.execute(new Task(7));

        executorService.shutdown();
    }
}
