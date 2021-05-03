package racing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarMoveTest {

    @Test
    void isGo() {
        assertThat(new RacingCarMove(6).isMove()).isEqualTo(RacingCarMoveStatus.GO);
    }

    @Test
    void isStop() {
        assertThat(new RacingCarMove(0).isMove()).isEqualTo(RacingCarMoveStatus.STOP);
    }
}
