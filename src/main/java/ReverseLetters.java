public class ReverseLetters {
    public static void main(String[] args) {
        String str = "Narendra is Coding Ninja";
        System.out.println(reversingLetters(str));
    }

    private static StringBuilder reversingLetters(String str) {
        String s[] = str.split(" ");
        StringBuilder ans = new StringBuilder();
        for (int i = s.length - 1; i >= 0; i--) {

            ans.append(s[i]).append(" ");
        }
        return ans;
    }
}
