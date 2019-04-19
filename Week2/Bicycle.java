public class Bicycle
{
    private Wheel wheelOne = new Wheel();
    private Wheel wheelTwo = new Wheel();
    private String bodyColor;
    private int numberOfGears;

    // parameterized constructor
    Bicycle(Wheel front, Wheel back, String color, int gears)
    {
        this.wheelOne = front;
        this.wheelTwo = back;
        this.bodyColor = color;
        this.numberOfGears = gears;
    }

    // SETTERS
    public void setWheelOne(Wheel wheelOne) {
        this.wheelOne = wheelOne;
    }

    public void setWheelTwo(Wheel wheelTwo) {
        this.wheelTwo = wheelTwo;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    // GETTERS

    public Wheel getWheelOne() {
        return wheelOne;
    }

    public Wheel getWheelTwo() {
        return wheelTwo;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }
}
