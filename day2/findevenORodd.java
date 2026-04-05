package DAY2;
import java.util.Scanner;


public class findevenORodd {
    public static void  main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers:");
        int num = sc.nextInt();
        
        if (num == 0 || num < 0) {
            System.out.println("Invalid input! Input should be greather than equal to 1");
            return ;
        }
        

        if (num % 2 == 0) {
            System.out.println(num+ "is even number");
        }
        else{
            System.out.println(num+ "is odd number");
        }

    }
}
