import java.util.Scanner;

public class CinemaTicketsa_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        int totalTicketsCounter = 0;
        int studentTickets = 0;
        int standardTickets = 0;
        int kidsTickets = 0;

        while (!movie.equals("Finish")) {

            int availableSeats = Integer.parseInt(scanner.nextLine());
            String ticketType = scanner.nextLine();
            int seatsCounter = 0;


            while (!ticketType.equals("End")) {
                seatsCounter++;

                switch (ticketType) {
                    case "student":
                        studentTickets++;
                        break;
                    case "standard":
                        standardTickets++;
                        break;
                    case "kid":
                        kidsTickets++;
                        break;
                }
                if (seatsCounter == availableSeats) {
                    break;
                }
                ticketType = scanner.nextLine();


            }
            double percentSeatsTaken = seatsCounter * 1.0 / availableSeats * 100;

            totalTicketsCounter += seatsCounter;

            System.out.printf("%s - %.2f%% full.%n", movie, percentSeatsTaken );
            movie = scanner.nextLine();
        }
        double percentStudentTickets = studentTickets * 1.0 / totalTicketsCounter * 100;
        double percentStandardTickets = standardTickets * 1.0 / totalTicketsCounter * 100;
        double percentKidsTickets = kidsTickets * 1.0 / totalTicketsCounter * 100;

        System.out.printf("Total tickets: %d%n", totalTicketsCounter);
        System.out.printf("%.2f%% student tickets.%n", percentStudentTickets);
        System.out.printf("%.2f%% standard tickets.%n", percentStandardTickets);
        System.out.printf("%.2f%% kids tickets.%n", percentKidsTickets);
    }
}
