package com.bridgelabz.linecompariason;

public class LineLengthCalculator {

    // Method to calculate the distance between two points
    public static double calculateLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        // Example points
        double x1 = 3;
        double y1 = 4;
        double x2 = 7;
        double y2 = 1;

        // Calculate the length of the line
        double length = calculateLength(x1, y1, x2, y2);

        // Display the result
        System.out.println("The length of the line between points (" + x1 + ", " + y1 +
                ") and (" + x2 + ", " + y2 + ") is " + length);
    }
}

