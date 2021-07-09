import javax.swing.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindingFirstNonRepeatedCharacter {

    public static void main(String[] args) {
        String str = "narendra";

        System.out.println(findFirstNonRepChar(str));
        System.out.println(firstNonRepeatedCharacter(str));
    }

    private static char findFirstNonRepChar(String str) {
        char[] arr = str.toCharArray();
        for (char c : arr) {
            for (int i = 1; i < arr.length; i++) {
                if (c != arr[i])
                    i++;
                else
                    return c;
            }
        }
            return 'A';

    }

    public static String firstNonRepeatedCharacter(String str) {

        Map<Integer, Long> chs = str.codePoints()
                .mapToObj(cp -> cp)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting()));

        int cp = chs.entrySet().stream()
                .filter(e -> e.getValue() == 1L)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(Integer.valueOf(Character.MIN_VALUE));

        return String.valueOf(Character.toChars(cp));
    }
}
