package FarmersApple;

public class AppleHeavyPredicate implements ApplePredicate {


    @Override
    public boolean checking(Apple apple) {
        return apple.getWeight()>200;
    }
}
