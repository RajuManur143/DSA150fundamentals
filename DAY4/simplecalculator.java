package DAY4;
import java.util.Scanner;

public class simplecalculator {

    public static void main(String[] args) {

        // Input given by users
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first operend");
        int number1 = sc.nextInt();

        System.out.print("Enter the operator ");
        char operend = sc.next().charAt(0);

        System.out.println("Enter the second operend");
        int number2 = sc.nextInt();


        switch (operend) {
            case '+':
                System.out.println("Sum of two = "+(number1+number2));
                
                break;
            case '-':
                System.out.println("Substration of two number is = "+(number1 - number2));
                break;
        
            default:
                System.out.println("Enter the valid inputs");
                break;
        }
        sc.close();
    }
}