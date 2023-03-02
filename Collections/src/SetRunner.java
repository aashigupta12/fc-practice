import java.util.*;

public class SetRunner {
    public static void main(String[] args) {
        List<Character> characters = List.of('A', 'Z','S', 'A', 'B');
        //unique- set //tree
        //hash
        //Insertion order - linkedHash

        Set<Character> treeSet = new TreeSet<>(characters);
        System.out.println("sorted order " + treeSet); //[A,B,S,Z]

        Set<Character> linkedhash = new LinkedHashSet<>(characters);
        System.out.println("insertion order "+linkedhash);

        Set<Character> hashset = new HashSet<>(characters);
        System.out.println("any order "+ hashset);
    }
}
