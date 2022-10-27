package practice.string;
import java.util.Scanner;

public class SequentialWordsNumbers {

    public static String sequentialWordsNumbers(String text) {
        int number = 1;
        int start = 0;
        int end;

        StringBuilder words = new StringBuilder();

        for (int i = 0; i < text.length(); i++){
            String space = " ";
            end = text.indexOf(space, start);

            if(end == -1) {
                String word = text.substring(start);
                words = words.append(" (").append(number).append(") ").append(word);
                break;
            }

            String word = text.substring(start, end);
            words = words.append(" (").append(number).append(") ").append(word);
            start = end + 1;
            number++;
        }
        String textSplit = words.toString();
        return textSplit.trim();
    }
}

