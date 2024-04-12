import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        double e = scanner.nextDouble();
        double f = scanner.nextDouble();

        if (a == 0 && b == 0 && e != 0
                || c == 0 && d == 0 && f != 0) {
            System.out.println(0);
            return;
        }

        if (a == 0 && b == 0 && e == 0
                && c == 0 && d == 0 && f == 0) {
            System.out.println(5);
            return;
        }

        if (a == 0 && b == 0) {
            if (c!= 0 && d!=0) {
                System.out.println(1 + " " + (-c / d) + " " + f / d);
                return;
            } else if (c == 0) {
                System.out.println(4 + " " + f / d);
                return;
            } else {
                System.out.println(3 + " " + f / c);
                return;
            }
        }

        if (c == 0 && d == 0) {
            if (a!= 0 && b !=0) {
                System.out.println(1 + " " + (-a / b) + " " + e / b);
                return;
            } else if (a==0) {
                System.out.println(4 + " " + e / b);
                return;
            } else {
                System.out.println(3 + " " + e / a);
                return;
            }
        }

        if (b == 0 && d == 0) {
            if (e / a == f / c) {
                System.out.println(3 + " " + e / a);
                return;
            } else {
                System.out.println(0);
                return;
            }
        }

        if (a == 0 && c == 0) {
            if (e / b == f / d) {
                System.out.println(4 + " " + e / b);
                return;
            } else {
                System.out.println(0);
                return;
            }
        }



        if (a * d == c * b) {
            if (e * d == f * b) {
                System.out.println(1 + " " + (-a / b) + " " + e / b);
                return;
            } else {
                System.out.println(0);
                return;
            }
        }

        double y;
        double x;
        if (a != 0) {
            y = (a * f - c * e) / (a * d - c * b);
            x = (e - b * y) / a;
        } else {
            y = e / b;
            x = (f * b - d * e) / c * b;
        }
        System.out.println(2 + " " + x + " " + y);
    }
}