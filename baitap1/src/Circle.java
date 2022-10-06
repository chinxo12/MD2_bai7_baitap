public class    Circle extends Shape {
    double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double area (){
        double area = Math.pow(this.radius,2)*Math.PI;
        return area;
    }
    public double primeter (){
        double primeter = 2*this.radius*Math.PI;
        return primeter;
    }
    @Override
    public double resizeable(double percent) {
        percent = Math.random()*100;
        return this.radius*=percent;
    }
    @Override
    public String toString(){
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString()
                + " Area is: " + area();
    }


}
