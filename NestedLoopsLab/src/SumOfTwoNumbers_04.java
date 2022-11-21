import java.util.Scanner;

public class SumOfTwoNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int combinationsCount = 0;
        boolean flag = false;
        for (int i = a; i <= b; i++) {
            for (int j = a; j <= b; j++) {
                combinationsCount++;
                if (i + j == magicNumber) {
                    flag = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", combinationsCount, i, j, magicNumber);
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        if (!flag) {
            System.out.printf("%d combinations - neither equals %d", combinationsCount, magicNumber);
        }
    }
}
