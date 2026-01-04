package careerrecommendation;

import java.util.Scanner;

public class CareerRecommendationSystem {

    // Function 1: Academic data entry and processing
    public static double calculateAverage() {

        Scanner sc = new Scanner(System.in);
        int n;
        double total = 0, marks;

        System.out.print("Enter number of subjects: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            marks = sc.nextDouble();
            total = total + marks;
        }

        return total / n; // return average
    }

    // Function 2: Display recommendations to the student
    public static void displayRecommendation(double average) {

        System.out.println("Average Marks: " + average);

        if (average >= 85) {
            System.out.println("Recommended Career: Engineering / Data Science");
        } 
        else if (average >= 70) {
            System.out.println("Recommended Career: Management / Commerce");
        } 
        else {
            System.out.println("Recommended Career: Skill-based or Vocational Courses");
        }
    }

    // Main function
    public static void main(String[] args) {

        double avg = calculateAverage();     // function call 1
        displayRecommendation(avg);          // function call 2
    }
}


