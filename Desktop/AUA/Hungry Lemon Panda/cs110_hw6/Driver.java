import shapes.Square;
import shapes.Rectangle;
import utils.Math;

public class Driver {

    public static void main(String[] args) {

        Square LemonSquare = new Square(100);
        System.out.println("The Area of Lemon Square is " + LemonSquare.getArea());

        Rectangle LemonRectangle = new Rectangle(50,80);
        System.out.println("The area of the Lemon Rectangle is " + LemonRectangle.getArea());


        double Number = 5.4;
        System.out.println(Math.factorial( (int) Number) );
        System.out.println(Math.factorialLoop( (int) Number) );

    }
}