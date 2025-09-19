//act2:write a program in java to convert all characters in file to corresponding bits.use command line arguments.
//example:
//suppose our input file name=myfile.txt which contains ABCD.
// the output file name=bitfile.txt which contains 010000101000010100001101000100
//c:\java\bin>java_bit_conversion myfile.txt bitfile.txt<enter>
/*
Write a program in java to convert all characters in file to corresponding bits. use command line arguments.
Example:
Suppose inputfile name=myfile.txt
outputfile name=outfile.txt must contains characters in bits
011000100111
-> it will read myfile.txt and convert all characters to bits and will transfer all bits to bitfile.txt
*/
import java.io.*;
class text_to_bit_conversion{
	void bit_conversion(int bit[], int ch){
		int mask=128;
		int i, k, n1;
		int n=0;
		while(mask>0){
			k=ch & mask;
			if(k!=0)
				bit[n] = 1;
			else
				bit[n]= 0;
			n+=1;
			mask=mask>>1;
		}
	}
}
public class bit_conversion{
	public static void main(String[] args)throws IOException{
		int i, n, ch;
		int bit[]=new int[8];

        FileInputStream fp1 = new FileInputStream(args[0]);
		FileOutputStream fp2 = new FileOutputStream(args[1]);
		n=0;
		text_to_bit_conversion TB=new text_to_bit_conversion();
        while ((ch = fp1.read()) != -1) {
			n+=1;
			TB.bit_conversion(bit, ch);
			for(i = 0; i < 8; i++){
				System.out.print(bit[i]);
				fp2.write(bit[i]+48);
			}
		}
		System.out.println("\nSize of <"+args[0]+">="+n+"Bytes");
		fp1.close();
		fp2.close();
	}
}