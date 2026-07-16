package DAY6;
import java.util.Scanner;

public class printsquaregrid {

    static void printgrid(int num) {
        for (int rows = 0; rows < num; rows++) {
            for(int cols = 0; cols < num; cols++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of grid = ");
        int num = sc.nextInt();
        printgrid(num);

        sc.close();
    }
}
