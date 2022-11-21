import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordTime = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double secPerMeter = Double.parseDouble(scanner.nextLine());

        double ivanTime = meters * secPerMeter;
        double delay = Math.floor(meters / 15) * 12.5;
        double totalTime = ivanTime + delay;
        double timeDistance = totalTime - recordTime;

        if (totalTime < recordTime) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(timeDistance));
        }
    }
}
