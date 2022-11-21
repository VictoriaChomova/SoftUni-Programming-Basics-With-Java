import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int liquid = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (nylon + 2) * 1.5 ;
        double paintPrice = (paint + paint*0.1) * 14.5;
        double liquidPrice = liquid * 5;
        double workers = hours * ((nylonPrice + paintPrice + liquidPrice + 0.4) * 30/100);
        double TotalPrice = nylonPrice + paintPrice + liquidPrice + workers + 0.4;

        System.out.println(TotalPrice);
    }
}
