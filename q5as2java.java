import java.io.*;
import java.util.*;
public class q5as2java{
    static String ReverseString(String s){
        int j=(s.length()-1);
        StringBuilder f=new StringBuilder();
        while(j>=0){
          f.append(s.charAt(j));
          
          j--;
        }
        
        return f.toString();
    }
    public static void main(String[] args){
        Scanner S=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=S.nextLine();
        String p=ReverseString(s);
        System.out.println("New String: "+p);
    }
    }
