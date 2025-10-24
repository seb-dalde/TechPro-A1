import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Student Grade Calculator!");
        System.out.println("This program determines your grade based on your test score.");
        System.out.println("\nGrading Criteria:");
        System.out.println(" - 90 and above: A");
        System.out.println(" - 80 to 89: B");
        System.out.println(" - 70 to 79: C");
        System.out.println(" - 60 to 69: D");
        System.out.println(" - Below 60: F\n");

        System.out.print("Enter your test score: ");
        double score = input.nextDouble();

        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\nYour score is: " + score);
        System.out.println("Your grade is: " + grade);

        if (grade == 'A') {
            System.out.println("Excellent work! Keep it up!");
        } else if (grade == 'B' || grade == 'C') {
            System.out.println("Good job! You can aim even higher next time!");
        } else {
            System.out.println("Don't give up! Study a bit more and you'll improve!");
        }

        input.close();
    }
}
