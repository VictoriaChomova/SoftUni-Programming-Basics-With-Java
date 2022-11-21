import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int graphicsCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double graphicsCardPrice = 250 * graphicsCards;
        double processorPrice = processors * graphicsCardPrice * 35 / 100;
        double ramPrice = ram * graphicsCardPrice * 10 / 100;

        double totalPrice = graphicsCardPrice + processorPrice + ramPrice;

        if (graphicsCards > processors) {
            totalPrice = totalPrice - totalPrice * 15 / 100;
        }

        double moneyLeft = money - totalPrice;

        if (money >= totalPrice) {
            System.out.printf("You have %.2f leva left!", moneyLeft);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(moneyLeft));
        }
    }
}

