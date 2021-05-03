package racing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MakeRandomNumberTest {

    private int randomNumber;

    @BeforeEach
    void setUp() {
        this.randomNumber = new RandomNumber().get();
    }

    @Test
    void makeRandomNumber() {
        assertThat(this.randomNumber).isLessThanOrEqualTo(9);
        assertThat(this.randomNumber).isGreaterThanOrEqualTo(0);
    }
}
