package DAY3;
import java.util.Scanner;

public class AreaOfCircle {

    public static double areaOfCircle(int radius) {
        return Math.PI * radius * radius;
    }

    public static double areaOfTriangle(int base, int heigth) {
        return 0.5*base*heigth;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius: ");
        int radius = sc.nextInt();

        System.out.println("Enter the heigth");
        int heigth = sc.nextInt();

        System.out.println("Enter the base: ");
        int base = sc.nextInt();

        double area = areaOfCircle(radius);
        double triangle = areaOfTriangle(heigth, base);

        System.out.println("Area of circle is " + area);
        System.out.println("Area of Triangle is "+ triangle);

        sc.close();
    }
}