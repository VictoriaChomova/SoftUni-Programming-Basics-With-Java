import java.util.Scanner;

public class OddEvenSum_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }

        }
        if (sumEven == sumOdd) {
            System.out.printf("Yes%n Sum = %d", sumEven);
        } else {
            System.out.printf("No%n Diff = %d", Math.abs(sumEven - sumOdd));
        }
    }
}
