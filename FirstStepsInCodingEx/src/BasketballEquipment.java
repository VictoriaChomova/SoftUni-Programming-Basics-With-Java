import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tax = Integer.parseInt(scanner.nextLine());

        double sneakers = tax - (tax * 40 / 100.0);
        double clothes = sneakers - (sneakers * 20 / 100);
        double ball = clothes / 4;
        double accessories = ball / 5;
        double total = sneakers + clothes + ball + accessories + tax;

        System.out.println(total);
    }
}
