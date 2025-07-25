//sorting algorithm
import java.io.*;
import java.util.*;
public class BubbleSort{

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int pass = 1;

        for (int i = 0; i < n - 1; i++) {
            int swapped = 0;

            System.out.println("\nPass " + pass + ":");

            for (int j = 0; j < n - 1 - i; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) { //ascending order for decending order just change > to <
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = 1;
                }
                System.out.println(Arrays.toString(arr));
                //System.out.println();
                //printArray(arr);
            }

            pass++;
            // If no two elements were swapped, array is sorted
            if (swapped==0) 
               break;
        }
    }

    /*public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }*/
    public static void main(String[] args) {
        int n;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter how many elements you want to sort[1-20]: ");
        n=S.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " numbers one by one:");
        for(int i=0;i<n;i++){
            System.out.print("a[" + i + "] = ");
            arr[i] = S.nextInt();

        }
        //int[] arr = {50, 40, 30, 20, 10};

        System.out.println("Original Array:"+ Arrays.toString(arr));
        //printArray(arr);
        System.out.println();

        bubbleSort(arr);

        System.out.println("\nSorted Array:"+ Arrays.toString(arr));
        //printArray(arr);
    }
}
