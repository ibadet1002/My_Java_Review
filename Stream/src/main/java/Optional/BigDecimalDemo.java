package Optional;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        double d1 = 187.43;
        double d2 = 876.23;
        System.out.println(d1-d2);


        BigDecimal b1 = new BigDecimal(174.23);
        BigDecimal b2 = new BigDecimal(170.23);
        System.out.println(b1.subtract(b2));

        //scaling and rounding
        BigDecimal num1 = new BigDecimal(174.23);
        BigDecimal num2 = new BigDecimal(170.23);
        System.out.println(num1.setScale(1, RoundingMode.CEILING));
        System.out.println(num1.setScale(2, RoundingMode.CEILING));
        System.out.println(num1.setScale(1, RoundingMode.FLOOR));

        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("2")));
        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("3")));
        System.out.println(new BigDecimal("3").compareTo(new BigDecimal("2")));

        //Big decimal are immutable



    }
}
