import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dogPacks = Integer.parseInt(scan.nextLine());
        int catPacks = Integer.parseInt(scan.nextLine());
        double dogPrice = 2.5;
        int catPrice = 4;
        System.out.println(dogPacks * dogPrice + catPacks * catPrice);

    }
}
