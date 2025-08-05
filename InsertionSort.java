import java.io.*;
import java.util.*;
public class InsertionSort{
    public static void insertionsort(int[] a){
    int n=a.length;
    for(int i=0;i<n;i++){
        int key=a[i];
        int j=i-1;
        while(j>=0&&a[j]>key){
            a[j+1]=a[j];
            j-=1;
        }
        a[j+1]=key;
        //System.out.println(Arrays.toString(a)); use it when you want to show the steps of the insertion sort

    }
    }
    public static void main(String[] args)throws IOException{
        int n;
        Scanner S=new Scanner(System.in);
        System.out.print("Enter how many elements in array: ");
        n=S.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter element "+(i+1)+": ");
            a[i]=S.nextInt();
        }
        System.out.println("Original Array: "+Arrays.toString(a));
        System.out.println();
        insertionsort(a);
        System.out.println("Sorted Array: "+Arrays.toString(a));
        

    }
}
