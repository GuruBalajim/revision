package mit;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        double sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            double num = scanner.nextDouble();
            sum += num;
        }

        double average = sum / n;

        System.out.println("Average of the numbers: " + average);

        scanner.close();
    }
}


