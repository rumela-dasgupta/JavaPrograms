//act2:write a program in java to convert all characters in file to corresponding bits.use command line arguments.
//example:
//suppose our input file name=myfile.txt which contains ABCD.
// the output file name=bitfile.txt which contains 010000101000010100001101000100
//c:\java\bin>java_bit_conversion myfile.txt bitfile.txt<enter>
import java.io.*;

public class BitConversion {
    public static void main(String[] args) throws IOException {
        // Check if two command-line arguments are provided
        if (args.length != 2) {
            System.out.println("Usage: java BitConversion <input_file> <output_file>");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];

        // Declare file streams
        FileInputStream fis = null;
        FileWriter writer = null;

        // Open files
        fis = new FileInputStream(inputFile);
        writer = new FileWriter(outputFile);

        // Read and convert characters
        int ch;
        while ((ch = fis.read()) != -1) {
            String binaryStr = String.format("%8s", Integer.toBinaryString(ch)).replace(' ', '0');
            writer.write(binaryStr);
        }

        // Manually close files
        fis.close();
        writer.close();

        System.out.println("Conversion complete. Output written to: " + outputFile);
    }
}
