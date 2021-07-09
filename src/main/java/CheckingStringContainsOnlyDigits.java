public class CheckingStringContainsOnlyDigits {

    public static void main(String[] args) {
        String str = "1234";

        System.out.println(checkingStringContainsOnlyDigits(str));
        System.out.println(checkingStringContainsOnlyDigitsNew(str));
        System.out.println(containsOnlyDigitsNew(str));
    }


    //My waste solution
    private static boolean checkingStringContainsOnlyDigits(String str) {
        char[] arr = str.toCharArray();
        char[] notNumber;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 47 && arr[i] < 58) {
                i++;
            }
        }
        return false;
    }

    private static boolean checkingStringContainsOnlyDigitsNew(String str) {
        return str.matches("[0-9]+");
    }

    //Solution 2 lambda
    private static boolean containsOnlyDigitsNew(String str) {
        return str.chars()
                .allMatch(Character::isDigit);
    }


}
