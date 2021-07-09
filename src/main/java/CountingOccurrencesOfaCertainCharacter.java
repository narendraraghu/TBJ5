import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountingOccurrencesOfaCertainCharacter {
    public static void main(String[] args) {
        String str = "narendraa";

        System.out.println(countingOccurrencesOfaEachCharacter(str));
        System.out.println(countingOccurrencesOfaCertainCharacter(str, 'a'));
        System.out.println(countingOccurrencesOfaCertainCharacterNew(str, 'a'));
    }



    private static Map<Character, Integer> countingOccurrencesOfaCertainCharacter(String str, char a) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        Set<Character> set = new HashSet<>();
        char[] arr = str.toCharArray();
        int i = 1;
        for (char c : arr) {
            if (!set.add(c) && c == a)
                characterIntegerMap.put(c, ++i);
            else   if (set.add(c) && c == a)
             characterIntegerMap.put(a, 1);
        }


        return characterIntegerMap;
    }

    private static Map<Character, Integer> countingOccurrencesOfaEachCharacter(String str) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        Set<Character> set = new HashSet<>();
        char[] arr = str.toCharArray();
        for (char c : arr) {
            int i = 1;
            if (!set.add(c))
                characterIntegerMap.put(c, ++i);
            else
                characterIntegerMap.put(c, i);
        }

        return characterIntegerMap;
    }

    private static long countingOccurrencesOfaCertainCharacterNew(String str, char ch) {
    return str.chars()
            .filter(c->c==ch)
            .count();
    }
}
