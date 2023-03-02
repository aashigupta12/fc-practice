import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer>{

    @Override
    public boolean test(Integer number) {
        return number%2 == 0;
    }
}

//    public abstract void forEach(     java.util.function.Consumer<? super T> action )
class SystemOutConsumer implements Consumer<Integer>{

    @Override
    public void accept(Integer number) {
        System.out.println(number);
    }
}

class NumberSqMapper implements Function<Integer, Integer>{

    @Override
    public Integer apply(Integer number) {
        return number * number;
    }
}
public class LambdaBehindTheScreenRunner {

    public static void main(String[] args) {
        //1.Storing functions in variables
        //2.passing functions to methods
        //3.returning functions from methods

        Predicate<Integer> evenPredicate = n -> n % 2 == 0;
        Predicate<Integer> oddPredicate = n -> n % 2 == 0;

        List.of(23,43,34,45, 36, 48).stream()
                //1.Storing functions in variables
                .filter(evenPredicate)
                .map(n -> n*n)
                .forEach(e -> System.out.println(e));

        //background of filter & map & forEach
        List.of(23,43,34,45, 36, 48).stream()
                .filter(new EvenNumberPredicate())
                .map(new NumberSqMapper())
                .forEach(new SystemOutConsumer());

        //.filter(new EvenNumberPredicate())
        //Stream<T> filter(Predicate<? super T> predicate )
        //boolean test(T t )

        //.forEach(e -> new PrintPredicate());
        //Consumer<? super T> action
        //void accept(T t);

//      map(n -> n*n)
//      <R> Stream<R> map(Function<? super T, ? extends R> mapper )
        //R apply(T t)
    }
}
