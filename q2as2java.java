import java.io.*;
import java.util.*;
class Concordance{
public static int nvowels(String s){
int c=0;
s=s.toLowerCase();
int i;
for(i=0;i<s.length();i++){
char ch=s.charAt(i);
if ( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') c++;
}
return c;
}
public static int nalphabet(String s){
int c=0;
s=s.toUpperCase();
int i;
char ch;
for(i=0;i<s.length();i++){
 ch=s.charAt(i);
 if (ch>='A'&&ch<='Z') c++;
 }
 return c;
 }
 public static int nconsonant(String s){
 int noc=nalphabet(s)-nvowels(s);
 return noc;
 }
}
 public class q2as2java{
 public static void main(String[] args)throws IOException{
 String s;
 int nc,nv,na;
 Scanner S=new Scanner(System.in);
 Concordance C=new Concordance();
 System.out.print("Enter any sentence: ");
 s=S.nextLine();
 nv=C.nvowels(s);
 System.out.println("Number of vowels= "+nv);
 na=C.nalphabet(s);
 System.out.println("Number of alphabets= "+na);
 nc=C.nconsonant(s);
 System.out.println("Number of consonants= "+nc);
 }
 }
