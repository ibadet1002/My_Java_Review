package Optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,4,6,8,10);

        //empty() -ispresent()
        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent());
        System.out.println(Optional.of(numbers).isPresent());

        //ifpresent()
      Optional<Integer> bigNum = numbers.stream()
                .filter(x -> x>100)
                .findAny();
        bigNum.ifPresent(System.out::println);


        //get
        System.out.println(bigNum.get());

        //or else
        System.out.println(bigNum.orElse(0));

    }
}
