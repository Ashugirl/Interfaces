package be.intecbrussel.graphics;

public class ShapeApp {
    public static void main(String[] args) {


        Shape[] shapes = new Shape[10];
        shapes[0] = new Circle(-6);
        shapes[1] = new Rectangle(29,30);
        shapes[2] = new Square(60);
        shapes[3] = new Triangle(7,9,8);
        shapes[4] = new IsoscelesTriangle(8,10);
        shapes[5] = new Circle(28);
        shapes[6] = new Rectangle(46,78);
        shapes[7] = new Square(67);
        shapes[8] = new Circle(40);
        shapes[9] = new Triangle(3,4,5);



       /* Rectangle rectangle = new Rectangle(45,45,10, 20);
        Square square1 = new Square(45,10,20);

        System.out.println("Rectangle is equal to square1: " + rectangle.equals(square1));*/


        //Rectangle rectangle = new Rectangle(12,15, 45,65);
        Circle circle = new Circle(35, 15, 28);
        Triangle triangle = new Triangle(69,75,85, 7,9);
        Square square = new Square(50,15,16);
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(25,39,58,1,2);
        ShapeApp.printShapes(shapes);
        /*System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Circle area: " +circle.getArea());
        System.out.println("Triangel perimeter: " +triangle.getPerimeter());
        System.out.println("Square perimeter: " +square.getPerimeter());
        System.out.println("Number of shapes: " + Shape.getCount());
        System.out.println("Number of triangles: " +Triangle.getCount());
        System.out.println("Number of squares: " + Square.getCount());*/

        /*System.out.println(rectangle);
        //System.out.println(rectangle1);
        System.out.println(square);
        System.out.println(triangle);
        System.out.println(isoscelesTriangle);*/
        System.out.println(circle);
    }

    private static void printShapes(Shape[] shapes) {
        for(Shape s: shapes){
            System.out.println("area: " + s.getArea());
            System.out.println("perimeter: " + s.getPerimeter());

            if(s instanceof Rectangle) {
                System.out.println("Height: " + ((Rectangle)s).getHeight());
                System.out.println("Width " + ((Rectangle)s).getWidth());

            } else if (s instanceof Circle) {
                System.out.println("Radius " + ((Circle)s).getRadius());
            } else if (s instanceof Triangle){
                System.out.println("Height" + ((Triangle)s).getPerpendicular());
            }
        }
    }
        }
