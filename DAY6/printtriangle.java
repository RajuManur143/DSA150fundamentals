package DAY6;
import java.util.Scanner;

public class printtriangle {

    static void triangle_grid(int num) {
        for (int rows = 0; rows < num; rows++) {
            for (int cols = 0; cols <= rows; cols ++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the grid size = ");
        int num = sc.nextInt();

        // Function call or invoke
        triangle_grid(num);

        sc.close();
    }
}
