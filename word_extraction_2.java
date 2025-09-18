//write a program in java to extract all words from any file.
//Display all words on screen and also save the same words in some out file.
//use 4 command line arguments.
//example: suppose our program file name=word_extraction.java
//name of the word file=word_extraction.java
//run your code as: C:\java\bin>java word_extractionword_extraction.java  wordfile.java<enter>
import java.io.*;
import java.util.*;
class word_extraction_2{
public static void main(String args[])throws IOException
{
int argc,n,nw;
int flag;
FileInputStream fp1=new FileInputStream(args[0]);
FileInputStream fp2=new FileOutputStream(args[1]);
nw=0;
flag=1;
while((ch=fp1.read())!=-1){
n=n+1;
if((ch>=65&&ch<=90)||(ch>97&&ch<=122))
{
if(flag==1){
nw=nw+1;
flag=0;
}
System.out.print((char)ch);
fp2.write(ch);
}
else if(flag==0){
System.out.println();
fp2.write(10);
flag=1;
}
}
fp1.close();
fp2.close();
System.out.println("Total number of words extracted="+nw);
System.out.println("Size of "+args[0]+" is "+n+" bytes");
}



