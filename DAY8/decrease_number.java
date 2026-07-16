package DAY8;

public class decrease_number {


    static void number_pattern_decrease(int num) {


        for (int rows = num; rows >= 1; rows--) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print(cols);
            }
        }
        



    }
    

    public static void main(String[] args) {

        int num = 5;

        number_pattern_decrease(num);
        
    }
}
