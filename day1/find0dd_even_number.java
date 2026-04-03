package day1;
import java.util.Scanner;

public class find0dd_even_number {

    public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                System.out.print("even number"+num);
            }
            else{
                System.out.print("odd number"+num);
            }

    }
}