package practice.regex;
import java.util.Scanner;

public class PhoneCleanerRegex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                scanner.close();
                break;
            }

            // TODO:напишите ваш код тут, результат вывести в консоль.
            String regex = "[^0-9]";
            String phoneNumber = input.replaceAll(regex, "");

            if (phoneNumber.length() == 10) {
                System.out.println("7" + phoneNumber);
            } else if (phoneNumber.length() <= 11 && phoneNumber.length() >= 10) {
                if ((phoneNumber.charAt(0) == '7') || (phoneNumber.charAt(0) == '8')) {
                    phoneNumber = phoneNumber.replaceFirst("[0-9]", "7");
                    System.out.println(phoneNumber);
                } else {
                    System.out.println("Неверный формат номера");
                }
                break;
            } else {
                System.out.println("Неверный формат номера");
                break;
            }
        }
    }
}
