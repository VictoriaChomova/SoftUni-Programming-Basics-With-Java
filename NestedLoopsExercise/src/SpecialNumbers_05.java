import java.util.Scanner;

public class SpecialNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean flag = false;

        for (int i = 1111; i <= 9999; i++) {
            int num = i;
            String number = "" + i;
            for (int j = 1; j <= number.length(); j++) {
                int digit = num % 10;

                if (digit == 0) {
                    flag = false;
                    break;
                }
                if (n % digit == 0) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
                num = num / 10;
            }
            if (flag) {
                System.out.print(i + " ");
            }
        }
    }
}
