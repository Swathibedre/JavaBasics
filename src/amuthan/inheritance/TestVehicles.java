package amuthan.inheritance;

import lombok.AllArgsConstructor;
import lombok.ToString;
@AllArgsConstructor
@ToString
public class TestVehicles {

    public static void main(String[] args) {

        Vehicles c1 = new Cars("hi");
        c1.speed(10,10);
        c1.engine(10,20);

        Cars c2 = new Cars("bmw");
        int b = Cars.b;
        c2.test();
       // System.out.println("hi"+NULL);

    }
}
