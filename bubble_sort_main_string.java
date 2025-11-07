import java.io.*;
import java.util.*;
import mypackage.bubble_sort_package_string;
public class bubble_sort_main_string{
    public static void main(String[] args) {
        int n;
        Scanner S = new Scanner(System.in);
        bubble_sort_package_string obj1=new bubble_sort_package_string();
        System.out.print("Enter how many elements you want to sort[1-20]: ");
        n=S.nextInt();
        String[] arr = new String[n];
        
        System.out.println("Enter " + n + " numbers one by one:");
        for(int i=0;i<n;i++){
            System.out.print("a[" + i + "] = ");
            S.nextLine();
            arr[i] = S.nextLine();

        }

        System.out.print("Original Array:"+ Arrays.toString(arr));

        obj1.BubbleSort(arr);

        System.out.println("\nSorted Array:"+ Arrays.toString(arr));
    }
}
