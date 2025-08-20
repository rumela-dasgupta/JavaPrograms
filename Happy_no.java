//Happy number
import java.io.*;
import java.util.*;
public class Happy_no{
    static boolean Happy_no(int n){
        int length=String.valueOf(n).length();
        int num=n;
        int s=0;
        for(int i=0;i<length;i++){
            int p=num%10;
            double q=Math.pow(p,2);
            s+=q;
            num/=10;
        }
        if(s==1){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner S=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=S.nextInt();
        if(Happy_no(n)){
            System.out.print("Happy Number");
        }else{
            System.out.print("Not Happy Number");
        }
    }
}