package pt.up.fe.ldts.example2;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        setHeight(height);
        setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() throws Exception {
        return getWidth() * getHeight();
    }

    @Override
    public double getPerimeter() throws Exception {
        return 2 * (getWidth() + getHeight());
    }

    @Override
    public void draw(GraphicFramework graphics) {
        graphics.drawLine(getX(), getY(), getX() + width, getY());
        graphics.drawLine(getX() + width, getY(), getX() + width, getY() + height);
        graphics.drawLine(getX() + width, getY() + height, getX(), getY() + height);
        graphics.drawLine(getX(), getY() + height, getX(), getY());
    }
}
