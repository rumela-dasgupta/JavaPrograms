import java.io.*;
import java.util.*;
public class q1as2java{
  static boolean isPalindrome(String s){
    StringBuilder f=new StringBuilder();
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(Character.isLetterOrDigit(c)){
            f.append(Character.toLowerCase(c));
        }
    }
    int i=0,j=(f.length()-1);
    while(i<j){
        if (f.charAt(i)!=f.charAt(j)){
            return false;
        }
        i++;
        j--;
    }
    return true;
}
  public static void main(String[] args){
    Scanner S=new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input=S.nextLine();
    if(isPalindrome(input)){
        System.out.println("Palindrome");
    }else{
        System.out.println("Not Palindrome");
    }
}
}
