import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        double totalMoneySaved = 0;

        while (!destination.equals("End")) {
            double budget = Double.parseDouble(scanner.nextLine());

            while (totalMoneySaved < budget) {
                double currentMoneySaved = Double.parseDouble(scanner.nextLine());

                totalMoneySaved += currentMoneySaved;
            }
            totalMoneySaved = 0;
            System.out.printf("Going to %s!%n", destination);
            destination = scanner.nextLine();
        }
    }
}