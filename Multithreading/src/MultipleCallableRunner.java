import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<CallableTask> tasks = List.of(new CallableTask("Aashi"),
                new CallableTask("Yash"),
                new CallableTask("FreeCharge"));

        List<Future<String>> futures =  executorService.invokeAll(tasks);
        for(Future<String> future: futures){
            System.out.println(future.get());
        }

        executorService.shutdown();
    }
}
