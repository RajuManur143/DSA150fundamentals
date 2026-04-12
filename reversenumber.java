
import java.util.Scanner;

public class reversenumber {

    public static  int isreverse(int num) {

        int reverse = 0;
        while (num > 0) {

            // find the last number
            int rem = num % 10;

            // reverse number and sum of it
            reverse = reverse * 10 + rem;

            // next number for operations
            num = num / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number = ");
        int num = sc.nextInt();

        int result = isreverse(num);
        System.out.println("Reverse series is = "+result);


        sc.close();
    }
}
