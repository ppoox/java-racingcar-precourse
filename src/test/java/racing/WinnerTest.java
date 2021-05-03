package racing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class WinnerTest {
    private RacingRecord racingRecord;

    @BeforeEach
    void setUp() {
        this.racingRecord = new RacingRecord(new RacingCarNames("pobi,crong,honux").splitByComma());
        this.racingRecord.record("pobi", new RacingCarMove(6).isMove());
        this.racingRecord.record("pobi", new RacingCarMove(7).isMove());
        this.racingRecord.record("crong", new RacingCarMove(2).isMove());
        this.racingRecord.record("honux", new RacingCarMove(9).isMove());
        this.racingRecord.record("honux", new RacingCarMove(8).isMove());
    }

    @Test
    void printRecord() {
        this.racingRecord.printRecord();
    }

    @Test
    void calculateMaxRecord() {
        assertThat(this.racingRecord.calculateMaxRecord()).isEqualTo(2);
    }

    @Test
    void isMaxRecord() {
        assertThat(this.racingRecord.isMaxRecord("pobi", 2)).isTrue();
        assertThat(this.racingRecord.isMaxRecord("honux", 2)).isTrue();
        assertThat(this.racingRecord.isMaxRecord("crong",2 )).isFalse();
    }

    @Test
    void whoIsWinner() {
        assertThat(this.racingRecord.whoIsWinner()).isEqualTo("pobi, honux가 최종 우승했습니다.");
    }
}
