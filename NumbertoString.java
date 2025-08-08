import java.io.*;
import java.util.*;

class NumbertoString {
    
    static String numbertostring(int n) {
        if (n == 0) return "Zero";
        
        // Units for numbers from 1 to 19
        String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
                           "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
                           "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
        
        // Tens place for numbers 20, 30, 40, ...
        String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
        
        
        String[] multiplier = { "", "Thousand", "Lakh", "Crore" };
        
        String res = "";
        int grp = 0;
        
        while (n > 0) {
            if (n % 1000!= 0) {
                int value = n % 1000;
                String temp = "";
                
                // Handle hundreds
                if (value >= 100) {
                    temp = units[value / 100] + " Hundred ";
                    value %= 100;
                }
                
                // Handle tens (20, 30, 40,...)
                if (value >= 20) {
                    temp += tens[value / 10] + " ";
                    value %= 10;
                }
                
                // Handle units (1, 2, 3,...)
                if (value > 0) {
                    temp += units[value] + " ";
                }
                
                // Add the corresponding multiplier (Thousand, Lakh, etc.)
                temp += multiplier[grp];
                res = temp + res;
            }
            
            n /= 1000;  // Remove the last 3 digits
            grp++;  // Move to the next group (Thousand, Lakh, Crore, etc.)
        }
        
        return res.trim();  // Trim the final result to remove any extra spaces
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = S.nextInt();
        System.out.println("Required solution is " + numbertostring(n));
    }
}
