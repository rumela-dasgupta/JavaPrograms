// °C to °F Conversion(user input)

import java.io.*;
import java.util.Scanner;

class ex2a {
    public static void main(String args[]) {
        Scanner S=new Scanner(System.in);
        double c, f;
        System.out.print("Enter degree in C: ");
        c=S.nextDouble();
        f = ((9/5 * c) + 32);
        System.out.println("C = " + c + " and F = " + f);
    }
}