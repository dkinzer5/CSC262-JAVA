public class Wheel
{
    // default CTOR
    Wheel()
    {
        this.radius = 0;
        this.width = 0;
    }

    // parameterized CTOR
    Wheel(double w, double r)
    {
        this.width = w;
        this.radius = r;
    }

    // SETTERS
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // GETTERS
    public double getWidth() {
        return width;
    }

    public double getRadius() {
        return radius;
    }

    // private stuff
    private double width;
    private double radius;



}
