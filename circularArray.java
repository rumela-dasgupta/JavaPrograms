import java.io.*;
import java.util.*;
class circularArray{
    int a[]=new int[20];
    void inputArray(int n) {
        Scanner S = new Scanner(System.in);
        for(int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            a[i] = S.nextInt();
        }
    }
    void shift(int shift, int n){
    shift = shift % n; // if shift > n

    for(int k = 0; k < shift; k++){
        int last = a[n - 1];     // store last element

        for(int i = n - 1; i > 0; i--){
            a[i] = a[i - 1];     // shift right
        }

        a[0] = last;             // put last at beginning
    }
}
    void DisplayArray(int n){
        System.out.print("Array: " );
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }

    }
    public static void main(String args[]){
        System.out.print("Enter n: ");
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        circularArray obj=new circularArray();
        obj.inputArray(n);
        obj.DisplayArray(n);
        //System.out.print("array: "+obj.DisplayArray(n));
        System.out.print("\nShift by:(1-5) ");
        int m=S.nextInt();
        obj.shift(m,n);
        obj.DisplayArray(n);
        //System.out.print("New array: "+obj.DisplayArray(n));
    }
}