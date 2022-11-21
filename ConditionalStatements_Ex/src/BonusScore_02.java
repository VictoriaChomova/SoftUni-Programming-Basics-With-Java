import java.util.Scanner;

public class BonusScore_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Integer.parseInt(scanner.nextLine());
        double bonus = 0;

        if (number <= 100) {
            bonus = number + 5;
        } else if (number > 1000) {
            bonus = number + (number * 10 / 100);
        } else {
            bonus = number + (number * 20 / 100);
        }
        if (number % 2 == 0) {
            bonus = bonus + 1;
        } else if (number % 10 == 5) {
            bonus = bonus + 2;
        }

        System.out.println(bonus-number);
        System.out.println(bonus);
    }
}
