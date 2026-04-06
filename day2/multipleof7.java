package DAY2;
import java.util.Scanner;

public class multipleof7 {

    public static int isMultipleof7(int num) {

        if (num % 7 == 0) {
            return 1;
        }
        return 0;
    }



    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Users enter the values
        System.out.print("Enter the number:");

        // Initialize the variable to store the inputs
        int num = sc.nextInt();


        // Invoke the function
       int result = isMultipleof7(num);
       
       if (result == 1) {
            System.out.println(num+"Is divisible by 7");
       }
       else{

        System.out.println(num+"Is NOT divisible by 7");
        
       }


    }
}
