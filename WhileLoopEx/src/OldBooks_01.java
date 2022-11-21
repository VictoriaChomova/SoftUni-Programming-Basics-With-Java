import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookWanted = scanner.nextLine();
        String currentBook = "";
        int bookCount = 0;

        while (!currentBook.equals(bookWanted)) {
            currentBook = scanner.nextLine();

            if (currentBook.equals("No More Books")) {
                System.out.printf("The book you search is not here!%nYou checked %d books.", bookCount);
                break;
            } else if (currentBook.equals(bookWanted)) {
                System.out.printf("You checked %d books and found it.", bookCount);
            }

            bookCount++;
        }
    }
}
