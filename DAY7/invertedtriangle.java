package DAY7;

public class invertedtriangle {


    static void invertedtriangle_print(int num) {
        
        for (int rows = num; rows >= 1; rows--) {

            for (int spaces = 1; spaces <= num - rows; spaces++) {
                System.out.print(" ");
            }

            for (int cols = 1; cols <= (2 * rows - 1); cols++) {
                System.out.print("*");
            }

            System.out.println();
            
        }

    }
    

    public static void main(String[] args) {

        int num = 4;

        invertedtriangle_print(num);
        
    }
}
