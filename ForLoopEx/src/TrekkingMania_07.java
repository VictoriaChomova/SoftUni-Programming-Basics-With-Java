import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());
        int peopleCount = 0;
        int musala = 0;
        int monblan = 0;
        int kilimandzharo = 0;
        int k2 = 0;
        int everest = 0;

        for (int i = 1; i <= groups; i++) {
            int peopleInGroup = Integer.parseInt(scanner.nextLine());
            if (peopleInGroup <= 5) {
                musala += peopleInGroup;
                peopleCount += peopleInGroup;
            } else if (peopleInGroup <= 12) {
                monblan += peopleInGroup;
                peopleCount += peopleInGroup;
            } else if (peopleInGroup <= 25) {
                kilimandzharo += peopleInGroup;
                peopleCount += peopleInGroup;
            } else if (peopleInGroup <= 40) {
                k2 += peopleInGroup;
                peopleCount += peopleInGroup;
            } else {
                everest += peopleInGroup;
                peopleCount += peopleInGroup;
            }
        }
        System.out.printf("%.2f%%%n", musala * 1.00 / peopleCount * 100);
        System.out.printf("%.2f%%%n", monblan * 1.00 / peopleCount * 100);
        System.out.printf("%.2f%%%n", kilimandzharo * 1.00 / peopleCount * 100);
        System.out.printf("%.2f%%%n", k2 * 1.00 / peopleCount * 100);
        System.out.printf("%.2f%%%n", everest * 1.00 / peopleCount * 100);

    }
}
