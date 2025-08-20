//Emirp number
import java.io.*;
import java.util.*;
public class Emirp{
    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    static boolean isEmirp(int n){
        int length = String.valueOf(n).length();
        int r=0;
        int num=n;
        if (isPrime(n)){
            for(int i=0;i<length;i++){
            int s=num%10;
            r=r*10+s;
            num /= 10;
            }
        
        }
        if (n!=r && isPrime(r)){
            return true;

        }
        return false;
    }
    public static void main(String[] args){
        Scanner S=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=S.nextInt();
        if(isEmirp(n)){
            System.out.print("Emirp number");
        }else{
            System.out.print("Not Emirp Number");
        }
    }
}