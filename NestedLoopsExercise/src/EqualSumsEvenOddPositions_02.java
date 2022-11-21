import java.util.Scanner;

public class EqualSumsEvenOddPositions_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        for (int i = a; i <= b; i++) {
            int oddSum = 0;
            int evenSum = 0;
            int num = i;
            int currentNum = num;
            for (int j = 6; j > 0; j--) {

                if (j % 2 == 0) {
                    evenSum += currentNum % 10;
                } else {
                    oddSum += currentNum % 10;
                }
                currentNum = currentNum / 10;

            }
            if (evenSum == oddSum) {
                System.out.print(num + " ");
            }

        }
    }
}
