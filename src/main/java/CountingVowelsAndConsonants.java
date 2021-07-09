import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.partitioningBy;

public class CountingVowelsAndConsonants {
    public static void main(String[] args) {
        String str = "narendra1";
        System.out.println(countingVowelsAndConsonants(str));
       // System.out.println(countingVowelsAndConsonantsNew(str));
    }



    private static boolean countingVowelsAndConsonants(String str) {

        char[] arr =str.toCharArray();
        int countVowels = 0;
        int countConstant=0;
        for (char c:arr  ) {

            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            countVowels++;
            else if(c>='a'&&c<='z') countConstant++;

        }
        System.out.println("countVowels "+countVowels +" & countConstant "+countConstant);
    return true;
    }

    //Advance method

//    private static boolean countingVowelsAndConsonantsNew(String str) {
//        Map<Boolean,Integer> res = str.chars()
//                .mapToObj(c-> (char) c)
//                .filter(ch->(ch>='a'&&ch<='z'))
//                .collect(partitioningBy(c -> allVowels.contains(c),counting()));
//
//        return Pair.of(res.get(true),res.get(false));
//    }

}
