import java.util.HashMap;
import java.util.Map;

public class MapRunner {
    public static void main(String[] args) {
        String str = "This is a collections section." +
                     "I have studies collections before.";

        Map<Character, Integer> occurrences = new HashMap<>();
        char[] characters = str.toCharArray();

        for(char character: characters){
            //get the character
            Integer integer = occurrences.get(character);
            //if it s there, we increment the count
            //if not, initialize to 1
            if(integer == null){
                occurrences.put(character, 1);
            } else {
                occurrences.put(character, integer+1);
            }
        }
        System.out.println(occurrences);


        Map<String, Integer> stringOccurrences = new HashMap<>();
        String[] words = str.split(" ");

        for(String word: words){
            Integer integer2 = stringOccurrences.get(word);
            if(integer2 == null){
                stringOccurrences.put(word,1);
            } else {
                stringOccurrences.put(word, integer2+1);
            }
        }
        System.out.println(stringOccurrences);
    }
}
