//Anagram
import java.io.*;
import java.util.*;
public class anagram{
    static boolean isAnagram(String s,String s1){
       char[] charArray = s.toLowerCase().toCharArray();
       char[] charArray1 = s1.toLowerCase().toCharArray();
       Arrays.sort(charArray);
       Arrays.sort(charArray1);
       if (Arrays.equals(charArray,charArray1)){
        return true;
       }
       return false;
    }
    public static void main(String[] args){
        Scanner S=new Scanner(System.in);
        System.out.print("Enter word1: ");
        String w1=S.nextLine();
        System.out.print("Enter word2: ");
        String w2=S.nextLine();
        if(isAnagram(w1,w2)){
            System.out.print("Anagram");
        }else{
            System.out.print("Not Anagram");
        }


    }

}