//s=1!+2!+3!+....+n!

import java.io.*;
import java.util.Scanner;
class ex10{
    public static void main(String args[])throws IOException{
        Scanner S=new Scanner(System.in);
        int n,s;
        System.out.print("Enter Value of n: ");
        n=S.nextInt();
        s=1;
        for(int i=2;i<=n;i++){
            int fact=1;
            for(int j=1;j<=i;j++){
                fact*=j;
            }
            s+=fact;
        }
        System.out.println("Required series answer: "+s);
    }
}