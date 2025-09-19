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

// Class responsible for converting a character to its 8-bit binary representation
class text_to_bit_conversion {
    void bit_conversion(int bit[], int ch) {
        int mask = 128;  // 2^7, used to extract each bit
        int n = 0;
        while (mask > 0) {
            int k = ch & mask;
            bit[n] = (k != 0) ? 1 : 0;
            n++;
            mask = mask >> 1;
        }
    }
}

public class bit_conversion {
    public static void main(String[] args) throws IOException {
        int i, ch;
        int bit[] = new int[8];

        // Check if user provided input and output file names
        if (args.length != 2) {
            System.out.println("Usage: java bit_conversion <input_file> <output_file>");
            return;
        }

        // Open input and output files
        FileInputStream fp1 = new FileInputStream(args[0]);
        FileOutputStream fp2 = new FileOutputStream(args[1]);

        int byteCount = 0;

        // Create instance of bit converter
        text_to_bit_conversion TB = new text_to_bit_conversion();

        // Read each character, convert to bits, and write
        while ((ch = fp1.read()) != -1) {
            byteCount++;
            TB.bit_conversion(bit, ch);
            for (i = 0; i < 8; i++) {
                // Print to console
                System.out.print(bit[i]);

                // Write to output file ('0' = 48, '1' = 49 in ASCII)
                fp2.write(bit[i] + 48);
            }
        }

        // Newline and size info
        System.out.println("\nSize of <" + args[0] + "> = " + byteCount + " Bytes");

        // Close files
        fp1.close();
        fp2.close();
    }
}
