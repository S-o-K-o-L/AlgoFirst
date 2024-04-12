import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String newPhone = scanner.nextLine();
        StringBuilder newPhoneDigits = new StringBuilder();

        String code;
        String number;

        int pos = 0;
        while (pos < newPhone.length()) {
            if (newPhone.charAt(pos) != '-'
                    && newPhone.charAt(pos) != '('
                    && newPhone.charAt(pos) != '+'
                    && newPhone.charAt(pos) != ')') {
                newPhoneDigits.append(newPhone.charAt(pos));
            }
            pos++;
        }

        if (newPhoneDigits.length() == 7) {
            code = "495";
            number = newPhoneDigits.toString();
        } else {
            if (newPhoneDigits.charAt(0) == '+') {
                code = newPhoneDigits.substring(2, 5);
                number = newPhoneDigits.substring(5);
            } else {
                code = newPhoneDigits.substring(1, 4);
                number = newPhoneDigits.substring(4);
            }
        }


        String phoneInPhoneBook;
        for (int i = 0; i < 3; i++) {
            phoneInPhoneBook = scanner.nextLine();
            StringBuilder phoneInPhoneBookDigits = new StringBuilder();

            pos = 0;
            while (pos < phoneInPhoneBook.length()) {
                if (phoneInPhoneBook.charAt(pos) != '-'
                        && phoneInPhoneBook.charAt(pos) != '('
                        && phoneInPhoneBook.charAt(pos) != '+'
                        && phoneInPhoneBook.charAt(pos) != ')') {
                    phoneInPhoneBookDigits.append(phoneInPhoneBook.charAt(pos));
                }
                pos++;
            }

            String currentCode;
            String currentNumber;

            if (phoneInPhoneBookDigits.length() == 7) {
                currentCode = "495";
                currentNumber = phoneInPhoneBookDigits.toString();
            } else {
                if (phoneInPhoneBookDigits.charAt(0) == '+') {
                    currentCode = phoneInPhoneBookDigits.substring(2, 5);
                    currentNumber = phoneInPhoneBookDigits.substring(5);
                } else {
                    currentCode = phoneInPhoneBookDigits.substring(1, 4);
                    currentNumber = phoneInPhoneBookDigits.substring(4);
                }
            }

            if (code.equals(currentCode) && number.equals(currentNumber)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}