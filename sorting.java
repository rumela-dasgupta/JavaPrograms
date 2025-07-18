
//Insertion sort: Builds the sorted array one item at a time by comparing each new element with those already sorted.
//Bubble sort: Repeatedly swaps adjacent elements if they are in the wrong order.
import java.io.*;
import java.util.Scanner;

public class sorting {
    
    // Insertion Sort
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }

    // Print Array
    public static void printArray(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size and elements
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Choose sorting method
        System.out.println("\nChoose Sorting Method:");
        System.out.println("1. Insertion Sort");
        System.out.println("2. Bubble Sort");
        System.out.print("Enter choice (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                insertionSort(arr);
                System.out.println("Sorted using Insertion Sort:");
                break;

            case 2:
                bubbleSort(arr);
                System.out.println("Sorted using Bubble Sort:");
                break;

            default:
                System.out.println("Invalid choice. Exiting.");
                return;
        }

        printArray(arr);
        scanner.close();
    }
}
