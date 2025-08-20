import java.util.*;

public class q9as2javareal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Step 2: Split sentence into words (by spaces)
        String[] words = sentence.trim().split("\\s+");

        // Step 3: Display each word
        System.out.println("Words in the sentence:");
        //for (String word : words) {
          //  System.out.println(word);
        //}
         for (int i = 0; i < words.length; i++) {
    System.out.println(words[i]);
}
        // Step 4: Display total count
        System.out.println("Total number of words: " + words.length);
    }
}
