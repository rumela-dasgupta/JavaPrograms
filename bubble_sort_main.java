import java.io.*;
import java.util.*;
import mypackage.bubble_sort_package;
public class bubble_sort_main{
    public static void main(String[] args) {
        int n;
        Scanner S = new Scanner(System.in);
        bubble_sort_package obj1=new bubble_sort_package();
        System.out.print("Enter how many elements you want to sort[1-20]: ");
        n=S.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " numbers one by one:");
        for(int i=0;i<n;i++){
            System.out.print("a[" + i + "] = ");
            arr[i] = S.nextInt();

        }

        System.out.print("Original Array:"+ Arrays.toString(arr));

        obj1.BubbleSort(arr);

        System.out.println("\nSorted Array:"+ Arrays.toString(arr));
    }
}
