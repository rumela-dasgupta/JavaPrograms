import java.io.*;
import java.util.*;
class bubble_sort{
    int a[]=new int[20];
    void bubble_sort(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    void insertion_sort(int n){
        for(int i=1;i<n;i++){
            int key=a[i];
            int j=i-1;
                while(j>=0&&a[j]>=key){
                    a[j+1]=a[j];
                    j--;
                }
                a[j+1]=key;
            }

        }
    
    void insertArray(int n){
        for(int i=0;i<n;i++){
            System.out.print("Enter element"+(i+1)+":");
            Scanner S=new Scanner(System.in);
            int m=S.nextInt();
            a[i]=m;
        }
    }
    void Display(int n){
        System.out.print("the sorted array:\n ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args){
        System.out.print("Enter no of elements: ");
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        bubble_sort obj=new bubble_sort();
        obj.insertArray(n);
        //obj.bubble_sort(n);
        obj.insertion_sort(n);
        obj.Display(n);

    }
}