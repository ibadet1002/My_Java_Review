package StreamPractice;

import java.util.Comparator;

public class DishPractice {
    public static void main(String[] args) {
        //print all dish's names that has less than 400 Calories

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() <400)
                .map(Dish:: getName)
                .forEach(System.out::println);


        // print the length of the name of each dish
        System.out.println("================");
        DishData.getAll().stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);


        // PRINT 3 HIGH COLORIC DISH NAME (>300CAL)
        System.out.println("================");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() >300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);



        // print all dish name that are below 400 cal in sorted way
        System.out.println("===============");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() <400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .forEach(System.out::println);


    }
}
