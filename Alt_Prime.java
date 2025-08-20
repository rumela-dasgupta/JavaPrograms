import java.io.*;
import java.util.*;
public class Alt_Prime{
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    static int alt_prime(int n){
        int c=0;
        int sum=0;
        System.out.print("Alternate Prime numbers up to " + n + ": ");
        for(int k=2;k<n;k++){
            if(isPrime(k)){
                c+=1;
                if(c%2!=0){
                    System.out.print("\n"+k+" ");
                    sum+=k;
                }
            }
        }
        return sum;

 }
 public static void main(String[] args){
    Scanner S=new Scanner(System.in);
    System.out.print("Enter upto which you want to print: ");
    int n=S.nextInt();
    System.out.println("\nThe required series and sum is: "+alt_prime(n));
 }
 }

