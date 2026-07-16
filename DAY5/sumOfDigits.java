package DAY5;

public class sumOfDigits {
    private static void sum_of_digits(int num) {
        int sum = 0;

        while (num > 0) {
            int rem = num % 10; // find the remaining elements 
            sum = sum + rem;
            num = num / 10; // find the divisible elements
        }
        System.out.println("Sum of digits is = "+sum);

    }
    public static void main(String[] args) {
        int num = 1234;
        sum_of_digits(num);
    }
}
