package DAY7;
import java.util.*;

public class invertedrightangletriangle {

    void triangle(int num) {

        for (int rows = num; rows > 0; rows--) {
            for (int cols = 0; cols < rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows = ");
        int num = sc.nextInt();

        invertedrightangletriangle tri = new invertedrightangletriangle();
        tri.triangle(num);
    }
}