import java.io.*;
import java.util.*;
public class Krishnamurthy{
    static boolean isStrong(int n){
        int length = String.valueOf(n).length();
        int r=0;
        int p=0;
        int num=n;
        
        for(int i=0;i<length;i++){
            int fact=1;
            int s=num%10;
            for(int j=1;j<=s;j++){
                fact=fact*j;
            }
            p+=fact;
            num /= 10;


    }
    if(n==p){
        return true;
    }
    return false;
}
    public static void main(String[] args){
        Scanner S=new Scanner(System.in);
        System.out.print("Enter number to check: ");
        int n=S.nextInt();
        if (isStrong(n)){
            System.out.print("Strong or Krishnamurthy no.");
        }else{
            System.out.print("Not Strong");
        }
    }
}