import java.util.*;

public class q7as2java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Input word/pattern to search
        System.out.print("Enter pattern to search: ");
        String oldPattern = sc.nextLine();

        // Input new word/pattern
        System.out.print("Enter new pattern to replace with: ");
        String newPattern = sc.nextLine();

        //  Replace old pattern with new one
        String modifiedSentence = sentence.replace(oldPattern, newPattern);

        System.out.println("Original sentence: " + sentence);
        System.out.println("Modified sentence: " + modifiedSentence);
    }
}
