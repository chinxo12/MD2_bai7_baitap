public class Shape implements Resizeable{
    String color;
    boolean filled;

    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString(){
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }

    @Override
    public double resizeable(double percent) {
        double randomPercent = (int) (Math.random() * 100);
        return randomPercent;
    }
}
