import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FPNumberRunner {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,6,8,13,3,15);
//        numbers.stream()
//                .forEach(element -> System.out.println(element));

        int sum = FPSum(numbers);
        int sum2 = normalSum(numbers);


        System.out.println(sum);
        System.out.println(sum2);

        //printing squares of first 10
        IntStream.range(1,11).map(p -> p*p).forEach(p -> System.out.println(p));

        //add numbers ranging 1-10
        int sum3 = IntStream.range(1,11).reduce(0, (n1,n2) -> n1+n2);
        System.out.println("sum3 : " + sum3);


        Integer var = numbers.stream().max( Integer::compare).get();
        System.out.println("max : "+ var);


        //convert to lowercase
        List<String> list = List.of("APPLE", "ANT", "BAT");
        list.stream().map(e -> e.toLowerCase()).forEach(e -> System.out.println(e));

        //convert to uppercase
        List<String> list2 = List.of("apple", "ant", "bat");
        list2.stream().map(e -> e.toUpperCase()).forEach(e -> System.out.println(e));

        //length of each string
        List<String> list3 = List.of("APPLE", "ANT", "BAT");
        list.stream().map(e -> e.length()).forEach(e -> System.out.println(e));
    }

    private static int FPSum(List<Integer> numbers) {
        return numbers.stream()
//                .filter(number -> number % 2 == 1)
                .reduce(
                0, (number1,number2) -> number1+number2);
    }

    private static int normalSum(List<Integer> numbers) {
        int sum = 0;
        for(int number: numbers){
            sum = sum+number;
        }
        return sum;
    }
}
