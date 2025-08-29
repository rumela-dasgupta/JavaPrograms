import java.io.*;
import java.util.*;
class q10as3java{
    public static void main(String args[])throws IOException
{
    int ch,n,nw,flag;
    String file1,file2;
    Scanner S=new Scanner(System.in);
    System.out.print("Enter input file name=");
    file1=S.nextLine();
    System.out.print("Enter output file name=");
    file2=S.nextLine();
    FileInputStream fp1=new FileInputStream(file1);
    FileOutputStream fp2=new FileOutputStream(file2);
    nw=0;
    n=0;
    flag=1;
    while((ch=fp1.read())!=-1){
        n=n+1;
        if((ch>=65&&ch<=90)||(ch>=97&&ch<122)){
            if(flag==1){
                nw=nw+1;
                flag=0;
            }
            System.out.print((char)ch);
            fp2.write(ch);
        }else if(flag==0){
            System.out.print("\n");
            fp2.write(10); //ascii for new line
            flag=1;
        }
    }
    fp1.close();
    fp2.close();
    System.out.println("Number of words found="+nw);
    System.out.println("Size of "+file1+" " +n+" Bytes");
}
}