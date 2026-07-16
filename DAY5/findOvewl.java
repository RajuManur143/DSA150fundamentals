package DAY5;

public class findOvewl {

    // Main function
    public static void main(String[] args) {
        char character = 'i';

        // Check the Capital letters
        if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
            System.out.println(" This is vowel = "+character);
        }

        // Check the small letters
        else if ( character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
            System.out.println("This is vowel = "+character);
        }
        else {
            System.out.println("This is NOT vowel = "+character);
        }
    }
}
