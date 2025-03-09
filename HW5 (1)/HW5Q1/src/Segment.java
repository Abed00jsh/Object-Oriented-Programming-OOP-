import java.util.Scanner;

public class Segment {
    private Point first, second;

    public Segment() {
        first = new Point(0, 0);
        second = new Point(1, 1);
    }

    public Segment(int a, int b, int c, int d) {
        first = new Point(a, b);
        second = new Point(c, d);
    }

    public Segment(int a, int b) {
        first = new Point(0, 0);
        second = new Point(a, b);
    }

    public Segment(Point a, Point b) {
        first = a;
        second = b;
    }

    public Segment(int a, int b, Point c) {
        first = new Point(a, b);
        second = c;
    }

    public Segment(Point a, int b, int c) {
        first = a;
        second = new Point(b, c);
    }

    public Segment(Segment other) {
        first = other.first;
        second = other.second;
    }

    public Point middle() {
        float a = (first.getX() + second.getX()) / 2;
        float b = (first.getY() + second.getY()) / 2;
        return new Point(a, b);
    }

    public void readSegment() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x coordinate for first point: ");
        float x1 = scanner.nextFloat();
        System.out.print("Enter y coordinate for first point: ");
        float y1 = scanner.nextFloat();
        first = new Point(x1, y1);

        System.out.print("Enter x coordinate for second point: ");
        float x2 = scanner.nextFloat();
        System.out.print("Enter y coordinate for second point: ");
        float y2 = scanner.nextFloat();
        second = new Point(x2, y2);

        scanner.close();
    }

    public boolean greaterThan(Segment other) {
        return this.length() > other.length();
    }

    public boolean lessThan(Segment other) {
        return this.length() < other.length();
    }

    public boolean equals(Segment other) {
        return this.first.equals(other.first) && this.second.equals(other.second);
    }

    public int compareTo(Segment other) {
        return Double.compare(this.length(), other.length());
    }

    public double length() {
        float tx = this.first.getX() - this.second.getX();
        float ty = this.first.getY() - this.second.getY();
        return Math.sqrt(tx * tx + ty * ty);
    }

    public void show() {
        System.out.print("(");
        first.show();
        System.out.print(",");
        second.show();
        System.out.print(")");
    }
}