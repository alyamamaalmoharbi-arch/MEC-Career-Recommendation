// Branch 1: Using while loop instead of for loop
public static double calculateAverage() {

    Scanner sc = new Scanner(System.in);
    int n;
    double total = 0, marks;
    int i = 1; // loop counter

    System.out.print("Enter number of subjects: ");
    n = sc.nextInt();

    while (i <= n) { // modified loop
        System.out.print("Enter marks for subject " + i + ": ");
        marks = sc.nextDouble();
        total += marks;
        i++;
    }

    return total / n; // return average
}


