package racing;

import java.util.Scanner;

public class RacingCarGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carNames = scanner.next();

        System.out.println("시도할 회수는 몇회인가요?");
        int count = scanner.nextInt();

        String[] racingCarNames = new RacingCarNames(carNames).splitByComma();
        RacingRecord racingRecord = new RacingRecord(racingCarNames);

        while (count > 0) {
            count--;

            play(racingCarNames, racingRecord);

            racingRecord.printRecord();
        }

        System.out.println(racingRecord.whoIsWinner());
    }

    public static void play(String[] racingCarNames, RacingRecord racingRecord) {
        for (String racingCarName : racingCarNames) {
            racingRecord.record(racingCarName, new RacingCarMove(new RandomNumber().get()).isMove());
        }
    }
}
