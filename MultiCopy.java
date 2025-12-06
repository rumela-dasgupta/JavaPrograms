import java.io.*;

class MultiCopy {
    public static void main(String[] args) throws Exception {

        // args[0] = target file
        FileOutputStream fout = new FileOutputStream(args[0]);

        int b;

        // Copy each source file (from args[1] onwards)
        for (int i = 1; i < args.length; i++) {

            FileInputStream fin = new FileInputStream(args[i]);

            b = fin.read();

            while (b != -1) {
                fout.write(b);
                b = fin.read();
            }

            fin.close();   // close current source file
        }

        fout.close();      // close the target file

        System.out.println("All files copied successfully into " + args[0]);
    }
}
