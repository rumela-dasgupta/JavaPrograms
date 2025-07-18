//KrishnaMurthy Number
import java.util.Scanner;

public class KrishnamurthyNumber {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isKrishnamurthy(int num) {
        int sum = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int number = scanner.nextInt();

        if (isKrishnamurthy(number)) {
            System.out.println(number + " is a Krishnamurthy number.");
        } else {
            System.out.println(number + " is NOT a Krishnamurthy number.");
        }

        scanner.close();
    }
}
