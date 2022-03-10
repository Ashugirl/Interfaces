package be.intecbrussel.graphics;

import java.util.Objects;

public class Circle extends Shape{
    //class variables
    public final static int ANGLES = 0;
    private static int count = 0;
    private int radius;
    {
        count++;
    }

    //constructors


    public Circle(){ this(0, 0, 0);

    }
    public Circle(int radius){
        this(radius, 0, 0);
    }

    public Circle(int radius, int x, int y) {
        setRadius(radius);
        setPosition(x, y);

    }
    public Circle(Circle circle){
        this(circle.radius, circle.getX(), circle.getY());
    }
    //getters and setters

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = Math.abs(radius);
    }

    public double getArea(){
        return Math.PI * (radius*radius);
    }

    public double getPerimeter(){
        return (double) 2 * (Math.PI * radius);
    }

    public void grow(int d){
        this.radius = (radius + d);
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}

