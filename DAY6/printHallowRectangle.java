package DAY6;

import java.util.Scanner;

public class printHallowRectangle {

    static void hallow_rectangle(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                // Border printing
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows = ");
        int rows = sc.nextInt();

        System.out.print("Enter the columns = ");
        int cols = sc.nextInt();

        hallow_rectangle(rows, cols);

        sc.close();
    }
}
