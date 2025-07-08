//Palindrome number check

import java.io.*;
import java.util.Scanner;
class ex9a{
    public static void main(String args[])throws IOException{
        Scanner S=new Scanner(System.in);
        int n,s=0,r;
        System.out.print("Enter value of n: ");
        n=S.nextInt();
        int p=n;
        int len=String.valueOf(p).length();
        for(int i=0;i<len;i++){
            r=p%10;
            s=s*10+r;
            p=p/10;

        }
        if (n==s){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not Palindrome Number");
        }


    }
}