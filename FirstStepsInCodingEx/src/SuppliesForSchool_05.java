import java.util.Scanner;

public class SuppliesForSchool_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int cleaner = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double pensPrice = pens * 5.8;
        double markersPrice = markers * 7.20;
        double cleanerPrice = cleaner * 1.20;
        double totalPrice = (pensPrice + markersPrice + cleanerPrice);
        double totalPriceAfterDiscount = totalPrice - (totalPrice * discount/100);

        System.out.println(totalPriceAfterDiscount);

    }
}
