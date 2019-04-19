public class Rectangle
{
    // private data members init to 1
    private double length = 1;
    private double width = 1;

    /******************************************
     * ACCESSORS
     *******************************************/
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    /******************************************
    * MUTATORS
    *******************************************/

    public void setLength(double length) {

        if(length > 0.0 && length < 20.0)
            this.length = length;
        else
            System.out.printf("ERROR - (%.2f) is out of scope for length%n", length);
    }

    public void setWidth(double width) {
        if(width > 0.0 && width < 20.0)
            this.width = width;
        else
            System.out.printf("ERROR - (%.2f) is out of scope for width%n", width);
    }

     /******************************************
     * CALCULATIONS
     ********************************************/

    public double getPerimeter(Rectangle myRectangle)
    {
        double perimeter = 2*(myRectangle.length + myRectangle.width);
        return perimeter;
    }

    public double getArea(Rectangle myRectangle)
    {
        double area = myRectangle.length * myRectangle.width;
        return area;
    }


}
