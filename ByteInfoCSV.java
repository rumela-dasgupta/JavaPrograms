import java.io.*;

class ByteInfoCSV {
    public static void main(String[] args) throws Exception {

        if (args.length < 1) {
            System.out.println("Usage: java ByteInfoCSV <inputfile>");
            return;
        }

        FileInputStream fin = new FileInputStream(args[0]);
        PrintWriter pw = new PrintWriter("output.csv");

        // Write CSV header
        pw.println("ByteNumber,Character,ASCII");

        int b;
        int count = 0;

    while ((b = fin.read()) != -1) {
    count++;

    char ch = (char)b;

    String charField;

    // Handle non-printable characters
    if (ch >= 32 && ch <= 126) {
        charField = String.valueOf(ch);
    } else {
        charField = "<nonprintable>";
    }

    pw.println(count + "," + charField + "," + b);
}

        fin.close();
        pw.close();

        System.out.println("CSV created: output.csv");
    }
}
