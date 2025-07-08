// °C to °F Conversion

import java.io.*;
import java.util.Scanner;

class ex2 {
    public static void main(String args[]) {
        double c = 10.0, f;

        for (c = 0; c <= 100; c += 10) {
            f = ((9/5 * c) + 32);
            System.out.println("C = " + c + " and F = " + f);
        }
    }
}