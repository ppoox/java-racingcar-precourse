package racing;

public class RandomNumber {
    private static final int RANDOM_DIGITS = 10;
    private final int randomNumber;

    public RandomNumber() {
        this.randomNumber = (int) (Math.random() * RANDOM_DIGITS);
    }

    public int get() {
        return randomNumber;
    }
}
