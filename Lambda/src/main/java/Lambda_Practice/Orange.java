package Lambda_Practice;

import lombok.*;

@Data
@Builder
public class Orange {
    private int weight;
    private Color color;

}

//@BUILDER generates an @AllArgsConstructor unless there is another @XConstructor


