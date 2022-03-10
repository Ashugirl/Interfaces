package be.intecbrussel.graphics;

public class CircleApp {

    public static void main(String[] args) {
        System.out.println("This program uses a circle.");

        Circle circ1 = new Circle(12, 16, 25);

        System.out.printf("The circle's radius is %d.\n", circ1.getRadius());
        System.out.printf("The circle's position is %d x %d.\n", circ1.getX(), circ1.getY());
        System.out.printf("The circle's circumference is %.2f.\n", circ1.getPerimeter());
        System.out.printf("The circle's area is %.2f.", circ1.getArea());
        System.out.println();
        circ1.grow(4);
        System.out.println("The new radius of the circle is \n" + circ1.getRadius());
        System.out.printf("updated circumference: %.2f\n", circ1.getPerimeter() );
        System.out.printf("updated area: %.2f\n", circ1.getArea());
        System.out.println();


        Circle circ2 = new Circle(28, 4, 5);

        System.out.printf("The circle's radius is %d.\n", circ2.getRadius());
        System.out.printf("The circle's position is %d x %d.\n", circ2.getX(), circ2.getY());
        System.out.printf("The circle's circumference is %.2f.\n", circ2.getPerimeter());
        System.out.printf("The circle's area is %.2f.", circ2.getArea());
        System.out.println();
        circ2.grow(16);
        System.out.println("The new radius of the circle is \n" + circ2.getRadius());
        System.out.printf("updated circumference: %.2f\n", circ2.getPerimeter() );
        System.out.printf("updated area: %.2f\n", circ2.getArea());
        System.out.println();
    }
}