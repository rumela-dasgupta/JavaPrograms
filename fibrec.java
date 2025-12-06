import java.io.*;
import java.util.*;
class fibrec{
    int fib(int n){
        if(n==0)
        return 0;
        if(n==1)
        return 1;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args){
        fibrec obj=new fibrec();
        Scanner S=new Scanner(System.in);
        System.out.print("Enter value to be searched: ");
        int n=S.nextInt();
        int k=obj.fib(n);
        System.out.print("The required value is: "+k);
    }
}