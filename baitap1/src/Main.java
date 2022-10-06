public class Main {
    public static void main(String[] args) {
        Shape circle1 = new Circle(3.2);
        System.out.println("Trước khi resize");
        System.out.println(circle1);
        circle1.resizeable(10);
        System.out.println("Sau khi resize");
        System.out.println(circle1);
        System.out.println("------------------------------");
        Shape rectangle = new Rectangle(4.2,5.1);
        System.out.println("Trước khi resize");
        System.out.println(rectangle);
        rectangle.resizeable(5);
        System.out.println("Sau khi resize");
        System.out.println(rectangle);
        Square square = new Square(3.2);
        System.out.println("------------------------------");
        System.out.println("trước khi risize");
        System.out.println(square);
        square.resizeable(10);
        System.out.println("Sau khi risize");
        System.out.println(square);




    }
}