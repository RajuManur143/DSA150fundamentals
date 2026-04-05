package day1;
import java.util.Scanner;

public class findmaxoftwonumbers {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1+"Is larger");
        }
        else{
            System.out.println(num2+"Is larger");
        }
    }
}
