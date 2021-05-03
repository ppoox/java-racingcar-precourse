package racing;

public class RacingCarMove {
    private static final int CONDITION_GO = 4;
    private final int randomNumber;

    public RacingCarMove(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public RacingCarMoveStatus isMove() {
        return this.randomNumber >= CONDITION_GO ? RacingCarMoveStatus.GO : RacingCarMoveStatus.STOP;
    }

}
