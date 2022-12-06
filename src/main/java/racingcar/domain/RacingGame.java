package racingcar.domain;

public class RacingGame {
    private int round;
    public RacingGame(Cars cars, int round) {
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
}
