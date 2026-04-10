package DAY3;
import java.util.Scanner;

public class reminderandquotient {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Dividend and Divisor");
        int Dividend = sc.nextInt();
        int Divisor = sc.nextInt();

        int Quoetient = Dividend / Divisor;
        int Reminder = Dividend % Divisor;

        System.out.println("Quoetient = "+ Quoetient);
        System.out.println("Reminder = "+ Reminder);


        sc.close();

    }
}