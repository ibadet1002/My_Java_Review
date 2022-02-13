package StreamPractice2;

import StreamPractice.Dish;
import StreamPractice.DishData;

import java.util.Optional;

public class MatchingAndFinding {
    public static void main(String[] args) {

        // all match
       Boolean allHealthy =  DishData.getAll().stream()
                .allMatch(dish -> dish.getCalories()<1000);
        System.out.println(allHealthy);

        // any match
        System.out.println("=================");
        if(DishData.getAll().stream().anyMatch(Dish::isVegetarian))
            System.out.println("Menu is vegetarian friendly");

// non match
        System.out.println("=============");
        Boolean ishealthy = DishData.getAll().stream().noneMatch(dish -> dish.getCalories()>= 1000);
        System.out.println(ishealthy);


        //find any
        System.out.println("===========");
        Optional<Dish> dish = DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findAny();
        System.out.println(dish.get());


        //find first
        System.out.println("=========");
        Optional<Dish> dish2 = DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findFirst();
        System.out.println(dish2);

        //

    }
}
