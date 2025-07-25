import java.io.*;
import java.util.*;
public class nmax{
    public static void main(String[] args){
        Scanner S=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size=S.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter "+size+" elements:");
        for(int i=0;i<size;i++){
            arr[i]=S.nextInt();
        }
        System.out.print("Enter n to find the nth max: ");
        int n=S.nextInt();
        if(n>size||n<=0){
            System.out.println("Invalid n!It should be between 1 and "+size);
            return;
        }
        Arrays.sort(arr);
        for(int i=0;i<size;i++){
            int temp=arr[i];
            arr[i]=arr[size-i-1];
            arr[size-i-1]=temp;
        }
        System.out.println(n+"th maximum is: "+ arr[n-1]);
    }
    
}