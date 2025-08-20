//Armstrong no
import java.io.*;
import java.util.*;
public class Armstrong{
    static boolean Armstrong(int n){
        int length=String.valueOf(n).length();
        int sum=0;
        int num=n;
        for(int i=0;i<length;i++){
            int p=num%10;
            double q=Math.pow(p,length);
            sum+=q;
            num/=10;
            
        }
        if(sum==n){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner S=new Scanner(System.in);
        System.out.print("Enter no to check: ");
        int n=S.nextInt();
        if(Armstrong(n)){
            System.out.print("Armstrong no");
        }else{
            System.out.print("Not Armstrong no");
            }
    }
}
