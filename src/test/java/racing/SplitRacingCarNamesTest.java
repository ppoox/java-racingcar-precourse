package racing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class SplitRacingCarNamesTest {

    @Test
    void splitRacingCarNames() {
        String[] carNames = new RacingCarNames("pobi,crong,honux").splitByComma();

        assertThat(carNames).containsExactly("pobi", "crong", "honux");
        assertThat(carNames[0].length()).isLessThanOrEqualTo(5);
        assertThat(carNames[1].length()).isLessThanOrEqualTo(5);
        assertThat(carNames[2].length()).isLessThanOrEqualTo(5);
    }

    @Test
    void splitRacingCarNamesThrowException() {
        assertThatThrownBy(() -> {
            String[] carNames = new RacingCarNames("pobi,crong,honux,testcar55").splitByComma();
        }).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("자동차 이름은 5자 이하만 가능합니다.");
    }
}
