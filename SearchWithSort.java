import java.util.Scanner;

public class SearchWithSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 2: Sort array using Insertion Sort
        insertionSort(arr);

        System.out.println("Sorted Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        // Step 3: Menu-driven search
        System.out.print("\nEnter element to search: ");
        int key = sc.nextInt();

        System.out.println("Choose search method:");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                int index1 = linearSearch(arr, key);
                if (index1 != -1)
                    System.out.println("Element found at index: " + index1);
                else
                    System.out.println("Element not found!");
                break;

            case 2:
                int index2 = binarySearch(arr, key);
                if (index2 != -1)
                    System.out.println("Element found at index: " + index2);
                else
                    System.out.println("Element not found!");
                break;

            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }

    // Insertion Sort
    public static void insertionSort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    // Linear Search
    public static int linearSearch(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key)
                return i;
        }
        return -1;
    }

    // Binary Search
    public static int binarySearch(int[] a, int key) {
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == key)
                return mid;
            else if (a[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
