public class ArmstrongNumber {


    public static void main(String[] args) {
        int number = 154;

        int originalNumber = number;
        int remainder;
        int result = 0;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if (result == number) {
            System.out.println(" Armstrong Number");
        } else
            System.out.println("Not an Armstrong Number");
    }
}

// select distinct(employee_name) from employee
//select name , count(*) from employee group by name having count(*)>1;