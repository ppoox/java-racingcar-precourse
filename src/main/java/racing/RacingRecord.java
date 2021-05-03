package racing;

import java.util.Arrays;

public class RacingRecord {

    private final String[] carNames;
    private final int[] records;

    public RacingRecord(String[] carNames) {
        this.carNames = carNames;
        this.records = new int[carNames.length];
    }

    public void record(String carName, RacingCarMoveStatus move) {
        if(move == RacingCarMoveStatus.GO) {
            this.records[Arrays.asList(this.carNames).indexOf(carName)]++;
        }
    }

    public void printRecord() {
        int index = 0;
        for (String carName : this.carNames) {
            System.out.println(carName + " : " + printDash(this.records[index++]));
        }

        System.out.println();
    }

    public String printDash(int record) {
        StringBuilder sb = new StringBuilder();
        while (record > 0) {
            record--;
            sb.append('-');
        }
        return sb.toString();
    }

    public int calculateMaxRecord() {
        int max = 0;
        for (int record : this.records) {
            max = Math.max(max, record);
        }

        return max;
    }

    public String whoIsWinner() {
        int maxRecord = calculateMaxRecord();
        RacingCarNames carNames = new RacingCarNames(null);

        for (String carName : this.carNames) {
            appendWinner(carNames, carName, maxRecord);
        }

        return carNames.getResult();
    }

    public void appendWinner(RacingCarNames carNames, String carName, int maxRecord) {
        if (isMaxRecord(carName, maxRecord)) {
            carNames.appendByComma(carName);
        }
    }

    public boolean isMaxRecord(String carName, int maxRecord) {
        return this.records[Arrays.asList(this.carNames).indexOf(carName)] == maxRecord;
    }
}
