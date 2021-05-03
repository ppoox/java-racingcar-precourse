package racing;

public class RacingCarNames {

    private String carNames;

    public RacingCarNames(String carNames) {
        this.carNames = carNames;
    }

    public String[] splitByComma() {
        String[] carNameArray = this.carNames.split(",");

        for (String carName : carNameArray) {
            validationCarName(carName);
        }

        return carNameArray;
    }

    public void validationCarName(String carName) {
        if (carName.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
        }
    }

    public void appendByComma(String carName) {
        if (carName == null) {
            return;
        }
        if (this.carNames == null) {
            this.carNames = carName;

            return;
        }

        this.carNames = this.carNames + ", " + carName;
    }

    public String getResult() {
        return this.carNames + "가 최종 우승했습니다.";
    }
}
