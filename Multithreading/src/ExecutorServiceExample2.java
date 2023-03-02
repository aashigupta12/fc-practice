import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// TaskNew class to be executed (Step 1)
class TaskNew implements Runnable {

    private String name;
    public TaskNew(String name){
        this.name = name;
    }
    // Prints task name and sleeps for 1s
    // This Whole process is repeated 5 times
    @Override
    public void run() {
        try{
            for(int i = 0; i <= 5; i++){
                if(i == 0){
                    Date d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Initialization Time for"
                            + " task name - " + name + " = " + ft.format(d));
                    //prints the initialization time for every task
                } else {
                    Date d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Executing Time for task name - " +
                            name + " = " + ft.format(d) );
                    // prints the execution time for every task
                }
                Thread.sleep(1000);
            }
            System.out.println(name + " complete");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


public class ExecutorServiceExample2 {

    static final int maxThreads = 3;
    public static void main(String[] args) {

        //created one task here
        Runnable r1 = new TaskNew("task1");

        // creates a thread pool with MAX_T no. of
        // threads as the fixed pool size(Step 2)
        ExecutorService pool = Executors.newFixedThreadPool(maxThreads);
        pool.execute(r1); //task1
        //created the taskNew objects passes the TaskNew objects to the pool to execute (Step 3)
        pool.execute(new TaskNew("task2"));
        pool.execute(new TaskNew("task3"));
        pool.execute(new TaskNew("task4"));
        pool.execute(new TaskNew("task5"));

        //pool shutdown(step 4)
        pool.shutdown();
    }
}
