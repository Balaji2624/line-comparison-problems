package com.bridgelabz.linecompariason;

// Point Class
class Point {
    private int x, y;

    // Constructor to initialize the point
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter methods for x and y coordinates
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Override equals method to compare two points based on their x and y coordinates
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point point = (Point) obj;
        return x == point.x && y == point.y;
    }

    // Override toString to display point in (x, y) format
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

// Line Class
class Line implements Comparable<Line> {
    private Point start, end;

    // Constructor to initialize the start and end points of the line
    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    // Method to calculate the length of the line using the distance formula
    public double getLength() {
        return Math.sqrt(Math.pow(end.getX() - start.getX(), 2) + Math.pow(end.getY() - start.getY(), 2));
    }

    // Override equals method to compare lines based on start and end points
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Line line = (Line) obj;
        return start.equals(line.start) && end.equals(line.end);
    }

    // Implement compareTo method to compare lines based on their lengths
    @Override
    public int compareTo(Line otherLine) {
        double thisLength = this.getLength();
        double otherLength = otherLine.getLength();
        return Double.compare(thisLength, otherLength);
    }

    // Override toString to display line details
    @Override
    public String toString() {
        return "Line from " + start + " to " + end + " with length: " + getLength();
    }
}

// Main Class to Test the Program
public class LineCompare {
    public static void main(String[] args) {
        // Create two points for the first line
        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);

        // Create two points for the second line
        Point p3 = new Point(0, 0);
        Point p4 = new Point(3, 4);

        // Create two lines
        Line line1 = new Line(p1, p2);
        Line line2 = new Line(p3, p4);

        // Print out details of the lines
        System.out.println(line1);
        System.out.println(line2);

        // Compare the two lines using compareTo
        int comparison = line1.compareTo(line2);

        // Print comparison result
        if (comparison < 0) {
            System.out.println("Line 1 is shorter than Line 2");
        } else if (comparison > 0) {
            System.out.println("Line 1 is longer than Line 2");
        } else {
            System.out.println("Line 1 is equal in length to Line 2");
        }

        // Check if the lines are equal using the equals method
        System.out.println("Are the lines equal? " + line1.equals(line2));
    }
}
