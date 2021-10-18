import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class DistinctCharacterInAWord {
    public static void main(String[] args) {
        System.out.println(haveDistinctWords(Collections.singletonList("narendra r")));
    }

    private static boolean haveDistinctWords(List<String> str) {
        System.out.println(str.stream().distinct().count());
        return true;
    }
}
