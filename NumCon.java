import java.io.*;
import java.util.*;
public class NumCon{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch;
        do{
            System.out.print("enter a decimal number: ");
            int decimal=sc.nextInt();
            System.out.println("Choose conversion type: ");
            System.out.println("\n1.Binary \n2.Octal \n3.Hex");
            System.out.print("enter choice(1-3): ");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Binary: "+Integer.toBinaryString(decimal));
                    break;
                case 2:
                    System.out.println("Octal: "+Integer.toOctalString(decimal));
                    break;
                case 3:
                    System.out.println("Binary: "+Integer.toHexString(decimal));
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.print("do you want to continue?y/n: ");
            ch=sc.next().charAt(0);
        }while(ch=='y'||ch=='Y');
    }
}