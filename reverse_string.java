
import java.util.Scanner;

class reverse_string{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string = ");

        String str = sc.nextLine();
        String reverse = "";

        for(int i = str.length(); i >= 0; i--) {

            reverse += str.charAt(i);

        }

        System.out.println("Reversed string is = "+reverse);

    }

}