import java.util.Stack;

public class Binary {
    public static void main(String[] args) {
        printBinary(122);
        System.out.println(" "+ Integer.toBinaryString(122));
    }

    private static void printBinary(int num) {
        Stack<Integer> st = new Stack<>();
        while (num > 0) {
            st.push(num % 2);
            num = num / 2;
        }
        while (!(st.isEmpty())) {
            System.out.print(st.pop());
        }
    }
}
