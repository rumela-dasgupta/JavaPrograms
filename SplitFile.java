import java.io.*;

class SplitFile {
    public static void main(String[] args) throws Exception {

        // args[0] = input file
        FileInputStream fin = new FileInputStream(args[0]);

        // Number of output files = args.length - 1
        int n = args.length - 1;

        // Create array of output streams
        FileOutputStream[] out = new FileOutputStream[n];

        // Open all output files
        for (int i = 0; i < n; i++) {
            out[i] = new FileOutputStream(args[i + 1]);
        }

        int b;
        int index = 0;   // decides which file to write next

        b = fin.read();

        while (b != -1) {

            out[index].write(b); // write to the correct file

            index++;             // move to next output file

            if (index == n)      // reset index if it reaches limit
                index = 0;

            b = fin.read();      // read next byte
        }

        // Close all
        fin.close();
        for (int i = 0; i < n; i++) {
            out[i].close();
        }

        System.out.println("File split into " + n + " parts successfully.");
    }
}
