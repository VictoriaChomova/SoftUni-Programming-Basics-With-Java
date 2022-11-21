import java.util.Scanner;

public class Moving_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wight = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        int freeSpace = wight * length * height;

        while (freeSpace >= 0) {
            String input = scanner.nextLine();
            if (input.equals("Done")) {
                flag = true;
                break;
            } else {
                int boxes = Integer.parseInt(input);
                freeSpace -= boxes;
            }
        }
        if (flag) {
            System.out.printf("%d Cubic meters left.", freeSpace);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(freeSpace));
        }
    }
}
