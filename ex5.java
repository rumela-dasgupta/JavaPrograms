import java.io.*;
import java.util.Scanner;
class ex5{
    public static void main(String args[])throws IOException{
        Scanner S=new Scanner(System.in);
        int n;
        System.out.print("Enter Number to check: ");
        n=S.nextInt();
        if(n%2==0){
            System.out.print("Number is even");
        }
        else{
            System.out.print("Number is odd");
        }


    }
}