// Branch 2: Adding extra career recommendation
public static void displayRecommendation(double average) {

    System.out.println("Average Marks: " + average);

    if (average >= 85) {
        System.out.println("Recommended Career: Engineering / Data Science");
    } 
    else if (average >= 80) { // new branch
        System.out.println("Recommended Career: Research / Analytics");
    }
    else if (average >= 70) {
        System.out.println("Recommended Career: Management / Commerce");
    } 
    else {
        System.out.println("Recommended Career: Skill-based or Vocational Courses");
    }
}


    return total / n; // return average
}



