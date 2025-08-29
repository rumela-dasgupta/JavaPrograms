import java.io.*;
import java.util.*;
class q6as3java{
    public static void main(String args[])throws IOException
{
    int ch,n,nc;
    String file1,file2;
    Scanner S=new Scanner(System.in);
    System.out.print("Enter input file name=");
    file1=S.nextLine();
    System.out.print("Enter output file name=");
    file2=S.nextLine();
    FileInputStream fp1=new FileInputStream(file1);
    FileOutputStream fp2=new FileOutputStream(file2);
    nc=0;//number of characters extracted from input file
    n=0;//size of input file
    while((ch=fp1.read())!=-1){
        n=n+1;
        if(ch>=32&&ch<=122){
            nc=nc+1;
            System.out.print((char)ch);
            fp2.write(ch);
        }
    }
    fp1.close();
    fp2.close();
    System.out.println("Size of "+file1+" " +n+" Bytes");
    System.out.println("Size of "+file2+" " +n+" Bytes");
}}