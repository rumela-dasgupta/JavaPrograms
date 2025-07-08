//input name,email,mobile number and display them.take multiple inputs.

import java.io.*;
import java.util.Scanner;
class ex4{
    public static void main(String args[])throws IOException{
        Scanner S=new Scanner(System.in);
        int mob,ch;
        String email,name;
        System.out.print("How many inputs? ");
        ch=S.nextInt();
        for(int i=0;i<ch;i++){
        System.out.println("\n**Input details for entry " + (i + 1) + "**");
        S.nextLine();
        System.out.print("\nEnter Name: ");
        name=S.nextLine();
        System.out.print("\nEnter Email: ");
        email=S.nextLine();
        System.out.print("\nEnter Mobile: ");
        mob=S.nextInt();
        System.out.println("\n**Displaying presently input values**"+"\n"+"NAME: "+name+"\n"+"EMAIL: "+email+"\n"+"MOBILE: "+mob);
        }
        
        
        

    }
}