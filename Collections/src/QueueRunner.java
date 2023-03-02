import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String val1, String val2) {
        //lower length is processing first
//        return Integer.compare(val1.length(), val2.length());
        //higher length is processing first
        return Integer.compare(val2.length(), val1.length());
    }
}
public class QueueRunner {

    //comparator
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
        System.out.println(queue.poll()); //null

        queue.addAll(List.of("Zebra", "Monkey", "Cat"));
        System.out.println(queue);
        System.out.println(queue.poll()); //remove first
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());



    }
}
