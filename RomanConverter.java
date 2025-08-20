import java.util.*;

public class RomanConverter {
    static int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    static String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    // Convert number → Roman
    static String toRoman(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                sb.append(symbols[i]);
            }
        }
        return sb.toString();
    }

    // Convert Roman → number
    static int toNumber(String roman) {
        int i = 0, result = 0;
        while (i < roman.length()) {
            String curr = String.valueOf(roman.charAt(i));
            int currVal = getValue(curr);

            int nextVal = 0;
            if (i + 1 < roman.length()) {
                String next = String.valueOf(roman.charAt(i + 1));
                nextVal = getValue(next);
            }

            if (nextVal > currVal) {
                result += (nextVal - currVal);
                i += 2; // Skip two symbols
            } else {
                result += currVal;
                i++;
            }
        }
        return result;
    }

    // Helper: get integer value of Roman symbol
    static int getValue(String s) {
        switch (s) {
            case "I": return 1;
            case "V": return 5;
            case "X": return 10;
            case "L": return 50;
            case "C": return 100;
            case "D": return 500;
            case "M": return 1000;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Roman Converter ---");
            System.out.println("1. Number to Roman");
            System.out.println("2. Roman to Number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    System.out.println("Roman numeral: " + toRoman(num));
                    break;
                case 2:
                    System.out.print("Enter a Roman numeral: ");
                    String roman = sc.nextLine().toUpperCase();
                    System.out.println("Number: " + toNumber(roman));
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 3);
    }
}
