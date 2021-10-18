import java.util.*;

public class AllPossiblePermutationOfAWord {

    static void permute(String str , String answer)
    {
        if (str.length() == 0)
        {
            System.out.print(answer + " ");
            return;
        }

        for(int i = 0 ;i < str.length(); i++)
        {
            char ch = str.charAt(i);
            String left_substr = str.substring(0, i);
            String right_substr = str.substring(i + 1);
            String rest = left_substr + right_substr;
            permute(rest, answer + ch);
        }
    }

    // Driver code
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        String s;
        String answer="";

        System.out.print("Enter the string : ");
        s = scan.next();

        System.out.print("\nAll possible strings are : ");
        permute(s, answer);
    }
}
