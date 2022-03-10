package be.intecbrussel.graphics;

public class LogoApp
{
    public static void main(String[] args) {
        Logo logo = new Logo(new Rectangle(14, 25), new Circle(33), "Intec Brussel");

        System.out.println("The total area of our logo is  " + logo.getArea());
        System.out.println(logo.getText());
    }
        }
