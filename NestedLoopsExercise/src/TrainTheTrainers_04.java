import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juryCount = Integer.parseInt(scanner.nextLine());
        String presentationName = scanner.nextLine();
        double sumAllGrades = 0;
        int presentationsCount = 0;

        while (!presentationName.equals("Finish")) {
            double gradesSum = 0;
            for (int i = 1; i <= juryCount; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                gradesSum += grade;
            }
            double averageGrade = gradesSum / juryCount;
            sumAllGrades += averageGrade;
            presentationsCount++;

            System.out.printf("%s - %.2f.%n", presentationName, averageGrade);
            presentationName = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.", sumAllGrades / presentationsCount);
    }
}

