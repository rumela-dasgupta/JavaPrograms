import java.io.*;

class SumDigits {
    public static void main(String[] args) throws Exception {

        FileInputStream fin = new FileInputStream(args[0]);

        int b = fin.read();
        int sum = 0;

        while (b != -1) {

            if (b >= '0' && b <= '9') {
                int digit = b - '0';   // convert ASCII to number
                sum = sum + digit;
            }

            b = fin.read();   // read next byte
        }

        fin.close();

        System.out.println("Sum of digits = " + sum);
    }
}
