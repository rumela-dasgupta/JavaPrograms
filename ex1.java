// Simple Calculator 

import java.io.*;
import java.util.Scanner;

class ex1 {
    public static void main(String args[]) throws IOException {
        Scanner S = new Scanner(System.in);
        int a, b, s, d, f, prod, div1 = 1, amodb = 1;
        float div2 = 1;
        int ch;

        do {
            System.out.print("Enter a: ");
            a = S.nextInt();

            System.out.print("Enter b: ");
            b = S.nextInt();

            s = a + b;
            d = a - b;
            prod = a * b;

            if (b != 0) {
                div1 = a / b;
                div2 = a / (float) b;
                amodb = a % b;
            }

            System.out.println(a + " + " + b + " = " + s);
            System.out.println(a + " - " + b + " = " + d);
            System.out.println(a + " * " + b + " = " + prod);

            if (b != 0) {
                System.out.println(a + " / " + b + " = " + div1);
                System.out.println(a + " / (float) " + b + " = " + div2);
                System.out.println(a + " % " + b + " = " + amodb);
            }

            System.out.print("Type 1 to continue and any other number to stop: ");
            ch = S.nextInt();

        } while (ch == 1);
    }
}