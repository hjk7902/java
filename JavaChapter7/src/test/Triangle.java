package test;

public class Triangle extends Shape {
    private int width;
    private int height;

    public Triangle(String name, int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public double calcArea() {
        return getWidth()*getHeight()/2.0;
    }
}

