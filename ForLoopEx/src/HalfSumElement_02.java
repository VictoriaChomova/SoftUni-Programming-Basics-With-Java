import java.util.Scanner;

public class HalfSumElement_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int biggestNumber = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;
            if (biggestNumber < num) {
                biggestNumber = num;
            }
        }
        sum = sum - biggestNumber;
        if (sum == biggestNumber) {
            System.out.printf("Yes%n Sum = %d", sum);
        } else {
            System.out.printf("No%n Diff = %d", Math.abs(sum - biggestNumber));
        }
    }
}

