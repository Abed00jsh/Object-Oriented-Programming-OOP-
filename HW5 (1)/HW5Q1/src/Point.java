public class Point {
    private float x, y;

    public Point() {
        // Default constructor
    }

    public Point(float a, float b) {
        x = a;
        y = b;
    }

    public void setX(float a) {
        x = a;
    }

    public void setY(float b) {
        y = b;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void show() {
        System.out.print("(" + x + "," + y + ")");
    }
}