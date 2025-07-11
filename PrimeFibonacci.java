import java.io.*;
import java.util.Scanner;

class PrimeFibonacci {

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter n (<= 2000): ");
        int n = S.nextInt();

        if (n > 2000 || n < 0) {
            System.out.println("Invalid input. Please enter a number ≤ 2000.");
            return;
        }

        int a = 0, b = 1;
        int c=0;

        System.out.println("Prime Fibonacci numbers <= " + n + ":");
        while (a <= n) {
            if (isPrime(a)) {
                System.out.println(a);
                c++;
            }
            int nxt = a + b;
            a = b;
            b = nxt;
        }
        System.out.println("Total number of prime fibonacci numbers upto "+n+" is "+c);
        


        //S.close(); 
    }
}
