import java.util.Scanner;

public class Hystogram_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        double countP1 = 0;
        double countP2 = 0;
        double countP3 = 0;
        double countP4 = 0;
        double countP5 = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num < 200) {
                countP1 += 1;
            } else if (num < 400) {
                countP2 += 1;
            } else if (num < 600) {
                countP3 += 1;
            } else if (num < 800) {
                countP4 += 1;
            } else {
                countP5 += 1;
            }
        }
        p1 = countP1 / n * 100;
        p2 = countP2 / n * 100;
        p3 = countP3 / n * 100;
        p4 = countP4 / n * 100;
        p5 = countP5 / n * 100;
        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n", p1, p2, p3, p4, p5);
    }
}

