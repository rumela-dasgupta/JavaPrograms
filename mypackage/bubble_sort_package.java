//bubble_sort_package.java:write a program in java to create a package which will implement bubble sort algorithm to sort 'n' elements
package mypackage;
import java.io.*;
import java.util.*;

public class bubble_sort_package{
    public void BubbleSort(int[] arr){
        int n=arr.length;
        Scanner S = new Scanner(System.in);
        for(int i=0;i<n-1;i++){
            for(int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
        }
           }
}
    }
}