import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Practice {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.execute(new MyRunnable() {
            public void run() {
                System.out.println("Asynchronous task");
            }
        });

        executorService.shutdown();
    }
}


