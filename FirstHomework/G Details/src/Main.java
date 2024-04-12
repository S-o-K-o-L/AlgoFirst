import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int M = scanner.nextInt();

        int totalDetails = 0;

        if (K < M) {
            System.out.println(0);
            return;
        }

        int newK = K;
        while (N / K != 0) {
            N -= K;
            newK = K;
            while (newK / M != 0) {
                newK -= M;
                totalDetails++;
            }
            N += K % M;
        }
        System.out.println(totalDetails);
    }
}