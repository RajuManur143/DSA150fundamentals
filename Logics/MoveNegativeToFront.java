import java.util.Arrays;
public class MoveNegativeToFront {
    public static void main(String[] args) {

        int[] arr = {1, -4, -5, 6, 2, 3, -9, 10};

        System.out.println("Before: " + Arrays.toString(arr));

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (arr[left] < 0) {
                left++;
            }
            else if (arr[right] >= 0) {
                right--;
            }
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        System.out.println("After : " + Arrays.toString(arr));
    }
}