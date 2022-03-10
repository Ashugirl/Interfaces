package be.intecbrussel.graphics;

public class SquareApp {

    public static void main(String[] args) {

        //private static void printSquare(Square square){
        //}
        Square square = new Square();

        square.setSide(-55);

        System.out.println("Square area: " + square.getArea());
        System.out.println("Square perimeter: " + square.getPerimeter());
        System.out.println(square.getHeight());
        System.out.println(square.getWidth());
        //System.out.println(square.getHeight());
        //System.out.println(square.getWidth());
        square.setPosition(12, 14);
        System.out.println("The location of the square is: "+ square.getX() + square.getY());
        System.out.println("Number of squares created = " + square.getCount());
        System.out.println();

        Square square1 = new Square(23);

        System.out.println("The side of this square is " + square1.getSide() + " cms long.");
        System.out.println("The perimeter of the square is: " + square1.getPerimeter());
        System.out.println("The area of the square is: " + square1.getArea());
        System.out.println("The height is: " + square1.getHeight());
        System.out.println("The width is: " + square1.getWidth());
    //    System.out.println("Number of squares created = " + square.getCount());
        System.out.println();

        Square square2 = new Square(28, 7,9);

        System.out.println("The side of this square is " + square2.getSide() + " cms long.");
        System.out.println("The perimeter of the square is: " + square2.getPerimeter());
        System.out.println("The area of the square is: " + square2.getArea());
        System.out.println("The height is: " + square2.getHeight());
        System.out.println("The width is: " + square2.getWidth());
        System.out.println("The location of this square is: " + (square2.getX() + square2.getY()));
//        System.out.println("Number of squares created = " + square.getCount());
        System.out.println();

        Rectangle rect1 = new Rectangle(14, 18, 23, 45);

        //System.out.println("The side of this square is " + rect1.getSide() + " cms long.");
        System.out.println("The perimeter of the square is: " + rect1.getPerimeter());
        System.out.println("The area of the square is: " + rect1.getArea());
        System.out.println("The height is: " + rect1.getHeight());
        System.out.println("The width is: " + rect1.getWidth());
        System.out.println("The location of this square is: " + (rect1.getX() + rect1.getY()));
  //      System.out.println("Number of rectangles created = " + rect1.getCount());
        System.out.println();

        Rectangle rect2 = new Square(29, 5,7);


        //System.out.println("The side of this square is " + rect2.getSide() + " cms long.");
        System.out.println("The perimeter of the square is: " + rect2.getPerimeter());
        System.out.println("The area of the square is: " + rect2.getArea());
        System.out.println("The height is: " + rect2.getHeight());
        System.out.println("The width is: " + rect2.getWidth());
        System.out.println("The location of this square is: " + (rect2.getX() + rect2.getY()));

        System.out.println();

        Rectangle rect3 = new Rectangle(34, 56, 78, 90);
        //System.out.println("The side of this square is " + rect3.() + " cms long.");
        System.out.println("The perimeter of the square is: " + rect3.getPerimeter());
        System.out.println("The area of the square is: " + rect3.getArea());
        System.out.println("The height is: " + rect3.getHeight());
        System.out.println("The width is: " + rect3.getWidth());
        System.out.println("The location of this square is: " + (rect3.getX() + rect3.getY()));
        System.out.println("Number of squares created = " + rect3.getCount());
        System.out.println();

        System.out.println("Squares created " + Square.getCount());
        System.out.println("Rectangles created " + Rectangle.getCount());
    }
}
