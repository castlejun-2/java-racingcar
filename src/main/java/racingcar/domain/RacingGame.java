package racingcar.domain;

import racingcar.view.OutputView;

public class RacingGame {
    private int round;
    private Cars cars;
    public RacingGame(Cars cars, int round) {
        this.cars = cars;
        this.round = round;
    }

    public boolean isEnd(int round) {
        if (round <= 0)
            return true;
        return false;
    }

    public int getRound() {
        return this.round;
    }

    public void race() {
        this.cars.move();
        this.round = this.subRound(this.round);
        OutputView.printRaceResult(this.cars);
    }

    public int subRound(int round) {
        return round - 1;
    }
}
