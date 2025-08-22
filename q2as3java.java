import java.io.*;
import java.util.*;
class q2as3java{
    public static void main(String[] args)throws IOException{
        String file1,file2;
        int ch,nbyte; //ch=one character, mbyte=no. of bytes
        int argc=args.length;
        FileOutputStream fp2=new FileOutputStream(args[argc-1]);
        nbyte=0; // size of input file in bytes
        for(int i=0;i<(argc-1);i++){
            FileInputStream fp1=new FileInputStream(args[i]);
        while((ch=fp1.read())!=-1){
            nbyte=nbyte+1;
            fp2.write(ch);
        }
        fp1.close();
        }
        fp2.close();
        System.out.println("FIle Copy is over...");
        System.out.println("No. of files copies="+(argc-1));
        System.out.println("Size of <"+args[argc-1]+">="+nbyte+" Bytes");
    }
}
//java q2as3java q1as3java.java q2as3java.java output.txt