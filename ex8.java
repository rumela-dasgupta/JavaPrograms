import java.io.*;
import java.util.*;
class ex8{
    public static void main(String args[])throws IOException{
        Scanner S=new Scanner(System.in);
        int empcode;
        double basic_pay,da,hra,gross_pay=0.00;
        System.out.print("Enter your Employee Code: ");
        empcode=S.nextInt();
        System.out.print("Enter your Basic pay: ");
        basic_pay=S.nextDouble();
        da=0.06*basic_pay;
        hra=0.15*basic_pay;
        gross_pay+=basic_pay+da+hra;
        System.out.println("**Required Details of the following Employee**"+"\n"+"Employee code: "+empcode+"\n"+"Basic pay: "+basic_pay+"\n"
        +"D.A.: "+da+"\n"+"H.R.A: "+hra+"\n"+"Gross pay: "+gross_pay);



    }
}