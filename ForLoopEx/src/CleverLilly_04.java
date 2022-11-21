import java.util.Scanner;

public class CleverLilly_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMaschine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int money = 0;
        int moneyFromToys = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                money = money + i * 5 - 1;
            } else {
                moneyFromToys += toyPrice;
            }
        }
        double totalMoney = money + moneyFromToys;
        if (totalMoney >= washingMaschine) {
            System.out.printf("Yes! %.2f", totalMoney - washingMaschine);
        } else {
            System.out.printf("No! %.2f", washingMaschine - totalMoney);
        }
    }
}
