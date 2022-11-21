import java.util.Scanner;

public class MinNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minNumber = Integer.MAX_VALUE;
        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            int number = Integer.parseInt(input);

            if (number < minNumber) {
                minNumber = number;
            }
            input = scanner.nextLine();
        }
        System.out.println(minNumber);
    }
}
