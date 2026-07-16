package DAY7;
import java.util.*;

public  class triangle{


    static void triangle_print(int num) {

        for (int rows = 1; rows <= num; rows++) {

            // print the spaces
            for (int spaces = 1; spaces <= num - rows; spaces++) {
                System.out.print(" ");
            }

            // Print the cols
            for (int cols = 1; cols <= (2 * rows - 1); cols++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows = ");
        int num = sc.nextInt();
        
    
        triangle_print(num);


    }
}