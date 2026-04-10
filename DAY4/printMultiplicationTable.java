package DAY4;
import java.util.Scanner;

public class printMultiplicationTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to print the table = ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
                sum = i * num;
                System.out.println(num + "*" + i + "=" + sum);
        }

        sc.close();
    }

}
