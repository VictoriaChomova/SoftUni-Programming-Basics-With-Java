import java.util.Scanner;

public class TennisRanklist_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int startScore = Integer.parseInt(scanner.nextLine());
        int currentScore = 0;
        int winCount = 0;

        for (int i = 1; i <= tournaments; i++) {
            String stage = scanner.nextLine();

            switch (stage) {
                case "W":
                    currentScore += 2000;
                    winCount++;
                    break;
                case "F":
                    currentScore += 1200;
                    break;
                case "SF":
                    currentScore += 720;
                    break;
            }
        } System.out.printf("Final points: %d%n", startScore + currentScore);
        System.out.printf("Average points: %.0f%n", Math.floor(currentScore * 1.0/tournaments));
        System.out.printf("%.2f%%", winCount * 1.00 / tournaments * 100);
    }
}
