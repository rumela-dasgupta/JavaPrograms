/*
To convert any file to corresponding bits. Now perform some simple encryption algorithm on all bits:
Step-1: Change all '0' bits to bit '1' and vice versa. DO it for all characters.
Step-2: Apply Bit-wise XOR as follows:
Bit[7]=bit[0]^bit[7]
bit[6]=bit[1]^bit[6]
bit[5]=bit[2]^bit[5]
bit[4]=bit[3]^bit[4]
Step-3: Write the modified characters on some output file.
Note: Initially you may choose an input file which contains
ABCDEFGHIJKLMNOPQRSTUVWXYZ
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
public class bit_conversion2{
	public static void main(String[] args)throws IOException{
		int i, n, ch, n1;
		int bit[]=new int[8];

        FileInputStream fp1 = new FileInputStream(args[0]);
		FileOutputStream fp2 = new FileOutputStream(args[1]);
		n=0;
		text_to_bit_conversion TB=new text_to_bit_conversion();
        while ((ch = fp1.read()) != -1) {
			n+=1;
			TB.bit_conversion(bit, ch);
			//To flip bit-0 to bit-1 and vice versa
			for(i = 0; i < 8; i++){
				if(bit[i]==0)
					bit[i] = 1;
				else
					bit[i]=0;
			}
			//To perform bitwise XOR operation
			n1=7;
			for(i=0;i<4;i++){
				bit[n1]=bit[n1]^bit[i];
				n1=n1-1;
			}
			//To convert bits to chars
			int base=128;
			int sum=0;
			for(i=0;i<8;i++){
				sum=sum+bit[i]*base;
				base=base/2;
			}
			System.out.print(sum);
			fp2.write(sum);
			}
		
		System.out.println("\nSize of <"+args[0]+">="+n+"Bytes");
		fp1.close();
		fp2.close();
	}
}
 