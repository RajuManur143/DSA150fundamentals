package DAY6;
import java.util.Scanner;

public class invertedRigthAngleTriangle {

    static void inverted_right_angle_triangle(int num) {

        for (int rows = num; rows > 0; rows--) {
            for (int cols = 0; cols < rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size = ");
        int num = sc.nextInt();

        inverted_right_angle_triangle(num);
        sc.close();
    }
}
