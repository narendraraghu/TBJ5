import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CountingDuplicateCharacter {
    public static void main(String[] args) {
        String str = "nitin";
        System.out.println(countDuplicateCharacter(str));
        System.out.println(countDuplicateCharacters(str));
    }

    private static int countDuplicateCharacter(String str) {
        char[] arr = str.toCharArray();
        Set<Character> set = new HashSet<>();
        int count = 0;
        for (char c : arr) {
            if (!set.add(c))
                 count++;

        }
        return count;
    }

//    Optimized
public static Map<String, Long> countDuplicateCharacters(String str) {

    Map<String, Long> result = str.chars()
            .mapToObj(c -> String.valueOf(Character.toChars(c)))
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

    return result;
}
}
