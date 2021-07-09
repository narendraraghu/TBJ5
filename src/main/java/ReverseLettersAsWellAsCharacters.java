public class ReverseLettersAsWellAsCharacters {
    public static void main(String[] args) {
        String str = "Narendra is Coding Ninja";
        System.out.println(reversingLetters(str));
    }

    private static StringBuilder reversingLetters(String str) {
        String s[] = str.split(" ");

        StringBuilder ans = new StringBuilder();
        for (int i = s.length - 1; i >= 0; i--) {

            char [] arr = s[i].toCharArray();
            char [] ar = new char[arr.length];
            for (int j = 0; j < arr.length ; j++) {
                ar[j] = arr[arr.length-1-j];

            }
            ans.append(ar).append(" ");
        }
        return ans;
    }
}
