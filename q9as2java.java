import java.io.*;
import java.util.*;

class q9as2java {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = S.nextLine();

        int nw = 0; // word count
        int flag = 1; //we hit the first character of a word
        String word = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                if (flag == 1) {
                    nw++;
                    flag = 0;
                }
                word += ch;
            } else {
                if (word!="") {
                    System.out.println(word);
                    word = "";
                }
                flag = 1;
            }
        }

        
        if (!word.equals("")) {
            System.out.println(word);
        }

        System.out.println("Total number of words: " + nw);
    }
}
