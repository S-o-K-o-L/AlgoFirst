import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int roomTemperature = scanner.nextInt();
        int conditionerTemperature = scanner.nextInt();
        String typeOfWorkForConditioner = scanner.next();

        if (typeOfWorkForConditioner.equals("freeze")) {
            System.out.println(Math.min(roomTemperature, conditionerTemperature));
            return;
        }

        if (typeOfWorkForConditioner.equals("heat")) {
            System.out.println(Math.max(roomTemperature, conditionerTemperature));
            return;
        }

        if (typeOfWorkForConditioner.equals("auto")) {
            System.out.println(conditionerTemperature);
            return;
        }

        if (typeOfWorkForConditioner.equals("fan")) {
            System.out.println(roomTemperature);
            return;
        }
    }
}