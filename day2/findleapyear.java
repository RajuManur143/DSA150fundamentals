package day2;
import java.util.Scanner;

public class findleapyear {


    public static int isLeafyear(int year){

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){

            return 1;
        }
        return 0;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year:");
        int year = sc.nextInt();

        int result = isLeafyear(year);

        if (result == 1) {
            System.out.println(year+"this is leaf year");
        }
        else{
            System.out.println(year+"this is NOT leaf year");
        }
    }
}