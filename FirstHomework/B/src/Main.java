import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstSide = scanner.nextInt();
        int secondSide = scanner.nextInt();
        int thirdSide = scanner.nextInt();

        if (firstSide == 0 || secondSide == 0 || thirdSide == 0) {
            System.out.println("NO");
            return;
        }

        if (firstSide + secondSide <= thirdSide) {
            System.out.println("NO");
            return;
        }

        if (thirdSide + secondSide <= firstSide) {
            System.out.println("NO");
            return;
        }

        if (firstSide + thirdSide <= secondSide) {
            System.out.println("NO");
            return;
        }

        System.out.println("YES");
    }
}