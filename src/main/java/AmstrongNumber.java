public class AmstrongNumber {


    public static void main(String[] args) {
        int number = 154;

        int originalNumber = number;
        int remainder = 0;
        int result = 0;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if (result == number) {
            System.out.println(" Amstrong Number");
        } else
            System.out.println("Not an Amstrong Number");
    }
}

// select distinct(employee_name) from employee
//select name , count(*) from employee group by name having count(*)>1;