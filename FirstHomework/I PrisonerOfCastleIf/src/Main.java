import java.util.Scanner;

public class Main {
    static class Side {
        int width;
        int height;

        public Side(int width, int height) {
            this.width = width;
            this.height = height;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int E = scanner.nextInt();

        Side firstSide = new Side(A, B);
        Side secondSide = new Side(B, C);
        Side thirdSide = new Side(A, C);

        if (check(D, E, firstSide, secondSide, thirdSide)) return;

        if (check(E, D, firstSide, secondSide, thirdSide)) return;
        System.out.println("NO");
    }

    private static boolean check(int d, int e, Main.Side firstSide, Main.Side secondSide, Main.Side thirdSide) {
        if (firstSide.width <= d && firstSide.height <= e) {
            System.out.println("YES");
            return true;
        }
        if (secondSide.width <= d && secondSide.height <= e) {
            System.out.println("YES");
            return true;
        }
        if (thirdSide.width <= d && thirdSide.height <= e) {
            System.out.println("YES");
            return true;
        }
        return false;
    }
}