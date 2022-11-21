import java.util.Scanner;

public class NumberSequence_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int smallest = Integer.MAX_VALUE;
        int biggest = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num < smallest) {
                 smallest = num;
            }
            if (num > biggest) {
                biggest = num;
            }
        }
        System.out.printf("Max number: %d%n" + "Min number: %d", biggest, smallest);

    }
}

