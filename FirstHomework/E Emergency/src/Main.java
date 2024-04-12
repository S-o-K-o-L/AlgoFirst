import java.util.Scanner;

public class Main {
    static class DataFlat {
        int entrance;
        int floor;

        public DataFlat(int entrance, int floor) {
            this.entrance = entrance;
            this.floor = floor;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberApartment = scanner.nextInt();
        int countFloors = scanner.nextInt();
        int numberSecondApartment = scanner.nextInt();
        int numberEntranceSecond = scanner.nextInt();
        int numberFloorSecond = scanner.nextInt();

        int entrance = -1;
        int floor = -1;
        boolean goodFlag = false;
        for (int i = 1; i < 1000000; i++) {
            DataFlat dataFlat = check(numberApartment, numberSecondApartment, numberEntranceSecond, numberFloorSecond, i, countFloors);
            if (dataFlat.entrance != -1) {
                goodFlag = true;
                if (entrance == -1) {
                    entrance = dataFlat.entrance;
                    floor = dataFlat.floor;
                } else if (entrance != dataFlat.entrance && entrance != 0) {
                    entrance = 0;
                } else if (floor != dataFlat.floor && floor != 0) {
                    floor = 0;
                }
            }
        }
        if (goodFlag) {
            System.out.println(entrance + " " + floor);
        } else {
            System.out.println(-1 + " " + -1);
        }
    }

    public static DataFlat check(int flatNumberFirst, int flatNumberSecond,
                                 int entranceNumberSecond, int floorNumberSecond,
                                 int flatSonFloor, int floors) {
        int entrance = getEntrance(flatNumberSecond, flatSonFloor, floors);
        int floor = getFloor(flatNumberSecond, flatSonFloor, floors);
        if (entrance == entranceNumberSecond && floorNumberSecond == floor) {
            return new DataFlat(getEntrance(flatNumberFirst, flatSonFloor, floors),
                    getFloor(flatNumberFirst, flatSonFloor, floors));
        }
        return new DataFlat(-1, -1);
    }

    public static int getEntrance(int flatNumber, int flatSonFloor, int floors) {
        int floorsTotal = (flatNumber - 1) / flatSonFloor;
        return floorsTotal / floors + 1;
    }

    public static int getFloor(int flatNumber, int flatSonFloor, int floors) {
        int floorsTotal = (flatNumber - 1) / flatSonFloor;
        return floorsTotal % floors + 1;
    }
}