import java.util.Scanner;

public class NumberToRoman {
    public static String toRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                result.append(romans[i]);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1-3999): ");
        int n = sc.nextInt();

        if(n <= 0 || n > 3999) {
            System.out.println("Invalid input! Enter between 1 and 3999.");
        } else {
            System.out.println("Roman numeral: " + toRoman(n));
        }
    }
}
