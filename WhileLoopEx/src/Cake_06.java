import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int wight = Integer.parseInt(scanner.nextLine());

        int cakePieces = length * wight;

        while (cakePieces > 0) {
            String input = scanner.nextLine();
            if (!input.equals("STOP")) {
                int piecesTaken = Integer.parseInt(input);
                cakePieces -= piecesTaken;
            } else {
                break;
            }
        }
        if (cakePieces >= 0) {
            System.out.printf("%d pieces are left.", cakePieces);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakePieces));
        }
    }

}
