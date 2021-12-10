package pt.up.fe.ldts.example2;

public abstract class Shape {
    private double x;
    private double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public void setX(double newX) { this.x = newX; }
    public void setY(double newY) { this.y = newY; }

    public abstract double getArea() throws Exception;
    public abstract double getPerimeter() throws Exception;
    public abstract void draw(GraphicFramework graphics);
}
