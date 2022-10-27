package practice.string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите текст:");
        String text = new Scanner(System.in).nextLine();
        System.out.println("Результат:");
        System.out.println(SequentialWordsNumbers.sequentialWordsNumbers(text));
    }
}
