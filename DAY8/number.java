package DAY8;

public class number {


    static void  print_number_pattern(int num) {

        for (int rows = 1; rows <= num; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print(cols);
            }
        }

    }
    

    public static void main(String[] args) {
        
        int num = 5;

        print_number_pattern(num);


    }
}
