import java.io.*;

class ExtractText {
    public static void main(String[] args) throws Exception {

        if (args.length != 2) {
            System.out.println("Usage: java ExtractText sourcefile targetfile");
            return;
        }

        FileInputStream fin = new FileInputStream(args[0]);
        FileOutputStream fout = new FileOutputStream(args[1]);

        int b;

        while ((b = fin.read()) != -1) {

            
            if (b >= 32 && b <= 126) { // readable range
                fout.write(b);
            }
        }

        fin.close();
        fout.close();

        System.out.println("Text extracted successfully.");
    }
}
