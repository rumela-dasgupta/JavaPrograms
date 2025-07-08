//Reverse the input number
import java.io.*;
import java.util.Scanner;
class ex9{
    public static void main(String args[])throws IOException{
        Scanner S=new Scanner(System.in);
        int n,s=0,r;
        System.out.print("Enter value of n: ");
        n=S.nextInt();
        int len=String.valueOf(n).length();
        for(int i=0;i<len;i++){
            r=n%10;
            s=s*10+r;
            n=n/10;

        }
        System.out.println("The reversed number: "+s);

    }
}