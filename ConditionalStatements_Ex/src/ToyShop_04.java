import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        int toys = puzzles + dolls + bears + minions + trucks;
        double money = puzzles * 2.6 + dolls * 3 + bears * 4.10 + minions * 8.20 + trucks * 2;

        if (toys >= 50) {
            money = money - 25 / 100.0 * money;
        }
        double totalMoney = money - 10 / 100.0 * money;
        double moneyLeft = totalMoney - tripPrice;
        if (totalMoney >= tripPrice) {
            System.out.printf("Yes! %.2f lv left.", moneyLeft);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(moneyLeft));

        }
    }
}
