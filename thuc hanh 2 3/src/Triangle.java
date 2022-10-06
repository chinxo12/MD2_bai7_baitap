public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    public Triangle() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public Triangle(double a, double b, double c) {
        if (a+b<=c || a+c<=b || b+c<=a){
            this.a = 0;
            this.b = 0;
            this.c = 0;
        }else {
            this.a = a;
            this.b = b;
            this.c = c;
        }

    }

    public Triangle(String color, Boolean filled, double a, double b, double c) {
        super(color, filled);
        if (a+b<=c || a+c<=b || b+c<=a){
            this.a = 0;
            this.b = 0;
            this.c = 0;
        }else {

            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getArea (){
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public double getPrimeter (){
        return this.a + this.b +this.c;
    }
    public String toString (){
         return "Tam giac co 3 canh la:  " + this.a + " " + this.b + " " + this.c + "\n" +
                 "dien tich: " + getArea() + " chu vi: " + getPrimeter();
    }

}
