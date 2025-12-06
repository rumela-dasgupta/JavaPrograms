import java.io.*;

class UpperToLower {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("input.txt");    
        FileWriter fw = new FileWriter("output.txt");  

        int ch;  // each character read as ASCII integer

        while ((ch = fr.read()) != -1) {   // read till end of file

            // check if ch is uppercase (A–Z)
            if (ch >= 'A' && ch <= 'Z') {                     //ch>='a'&&ch<='z'  =====for lower to upper
                ch = ch + 32;   // convert to lowercase       //ch=ch-32
            }

            fw.write(ch);  // write to output file
        }

        fr.close();
        fw.close();

        System.out.println("Conversion complete! Check output.txt");
    }
}
