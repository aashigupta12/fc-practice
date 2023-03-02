import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class MethodReferences {

    public static void print(Integer number){
        System.out.println(number);
    }
    public static void main(String[] args) {


        List.of("Ant", "Bat", "cat", "dog", "elephant")
                .stream()
                .map(l -> l.length())
                .forEach(l -> System.out.println(l));

        System.out.println();

        List.of("Ant", "Bat", "cat", "dog", "elephant")
                .stream()
                .map(String::length)
//                .forEach(System.out::println);
                .forEach(MethodReferences::print);
    }
}
