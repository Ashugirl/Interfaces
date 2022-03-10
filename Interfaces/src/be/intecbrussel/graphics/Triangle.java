package be.intecbrussel.graphics;

import java.util.Objects;

public class Triangle extends Shape {

    public static final int ANGLES = 3;
    private static int count;
    private int height;
    private int width;
    private int perpendicular;

    {
        count++;
    }

    public Triangle(){
        this(0,0,0,0,0);

    }

    public Triangle(int width, int height, int perpendicular){
        this(width, height, perpendicular, 0,0);

    }

    public Triangle(int width, int height, int perpendicular, int x, int y){
        super(x,y);
        setWidth(width);
        setHeight(height);
        setPerpendicular(perpendicular);

    }

    public Triangle(Triangle triangle){
        this(triangle.getWidth(), triangle.getHeight(), triangle.getPerpendicular(), triangle.getX(), triangle.getY());

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = Math.abs(width);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = Math.abs(height);
    }

    public int getPerpendicular(){
        return perpendicular;
    }

    public void setPerpendicular(int perpendicular) {
        this.perpendicular = Math.abs(perpendicular);
    }

    @Override
    public double getArea() {
        return (width * height)/ 2;
    }

    @Override
    public double getPerimeter() {
        return width + Math.hypot(height,perpendicular) + Math.hypot(height,(width - perpendicular));
    }


    public static int getCount(){
        return count;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", width=" + width +
                ", perpendicular=" + perpendicular +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Triangle triangle = (Triangle) o;
        return height == triangle.height && width == triangle.width && perpendicular == triangle.perpendicular;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height, width, perpendicular);
    }
}
