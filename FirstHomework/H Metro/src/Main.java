import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInterval = scanner.nextInt();
        int secondInterval = scanner.nextInt();
        int countFirstTrains = scanner.nextInt();
        int countSecondTrains = scanner.nextInt();

        int firstMinTime = countFirstTrains + (countFirstTrains - 1) * firstInterval;
        int firstMaxTime = countFirstTrains + (countFirstTrains + 1) * firstInterval;

        int secondMinTime = countSecondTrains + (countSecondTrains - 1) * secondInterval;
        int secondMaxTime = countSecondTrains + (countSecondTrains + 1) * secondInterval;

        if (firstMinTime > secondMaxTime || firstMaxTime < secondMinTime) {
            System.out.println(-1);
            return;
        }

        if (firstMinTime >= secondMinTime && firstMaxTime <= secondMaxTime) {
            System.out.println(firstMinTime + " " + firstMaxTime);
            return;
        }

        if (firstMinTime <= secondMinTime && firstMaxTime >= secondMaxTime) {
            System.out.println(secondMinTime + " " + secondMaxTime);
            return;
        }

        if (firstMinTime == secondMaxTime) {
            System.out.println(firstMinTime + " " + firstMinTime);
            return;
        }

        if (secondMinTime == firstMaxTime) {
            System.out.println(secondMinTime + " " + secondMinTime);
            return;
        }

        int minTime;
        int maxTime;
        if (firstMinTime < secondMaxTime && firstMinTime > secondMinTime) {
            minTime = firstMinTime;
            maxTime = secondMaxTime;
        } else {
            minTime = secondMinTime;
            maxTime = firstMaxTime;
        }
        System.out.println(minTime + " " + maxTime);
    }
}