import java.util.Scanner;

public class Oscars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double score = Double.parseDouble(scanner.nextLine());
        int juryCount = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= juryCount; i++) {
            String juryName = scanner.nextLine();
            double juryScore = Double.parseDouble(scanner.nextLine());
            score = score + (juryName.length() * juryScore)/ 2;
            if (score > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, score);
                return;
            }
        }
        System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - score);
    }
}
