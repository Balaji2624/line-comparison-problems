package com.bridgelabz.linecompariason;

class Line implements Comparable<Line> {
    private double x1, y1, x2, y2;

    // Constructor to initialize the endpoints of the line
    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Method to calculate the length of the line
    public double getLength() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Overriding the compareTo method to compare line lengths
    @Override
    public int compareTo(Line other) {
        double thisLength = this.getLength();
        double otherLength = other.getLength();

        return Double.compare(thisLength, otherLength);
    }

    public static void main(String[] args) {
        Line line1 = new Line(1, 2, 4, 6);
        Line line2 = new Line(2, 3, 5, 7);

        int comparisonResult = line1.compareTo(line2);

        if (comparisonResult < 0) {
            System.out.println("Line 1 is shorter than Line 2.");
        } else if (comparisonResult > 0) {
            System.out.println("Line 1 is longer than Line 2.");
        } else {
            System.out.println("Line 1 is equal in length to Line 2.");
        }
    }
}

