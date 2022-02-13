package StreamWarmUp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1,2,3,4,4,4,5);
        myList.forEach(System.out::println);

        // filter
        Stream<Integer> myStream = myList.stream();
    }
}
