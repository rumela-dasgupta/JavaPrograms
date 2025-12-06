import java.io.*;
import java.util.*;
class rev{
    public static void main(String[] args){
        Scanner S=new Scanner(System.in);
        System.out.print("Enter number to reverse:");
        int n=S.nextInt();
        int m=n;
        int s=0;
        while(m>0){
            int temp=m%10;
            s=s*10+temp;
            m/=10;
        }
        System.out.print("original number: "+n+"\n");
        System.out.print("reversed number: "+s);
    }
}