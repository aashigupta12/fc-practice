
public class Main {

    public static void main(String[] args) {
        Countdown countdown = new Countdown();

        CountdownThread t1 = new CountdownThread(countdown);
        t1.setName("Thread 1");
        CountdownThread t2 = new CountdownThread(countdown);
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}

//heap - application's memory that all threads share
//every thread has a thread stack and that's memory only that thread can access. Meaning -
//thread1 cant access thread2's thread stack & vice-versa, but they can both access the heap.

//local variables stored in thread stack, meaning each thread has own copy pf local variable
//in contrast, the memory required to tore an object's instance value is allocated on heap
//multiple threads working w same obj, in fact share the same obj or share that obj
//So they don't hae their own copy as such, so when one thread changes the value of one of the obj's instance var
//the other threads will see the new value from that point forward

//but to solve this , we created entirely diff obj for both the threads : not feasible
//therefore "synchronized method using synchronized keyword" : one thread finishes in the entire thread/entire method
// before thread2 get the chance to do the same

class Countdown {

    private int i;
//    (instance variable) //caused thread interference
    //race condition : when 2 or more threads are writing a shared resource

    public void doCountdown() {
        String color;

        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColor.ANSI_RED;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_PURPLE;
                break;
            default:
                color = ThreadColor.ANSI_GREEN;
        }

        //local variable
//        int i;
        synchronized (this) {
            for (i = 10; i > 0; i--) {
                System.out.println(color + Thread.currentThread().getName() + ": i = " + i);
            }
        }
    }
}

class CountdownThread extends Thread {
    private Countdown threadCountdown;

    public CountdownThread(Countdown countdown){
        threadCountdown = countdown;
    }

    @Override
    public void run() {
        threadCountdown.doCountdown();
    }
}

//synchronization is re-entrant
//if a thread acquires an object's lock & within a synchronized code ,
// it calls a method that using the same object to synchronize some code.