import java.util.Scanner;

public class VacationBooksList_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pagesInBook = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int hoursNeeded = pagesInBook / pagesPerHour;
        int hoursPerDay = hoursNeeded / days;

        System.out.println(hoursPerDay);


    }
}
