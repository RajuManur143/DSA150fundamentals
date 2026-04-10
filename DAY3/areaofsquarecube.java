package DAY3;

import java.util.Scanner;

public class areaofsquarecube {

    public static int square(int num) {
        return num * num;
    }

    public static int cube(int num) {
        return num * num * num;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = sc.nextInt();

        int sq = square(num);
        int cb = cube(num);

        System.out.println("Square: " + sq);
        System.out.println("Cube: " + cb);

        sc.close();
    }
}