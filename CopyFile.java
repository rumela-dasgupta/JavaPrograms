import java.io.*;

class CopyFile {
    public static void main(String[] args) throws Exception {

        FileInputStream fin = new FileInputStream("input.txt");
        FileOutputStream fout = new FileOutputStream("output.txt");

        int b;
        int count = 0;

        b = fin.read();       // first byte

        while (b != -1) {     // loop until end of file
            fout.write(b);    // write the byte
            count++;          // count bytes copied
            b = fin.read();   // read next byte
        }

        fin.close();
        fout.close();

        System.out.println("Bytes copied = " + count);
    }
}
