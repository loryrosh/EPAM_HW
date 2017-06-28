package EPAM.lesson170627.theory.creation;

public class Point {
    int x;
    int y;

    public Point() {
        this(10, 10);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int y) {
        this(0, y);
    }
}
