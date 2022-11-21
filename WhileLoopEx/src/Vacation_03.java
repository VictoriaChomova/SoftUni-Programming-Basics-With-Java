import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationPrice = Double.parseDouble(scanner.nextLine());
        double moneyOnHand = Double.parseDouble(scanner.nextLine());
        int spendDays = 0;
        int daysCount = 0;

        while (spendDays < 5) {
            String action = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());
            daysCount++;

            if (action.equals("spend")) {
                moneyOnHand -= amount;
                spendDays++;
                if (moneyOnHand < 0) {
                    moneyOnHand = 0;
                }
            } else {
                moneyOnHand += amount;
                spendDays = 0;
            }

            if (moneyOnHand >= vacationPrice) {
                System.out.printf("You saved the money for %d days.", daysCount);
                break;
            }
        }
        if (spendDays == 5) {
            System.out.printf("You can't save the money.%n%d", daysCount);
        }
    }
}
