import java.io.*;
import java.util.*;
public class q3as2java{
    static String LowertoUpper(String s){
        StringBuilder f=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLowerCase(c)){
                f.append(Character.toUpperCase(c));
            }else{
                f.append(c);
            }
        }
        return f.toString(); //convert the StringBuilder to String
    }
    public static void main(String[] args){
        Scanner S=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=S.nextLine();
        System.out.println("Original string: "+s);
        String p=LowertoUpper(s);
        System.out.println("New string: "+p);
    }
}