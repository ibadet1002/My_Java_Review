package StreamWarmUp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {
    // Creating stream from array
    String[] languages = {"Java", "Phyton", "JS"};
    Stream<String> LanguageStream = Arrays.stream(languages);

    // Creating stream from collection
    List<String> languageList = Arrays.asList(
            "Java", "Phyton", "JS"
    );
    Stream<String> LanguageStream2= languageList.stream();

    List<Language> myLanguage = Arrays.asList(
            new Language("Java", 101),
            new Language("Phyton", 201),
            new Language("JS",301)
    );
    Stream<Language> myLanguageStream = myLanguage.stream();




    //creating stream from values
    Stream<Integer> stream = Stream.of(1,2,3,4);

}
