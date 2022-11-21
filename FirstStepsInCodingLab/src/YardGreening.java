import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double area = Double.parseDouble(scan.nextLine());
        double price = area * 7.61;
        double discount = price * 0.18;
        double finalprice = price - discount;
        System.out.printf("The final price is %f.", finalprice);
        System.out.printf("\nThe discount is %f\n", discount);
    }
}
