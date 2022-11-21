import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String increase = scanner.nextLine();
        double total = 0;

        while (!increase.equals("NoMoreMoney")) {
            double money = Double.parseDouble(increase);

            if (money < 0) {
                System.out.println("Invalid operation!");
                break;
            } else {
                System.out.printf("Increase: %.2f%n", money);
                total += money;
                increase = scanner.nextLine();
            }
        } System.out.printf("Total: %.2f", total);
    }
}
