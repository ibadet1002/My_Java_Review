package doublrColonOperator;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Demo {
    public static void main(String[] args) {

        // reference to a static method
        Calculate s1 = (x, y) -> Calculator.findSum(x,y);
        s1.calculate(10,20);

        Calculate s2 = Calculator::findSum;
        s2.calculate(101,202);

        // reference to instance method
        Calculate m1 = (x, y) -> new Calculator().findMultiply(x,y);
        m1.calculate(10,20);

        Calculator obj = new Calculator();
        Calculate m2 = (x, y) -> obj.findMultiply(x,y);
        m2.calculate(10,20);

        Calculate m3 = new Calculator()::findMultiply;
        m1.calculate(10,20);


        // Bifunctional interface
        BiFunction<String, Integer, String> fn = (str, i) -> str.substring(i);
        System.out.println(fn.apply("developer", 5));

        BiFunction<String, Integer, String> fn2 =String::substring;
        System.out.println(fn.apply("developer", 5));

       Consumer<Integer> con = i-> System.out.println(i);
       con.accept(20);

        Consumer<Integer> con1 = System.out::println;
                con1.accept(20);


    }
}
