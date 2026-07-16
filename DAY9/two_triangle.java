package DAY9;

class two_triangle{


    static void print(int rows, int cols) {

        
        for (int i = 1; i <= rows; i++) {

            // Left side
            for(int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }

            // Space

            for(int space = 1; space <= 2*(rows - i); space++) {
                System.out.print(" ");
            }

            for(int j = i; j >= 1; j-- ) {

                System.out.print(j+" ");

            }

            System.out.println();



           
        }


    }


    public static void main(String[] args) {

        print(4, 4);
        
    }





}