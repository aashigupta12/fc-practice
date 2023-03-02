import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticePuzzles {
    public static void main(String[] args) {
        List value = List.of("A", 'A', 1, 1.0);
        System.out.println(value.get(2));

        var b = value.get(0) instanceof String;
        System.out.println(b); // false

        var c = value.get(2) instanceof Integer;
        System.out.println(c); // true

        var a = value.get(1) instanceof Character;
        System.out.println(a);

        var d = value.get(3) instanceof Double;
        System.out.println(d);

//        List<String> list = List.of("A", 'A', 1); //CANNOT STORE CH, INT FOR STRING VALUES

        List<Integer> numbers = List.of(101,102,103);
        System.out.println(numbers.indexOf(101));

        List<Integer> numbersAl = new ArrayList<>(numbers);
        System.out.println(numbersAl); //101,102,103

        numbersAl.remove(1); //if u want to remove using index
        System.out.println(numbersAl);

        numbersAl.remove(Integer.valueOf(103)); //if using number value
        System.out.println(numbersAl);

        List<Integer> num = List.of(123,12,4,45);
        List<Integer> numAl = new ArrayList<>(num);
        System.out.println(numAl);


        Collections.sort(numAl);
        System.out.println(numAl); //sorted array

    }
}
