//spy number
import java.util.Scanner;

public class SpyNumber {
    public static boolean isSpyNumber(int num) {
        int sum = 0;
        int product = 1;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        return sum == product;
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int number = S.nextInt();

        if (isSpyNumber(number)) {
            System.out.println(number + " is a Spy Number.");
        } else {
            System.out.println(number + " is NOT a Spy Number.");
        }

        scanner.close();
    }
}
