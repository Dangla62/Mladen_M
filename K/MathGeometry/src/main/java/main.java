import org.etsntesla.it.Point;

public class main {
    public static void main(String[] args) {
        Point a = new Point(3,4);
        Point b = new Point(3,6);
        System.out.println(a.radius() + " "+a.distance(3,6));
    }
}
