package racingcar.domain;

public class RacingGame {
    private int round;
    public RacingGame(Cars car, int round) {
        this.round = round;
    }

    public boolean isEnd() {
        if (round <= 0)
            return true;
        return false;
    }
}
