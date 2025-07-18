//q7 without constructor
import java.util.Scanner;

public class LinearSearch1 {

    // Static method for linear search
    public static int linearSearch(int[] arr, int n, int target) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;  // Found at index i
            }
        }
        return -1;  // Not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of the list [1-20]: ");
        int n = scanner.nextInt();

        int[] arr = new int[20];
        System.out.println("Enter " + n + " numbers one by one:");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter number to be searched: ");
        int target = scanner.nextInt();

        int index = linearSearch(arr, n, target);

        if (index != -1) {
            System.out.println(target + " found at index " + index);
        } else {
            System.out.println(target + " not found");
        }

        scanner.close();
    }
}
