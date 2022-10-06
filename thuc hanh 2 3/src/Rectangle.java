public class Rectangle extends Shape{
    double width;
    double length;

    public Rectangle() {
        this.width = 1.0;
        this.length = 2.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, Boolean filled) {
        super(color, filled);
    }

    public Rectangle(String color, Boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double area (){
        return this.length*this.width;
    }
    public double primeter (){
        return (this.width+this.length)*2;
    }
    @Override
    public String toString(){
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }
}
