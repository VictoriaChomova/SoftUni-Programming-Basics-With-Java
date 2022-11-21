import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegMenu = Integer.parseInt(scanner.nextLine());

        double chickenPrice = 10.35 * chickenMenu;
        double fishPrice = 12.4 * fishMenu;
        double VegPrice = 8.15 * vegMenu;

        double totalMenuPrice = chickenPrice + fishPrice + VegPrice;
        double dessertPrice = totalMenuPrice * 20 / 100.0;
        double totalPriceInclDessert = totalMenuPrice + dessertPrice + 2.5;

        System.out.println(totalPriceInclDessert);

    }
}
