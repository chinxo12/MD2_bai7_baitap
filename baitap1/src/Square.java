public class Square extends Shape{
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, Boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea (){
        double area = this.side*this.side;
        return area;
    }

    @Override
    public double resizeable(double percent) {
        percent = Math.random();

        return this.side*=percent;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString() + "Area is: " + getArea();
    }
}
