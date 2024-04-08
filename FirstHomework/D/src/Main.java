import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (c < 0) {
            System.out.println("NO SOLUTION");
            return;
        }

        if (a == 0 && b != c * c) {
            System.out.println("NO SOLUTION");
            return;
        }

        if (a == 0 && b == c * c) {
            System.out.println("MANY SOLUTIONS");
            return;
        }

        if ((c * c - b) % a != 0) {
            System.out.println("NO SOLUTION");
        } else {
            System.out.println((c * c - b) / a);
        }
    }
}