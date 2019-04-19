public class rectangleTest
{
    public static void main(String [] args)
    {
        // the instantiation
        Rectangle rectangle  = new Rectangle();

        // use mutators
        rectangle.setLength(15);
        rectangle.setWidth(5);

        // use accessors
        System.out.printf("The length is: %.2f%n", rectangle.getLength());
        System.out.printf("The width is: %.2f%n", rectangle.getWidth());

        // use getPerimeter
        System.out.printf("The perimeter is: %.2f%n", rectangle.getPerimeter(rectangle));

        // user getArea
        System.out.printf("The area is: %.2f%n",rectangle.getArea(rectangle));

        // test scope 0.0 to 20.0 exclusive
        Rectangle rectangle1 = new Rectangle();

        rectangle1.setWidth(45); // out of scope
        rectangle1.setLength(25); // out of scope

    }
}
