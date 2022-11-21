import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int poorGradesNeeded = Integer.parseInt(scanner.nextLine());
        int poorGradesCount = 0;
        boolean isFailed = false;
        String problemName = scanner.nextLine();
        int allGradesSum = 0;
        int allGradesCount = 0;
        String lastProblem = "";


        while (!problemName.equals("Enough")) {

            int currentGrade = Integer.parseInt(scanner.nextLine());
            allGradesCount++;
            allGradesSum += currentGrade;
            lastProblem = problemName;

            if (currentGrade <= 4) {
                poorGradesCount++;
            }
            if (poorGradesCount == poorGradesNeeded) {
                isFailed = true;
                break;
            }
            problemName = scanner.nextLine();
        }


        double avarageScore = allGradesSum * 1.00 / allGradesCount;

        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.%n", poorGradesCount);
        } else {
            System.out.printf("Average score: %.2f\n" +
                    "Number of problems: %d\n" +
                    "Last problem: %s", avarageScore, allGradesCount, lastProblem);
        }
    }
}


