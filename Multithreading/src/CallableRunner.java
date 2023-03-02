import java.util.concurrent.*;

//for implementing a task which returns value,
//we have to implement a callable interface
class CallableTask implements Callable<String>{

    private String name;

    public CallableTask(String name){
        this.name = name;
    }
    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Hello " + name;
    }
}

public class CallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(1);

        //submit can be used to execute a callableTask
        Future<String> future =
                executorService.submit(new CallableTask("Aashiii"));
//        System.out.print("\n new CallableTask(\"Aashiii\")");
        String welcomeMessage = future.get();
        System.out.println(welcomeMessage);

        System.out.print("\n  main completed");

        executorService.shutdown();
    }
}
