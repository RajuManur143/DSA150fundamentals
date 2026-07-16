package DAY8;

public class number_pattern {


    static void print_number_pattern(int num) {

        for (int rows = 1; rows <= num; rows++) {
            for (int cols = rows; cols <= (2 * rows - 1); cols++) {
                System.out.print(rows);
            }
        }
        
    }


    public static void main(String[] args) {


        int num = 5;
        print_number_pattern(num);
        
    }


}
