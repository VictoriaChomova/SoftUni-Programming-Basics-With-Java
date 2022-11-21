import java.util.Scanner;

public class GodzillaVsKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int actors = Integer.parseInt(scanner.nextLine());
        double oneActorClothing = Double.parseDouble(scanner.nextLine());

        double allActorsClothing = actors * oneActorClothing;
        double decor = budget * 10 / 100.0;


        if (actors > 150) {
            allActorsClothing = allActorsClothing - allActorsClothing * 10 / 100;
        }

        double allExpenses = allActorsClothing + decor;
        double moneyLeft = budget - allExpenses;

        if (allExpenses > budget) {
            System.out.println("Not enough money! ");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(moneyLeft));
        } else {
            System.out.println("Action! ");
            System.out.printf("Wingard starts filming with %.2f leva left.", moneyLeft);
        }
    }
}
