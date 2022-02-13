package FarmersApple;

public class AppleGreenColorPredicate implements ApplePredicate {

    @Override
    public boolean checking(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}
