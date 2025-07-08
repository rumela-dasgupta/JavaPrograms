//series s=1+x+(x^2/2!)+(x^3/3!)+...(upto 10 terms)

import java.io.*;
import java.util.Scanner;
class ex10a{
    public static void main(String args[])throws IOException
    {
        Scanner S=new Scanner(System.in);
        int x,n;
        double s;
        System.out.print("Enter value of x= ");
        x=S.nextInt();
        s=1+x;
        for(int i=2;i<=10;i++){
            double fact=1;
            for(int j=1;j<=i;j++){
                fact*=j;
            }
            s+=Math.pow(x,i)/fact;
        }
        System.out.println("Required series answer: "+s);
    }
}