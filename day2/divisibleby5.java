package DAY2;
import java.util.Scanner;

public class divisibleby5 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers:");
        int num = sc.nextInt();

        if (num % 5 == 0) {
            System.out.println(num+"is divisble by 5");
        }
        else {
            System.out.println(num+"is NOT divisible by 5");
        }

    }
}
