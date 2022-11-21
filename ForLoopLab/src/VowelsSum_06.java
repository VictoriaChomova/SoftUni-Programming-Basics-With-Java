import java.util.Scanner;

public class VowelsSum_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int amount = 0;
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            switch (letter) {
                case 'a':
                    amount += 1;
                    break;
                case 'e':
                    amount += 2;
                    break;
                case 'i':
                    amount += 3;
                    break;
                case 'o':
                    amount += 4;
                    break;
                case 'u':
                    amount += 5;
                    break;
            }
        }
        System.out.println(amount);
    }
}
