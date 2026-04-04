package day1;
import java.util.Scanner;

public class find0dd_even_number {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            boolean result = isPrime(num);

            if (result) {
                System.out.println("This is prime"+result);
            }
            else{
                System.out.println("Not prime number" + result);
            }

    }
}