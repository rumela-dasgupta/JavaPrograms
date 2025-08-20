import java.util.*;

public class q5as2java1 {
    static String ReverseSentence(String s) {
        // Step 1: Split sentence into words
        String[] words = s.split(" ");

        // Step 2: Reverse words using StringBuilder
        StringBuilder f = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            f.append(words[i]);   // add word
            if (i > 0) {          // add space except for last word
                f.append(" ");
            }
        }
        return f.toString();
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter Sentence: ");
        String s = S.nextLine();

        String p = ReverseSentence(s);
        System.out.println("New Sentence: " + p);
    }
}
