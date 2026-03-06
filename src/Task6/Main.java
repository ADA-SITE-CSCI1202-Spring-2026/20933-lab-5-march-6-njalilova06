package Task6;

public class Main {
    public static void main(String[] args) {

        Point p = new Point(2,3);
        p.moveUp();
        p.moveRight();
        System.out.println("Point: " + p);

        Circle c = new Circle(new Point(5,5), 10);
        c.moveLeft();
        c.moveDown();
        System.out.println("Circle: " + c);
    }
}
