package doublrColonOperator;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarDemo {
    public static void main(String[] args) {

    //Zero argument
   Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getModel());

        Supplier<Car> c2 = Car::new;
        System.out.println(c2.get().getModel());

    //one argument
        Function<Integer, Car> f1 = (model) -> new Car(model);
       Car tesla = f1.apply(2022);
        System.out.println(tesla.getModel());

        Function<Integer, Car> f2 = Car::new;
        Car BMW = f1.apply(2020);
        System.out.println(BMW.getModel());

    //two argument

        BiFunction<String,Integer, Car> fc1 = (make, model) -> new Car(make, model);
        Car honda = fc1.apply("honda", 2022);
        System.out.println(honda.getModel());

        BiFunction<String,Integer, Car> fc2 = Car::new;
        Car toyota = fc1.apply("toyota", 2020);
        System.out.println(toyota.getModel());
}
}
