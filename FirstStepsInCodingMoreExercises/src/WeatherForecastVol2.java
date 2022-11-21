import java.util.Scanner;

public class WeatherForecastVol2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double degrees = Double.parseDouble(scanner.nextLine());

        if (degrees >= 5 && degrees <= 11.9) {
            System.out.println("Cold");
        }
        if (degrees >= 12 && degrees <= 14.9) {
            System.out.println("Cool");
        }
        if (degrees >= 15 && degrees <= 20) {
            System.out.println("Mild");
        }
        if (degrees >= 20.1 && degrees <= 25.9) {
            System.out.println("Warm");
        }
        if (degrees >= 26 && degrees <= 35) {
            System.out.println("Hot");
        }
        if (degrees <= 4.9 || degrees >= 35.1) {
            System.out.println("unknown");
        }
    }
}
