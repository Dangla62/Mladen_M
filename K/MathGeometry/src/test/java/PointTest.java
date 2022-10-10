import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.etsntesla.it.Point;

import static org.etsntesla.it.Point.distance;

public class PointTest {

    public static Point A,B;

    @BeforeAll
    static void init(){
        A = new Point (3,4);
        B = new Point (3,6);
    }



    @Test
void test1() {
        System.out.println("Hello test!");
        Assertions.assertEquals(5, A.radius(),"Nije tacna");
    }

    @Test
void test2() {
        System.out.println(distance(A, B));

    }



}

