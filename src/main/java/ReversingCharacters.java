public class ReversingCharacters {


    public static void main(String[] args) {
        String str = "narendra";

        System.out.println(reversingLetters(str));
        System.out.println(reversingString(str));
}


    private static String reversingLetters(String str) {
        char [] arr = str.toCharArray();
        char [] ar = new char[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            ar[i] = arr[arr.length-1-i];
        }
       return String.valueOf(ar);
    }

    private static StringBuilder reversingString(String str) {
        return new StringBuilder(str).reverse();
    }


}
