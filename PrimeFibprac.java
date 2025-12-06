import java.io.*;
import java.util.*;
class prime_fibonacciprac{
    boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    void PrimeFib(int n){
        int a=0,b=1,c=0,fib;
        while(c<n){
            fib=a+b;
            a=b;
            b=fib;
            if(isPrime(fib)){
                System.out.print(" "+fib);
            }
            c+=1;
        }
    }
    public static void main(String[] args){
        Scanner S=new Scanner(System.in);
        System.out.println("Enter number of numbers:[<=2000]: ");
        int n=S.nextInt();
        prime_fibonacciprac obj=new prime_fibonacciprac();
        obj.PrimeFib(n);


    }
}