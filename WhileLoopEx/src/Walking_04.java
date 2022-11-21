import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int allStepsCount = 0;

        while (allStepsCount < 10000) {
            String input = scanner.nextLine();
            if (input.equals("Going home")) {
                allStepsCount += Integer.parseInt(scanner.nextLine());
                break;
            }
            int steps = Integer.parseInt(input);
            allStepsCount += steps;
        }
        if (allStepsCount >= 10000) {
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", allStepsCount - 10000);
        } else {
            System.out.printf("%d more steps to reach goal.", 10000 - allStepsCount);
        }
    }
}


//            if (allStepsCount >= 10000) {
//                goalReached = true;
//                break;
//            }
//
//
//        }
//
//        if (input.equals("Going home")) {
//            input = scanner.nextLine();
//            int steps = Integer.parseInt(input);
//            allStepsCount += steps;
//            System.out.printf("%d more steps to reach goal.", 10000 - allStepsCount);
//        } else {
//            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", allStepsCount - 10000);
//        }
//    }
//}
