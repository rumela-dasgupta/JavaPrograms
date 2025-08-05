import java.io.*;
import java.util.*;
public class Shift_by_n{
    public static void main(String[] args)throws IOException{
        Scanner S=new Scanner(System.in);
        int n,i,s,j,k;
        System.out.print("Enter how many elements: ");
        n=S.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++){
            System.out.print("Enter element "+(i+1)+": ");
            a[i]=S.nextInt();
        }
        // Perform right shift by n (which brings array back to original)
        for(s=0;s<n;s++){
            for(j=n-1;j>0;j--){
            // Swap a[j] and a[j-1] without using a third variable
            a[j]=a[j]+a[j-1];
            a[j-1]=a[j]-a[j-1];
            a[j]=a[j]-a[j-1];

            }
           
        }
        System.out.println("array after shifting by "+n+": ");
        for (k = 0; k < n; k++) {
            System.out.print(a[k] + " ");
        }
    }
    
}