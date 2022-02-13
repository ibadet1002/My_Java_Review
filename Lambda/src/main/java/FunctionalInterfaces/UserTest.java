package FunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {

        List<User> userLists = new ArrayList<>();
       // userLists.add(new User("Ryan", "Lee", 32)); same  as below line
        userLists.add(User.builder().firstName("ALILI").lastName("Ellen").age(31).build());
        userLists.add(User.builder().firstName("Adam").lastName("Eden").age(30).build());
        userLists.add(User.builder().firstName("LILI").lastName("Beth").age(25).build());
        userLists.add(User.builder().firstName("Mike").lastName("Roshen").age(22).build());

        System.out.println("print all elements in the list");
       printName(userLists,p -> true);

        System.out.println("print all users that last name starts with E");
        printName(userLists, User -> User.getLastName().startsWith("E"));

    }

    private static void printName(List<User> userLists, Predicate <User> p){
        for (User user: userLists) {
            if(p.test(user)){
                System.out.println(user.toString());
            }
        }
    }
}