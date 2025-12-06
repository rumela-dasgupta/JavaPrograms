import java.io.*;
import java.util.*;
class BS{
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
    void insertion_sort(int n){
        for(int i=1;i<n;i++){
            int key=a[i];
            int j=i-1;
            while(j>=0&&a[j]>key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
    }
    int BS(int k,int n){
            int low=0;
            int high=n-1;
            while(low<=high){
            int mid=(high+low)/2;
            if (k==a[mid]){
                 return mid;
            }else if(k<a[mid]){
                high=mid-1;     
            }else 
            low=mid+1;
            }
            return -1;
    }
    public static void main(String[] args){
        System.out.print("Enter n:");
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        BS obj=new BS();
        obj.insertArray(n);
        obj.insertIndex(n);
        System.out.print("Enter key to be searched: ");
        int k=S.nextInt();
        obj.insertion_sort(n);
        int m=obj.BS(k,n);
        if(m==-1){
            System.out.print("Key not found!");
        }else
        System.out.print("The required key is present at index "+m);
    }


}