package pt.up.fe.ldts.example2;

public class Circle extends Shape{
    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() throws Exception {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double getPerimeter() throws Exception {
        return 2 * Math.PI * getRadius();
    }

    @Override
    public void draw(GraphicFramework graphics) {
        graphics.drawCircle(getX(), getY(), getRadius());
    }
}
