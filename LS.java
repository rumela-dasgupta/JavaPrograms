import java.io.*;
import java.util.*;
class LS{
    int a[]=new int[20];
    int b[]=new int[20];
    void insertArray(int n){
        for(int i=0;i<n;i++){
            System.out.print("Enter element"+(i+1)+":");
            Scanner S=new Scanner(System.in);
            int m=S.nextInt();
            a[i]=m;
        }
    }
    void insertIndex(int n){
        for(int i=0;i<n;i++){
            b[i]=i;
        }
    }
    int LS(int k,int n){
        for(int i=0;i<n;i++){
            if (k==a[i])
            return b[i];
        }
        return -1;
    }
    public static void main(String[] args){
        System.out.print("Enter n:");
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        LS obj=new LS();
        obj.insertArray(n);
        obj.insertIndex(n);
        System.out.print("Enter key to be searched: ");
        int k=S.nextInt();
        int m=obj.LS(k,n);
        if(m==-1){
            System.out.print("Key not found!");
        }else
        System.out.print("The required key is present at index "+m);
    }


}