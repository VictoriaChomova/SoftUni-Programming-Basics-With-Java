import java.util.Scanner;

public class graduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int schoolYear = 0;
        double gradesSum = 0;
        int fails = 0;
        while (schoolYear < 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4.00) {
                gradesSum += grade;
            } else {
                fails++;
            }
            if (fails > 1) {
                System.out.printf("%s has been excluded at %d grade", name, schoolYear);
                break;
            }
            schoolYear++;
        }
            double averageGrade = gradesSum / schoolYear;
            if (fails < 2) {
                System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);
            }
        }
    }
