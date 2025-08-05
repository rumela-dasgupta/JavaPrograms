import java.io.*;
import java.util.*;
public class BinarySearch{
    public static int binarysearch(int[] a, int n,int target){
        //int n=a.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if (target==a[mid])
            return mid;
            else if(target<a[mid])
            high=mid-1;
            else if(target>a[mid])
            low=mid+1;
        }
    
    return -1;
}
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
public static void main(String[] args){
    //int[] a = new int[20];
    Scanner S=new Scanner(System.in);
    System.out.print("Enter size of the list [1-20]: ");
    int n = S.nextInt();
    int[] a = new int[n];
    if (n < 1 || n > 20) {
            System.out.println("Invalid size. Please enter a number between 1 and 20.");
            return;
        }

    
    System.out.println("Enter " + n + " numbers one by one:");
    for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = S.nextInt();
        }
    System.out.println("Inserted array: "+Arrays.toString(a));
    System.out.print("Enter element to be searched: ");
    int target=S.nextInt();
    insertionsort(a);
    System.out.println("Sorted array: "+Arrays.toString(a));
    int index=binarysearch(a,n,target);
    if(index!=-1)
    System.out.println(target + " found at index " + index);
    else
     System.out.println(target + " not found");
     S.close();
}

}