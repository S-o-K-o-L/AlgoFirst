import java.util.Scanner;

public class Main {
    static class Data {
        int width;
        int height;
        int area;

        public Data(int width, int height) {
            this.width = width;
            this.height = height;
            this.area = width * height;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int c = scanner.nextInt();
        int d = scanner.nextInt();

        Data[] tableArea = new Data[4];
        tableArea[0] = new Data(a + c, Math.max(b, d));
        tableArea[1] = new Data(a + d, Math.max(b, c));
        tableArea[2] = new Data(b + c, Math.max(a, d));
        tableArea[3] = new Data(b + d, Math.max(a, c));
        Data minArea = tableArea[0];
        for (int i = 1; i < 4; i++) {
            if (tableArea[i].area < minArea.area) {
                minArea = tableArea[i];
            }
        }
        System.out.println(minArea.width + " " + minArea.height);
    }
}