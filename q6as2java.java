import java.util.*;

public class q6as2java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        
        String trimmedSentence = sentence.trim();

        System.out.println("Original sentence: \"" + sentence + "\"");
        System.out.println("Modified sentence: \"" + trimmedSentence + "\"");
    }
}
