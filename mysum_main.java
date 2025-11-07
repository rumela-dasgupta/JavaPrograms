//mysum_main.java:write a main pogram to use user defined package mypackage
import java.io.*;
import java.util.*;
import mypackage.Mysum;
class mysum_main{
    public static void main(String args[]) throws IOException{
        int s,n;
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter n");
        n=SC.nextInt();
        Mysum S1=new Mysum();
        s=S1.sum1(n);
        System.out.println("sum of "+n+" numbers="+s);
    }
}