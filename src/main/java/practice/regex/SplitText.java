package practice.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitText {

  public static void main(String[] args) {
    String text = "The first idea that had emerged from that necessity was a concept of multi-tasking. " +
            "Nowadays we don’t pay much attention to the fact that our computers perform many tasks at once, " +
            "and that with our computers we can, for example, work and listen to music at the same time. " +
            "But in the 1950s this idea turned out to be revolutionary.";
    System.out.println(splitTextIntoWords(text));
  }

  public static String splitTextIntoWords(String text) {
    //TODO реализуйте метод
    String result = "";
    Pattern pattern = Pattern.compile("[A-Za-z]+");
    Matcher matcher = pattern.matcher(text);
    while (matcher.find()) {
      int start = matcher.start();
      int end = matcher.end();
      System.out.println(text.substring(start, end));
      result = result + matcher.group() + "\n";
    }
    return result.trim();
  }

}