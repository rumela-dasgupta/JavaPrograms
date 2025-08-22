import java.io.*;
import java.util.*;
class q1as3java{
    public static void main(String[] args)throws IOException{
        String file1,file2;
        int ch,nbyte; //ch=one character, mbyte=no. of bytes
        Scanner SC=new Scanner(System.in);
        System.out.print("Enter Input File Name=");
        file1=SC.nextLine();
        System.out.print("Enter Output File Name=");
        file2=SC.nextLine();
        FileInputStream fp1=new FileInputStream(file1);
        FileOutputStream fp2=new FileOutputStream(file2);
        nbyte=0; // size of input file in bytes
        while((ch=fp1.read())!=-1){
            nbyte=nbyte+1;
            fp2.write(ch);
        }
        fp1.close();
        fp2.close();
        System.out.println("Size of<"+file1+">="+nbyte+" Bytes");
    }
}