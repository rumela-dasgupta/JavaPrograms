import java.io.*;
import java.util.*;
class ex3{
    public static void main(String args[])throws IOException{
        Scanner S=new Scanner(System.in);
        double INR,USD,CAD,amt;
        System.out.print("Enter amount in INR: ");
        amt=S.nextDouble();
        INR=amt;
        USD=INR/85.60;
        CAD=INR/62.78;
        System.out.println("**Required Details**"+"\n"+"INR "+INR+"\n"+"USD: "+USD+"\n"
        +"CAD: "+CAD);



    }
}