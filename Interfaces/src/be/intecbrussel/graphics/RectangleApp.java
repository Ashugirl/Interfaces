package be.intecbrussel.graphics;

import static graphics.Rectangle.getCount;

public class RectangleApp {
    public static void main(String[] args) {
        System.out.println("This program uses a rectangle");
        Rectangle rect = new Rectangle(12, 14);

        rect.setWidth(12);
        rect.setHeight(14);

        rect.setX(25);
        rect.setY(63);

        System.out.println("This rectangle's width is " + rect.getWidth());
        System.out.println("This rectangle's height is " + rect.getHeight());
        System.out.printf("This rectangle's position is %d x %d.", rect.getX(), rect.getY());
        System.out.println("\nThe area is " + rect.getArea());
        System.out.println("The perimeter is " + rect.getPerimeter());
        System.out.println("Number of rectangles created = " + Rectangle.getCount());

        System.out.println("\n\nSecond rectangle\n");
        Rectangle rect2 = new Rectangle(-28, -90);
        //rect2.setHeight(-28);
        //rect2.setWidth(-90);
        rect2.setX(105);
        rect2.setY(200);
        System.out.println("This rectangle's width is " + rect2.getWidth());
        System.out.println("This rectangle's height is " + rect2.getHeight());
        System.out.printf("This rectangle's position is %d x %d. ", rect2.getX(), rect2.getY());
        System.out.println("The area is " + rect2.getArea());
        System.out.println("The perimeter is " + rect2.getPerimeter());
        System.out.println("Number of rectangles created = " + getCount());

        Rectangle rect3 = new Rectangle(56, 78, 90, 50);
        System.out.println("Number of rectangles created = " + Rectangle.getCount());

        Rectangle rect4 = new Rectangle(27, 30,69,70);
        System.out.println("Number of rectangles created = " + Rectangle.getCount());

        Rectangle rect5 = new Rectangle(rect2);
        System.out.println("This rectangle's width is " + rect5.getWidth());
        System.out.println("This rectangle's height is " + rect5.getHeight());
        System.out.printf("This rectangle's position is %d x %d. ", rect5.getX(), rect5.getY());
        System.out.println("The area is " + rect5.getArea());
        System.out.println("The perimeter is " + rect5.getPerimeter());
        System.out.println("Number of rectangles created = " + Rectangle.getCount());

        System.out.println("\nA rectangle has " + Rectangle.ANGLES + " angles.");
    }
}
