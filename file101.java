/* 
JAVA PROGRAM:

✔ Reads a file
✔ Skips the header line
✔ Counts:

		Records (excluding header)
		Total characters
		Total words
		Vowels, consonants, digits, special characters
✔ Prints a summary		*/


import java.io.*;
import java.util.*;

public class file101 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== FILE ANALYZER MENU ===");
            System.out.println("1. Analyze a file");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();				 // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the file name (with path if needed): ");
                    String fileName = sc.nextLine();
                    analyzeFile(fileName);
                    break;

                case 2:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 2);

        sc.close();
    }

    public static void analyzeFile(String fileName) {
        int recordCount = 0;
        int totalChars = 0, totalWords = 0;
        int vowels = 0, consonants = 0, digits = 0, specialChars = 0;

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            boolean headerSkipped = false;

            System.out.println("\nAnalyzing file: " + fileName);

            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                // Skip header (first line)
                if (!headerSkipped) {
                    headerSkipped = true;
                    continue;
                }

                recordCount++;

                // Count fields (columns)
                String[] fields = line.split("\\s+");
                System.out.println("Record " + recordCount + " has " + fields.length + " fields.");

                // Count words and characters
                totalWords += fields.length;
                totalChars += line.length();

                // Analyze characters
                for (char ch : line.toCharArray()) {
                    if (Character.isLetter(ch)) {
                        char lower = Character.toLowerCase(ch);
                        if ("aeiou".indexOf(lower) != -1) vowels++;
                        else consonants++;
                    } else if (Character.isDigit(ch)) {
                        digits++;
                    } else if (!Character.isWhitespace(ch)) {
                        specialChars++;
                    }
                }
            }

            // Print summary
            System.out.println("\n=== FILE SUMMARY ===");
            System.out.println("Number of records (excluding header): " + recordCount);
            System.out.println("Total characters: " + totalChars);
            System.out.println("Total words (fields): " + totalWords);
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("Digits: " + digits);
            System.out.println("Special characters: " + specialChars);

        } catch (IOException e) {
            System.out.println("Error reading file: " + fileName);
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

