import java.util.Scanner;

public class NumberProblems {
    
    // Prime Number Check
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Armstrong Number Check
    static boolean isArmstrong(int n) {
        int temp = n, sum = 0;
        int digits = String.valueOf(n).length();
        while (temp > 0) {
            int d = temp % 10;
            sum += Math.pow(d, digits);
            temp /= 10;
        }
        return sum == n;
    }

    // Factorial (for Krishnamurthi)
    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    // Krishnamurthi Number Check
    static boolean isKrishnamurthi(int n) {
        int temp = n, sum = 0;
        while (temp > 0) {
            int d = temp % 10;
            sum += fact(d);
            temp /= 10;
        }
        return sum == n;
    }

    // Spy Number Check (sum of digits == product of digits)
    static boolean isSpy(int n) {
        int sum = 0, prod = 1, temp = n;
        while (temp > 0) {
            int d = temp % 10;
            sum += d;
            prod *= d;
            temp /= 10;
        }
        return sum == prod;
    }

    // Happy Number Check
    static boolean isHappy(int n) {
        int slow = n, fast = n;
        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(digitSquareSum(fast));
        } while (slow != fast);

        return slow == 1;
    }

    static int digitSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n---- Number Problems Menu ----");
            System.out.println("1. Prime Number");
            System.out.println("2. Armstrong Number");
            System.out.println("3. Happy Number");
            System.out.println("4. Krishnamurthi Number");
            System.out.println("5. Spy Number");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 6) break;

            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            switch (choice) {
                case 1:
                    if (isPrime(n)){
                        System.out.println(n + " is Prime");

                    }else{System.out.println(n + " is not Prime");

                    }
                    
                    break;
                case 2:
                    System.out.println(n + (isArmstrong(n) ? " is Armstrong" : " is NOT Armstrong"));
                    break;
                case 3:
                    System.out.println(n + (isHappy(n) ? " is Happy" : " is NOT Happy"));
                    break;
                case 4:
                    System.out.println(n + (isKrishnamurthi(n) ? " is Krishnamurthi" : " is NOT Krishnamurthi"));
                    break;
                case 5:
                    System.out.println(n + (isSpy(n) ? " is Spy" : " is NOT Spy"));
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
