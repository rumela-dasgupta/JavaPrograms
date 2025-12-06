import java.io.*;

class ShowFile {
    public static void main(String[] args) throws Exception {

        // Open the file given in command-line
        FileInputStream fin = new FileInputStream(args[0]);

        int b = fin.read();

        // Read bytes until EOF
        while (b != -1) {
            System.out.print((char)b);   // print as character
            b = fin.read();              // read next byte
        }

        fin.close();
    }
}