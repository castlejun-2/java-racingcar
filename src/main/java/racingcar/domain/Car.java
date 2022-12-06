package racingcar.domain;
import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void move_forward() {
        if (getRandomNumber() >= 4)
            this.position = this.increasePosition(this.getPosition());
    }

    public int getRandomNumber() {
        return Randoms.pickNumberInRange(0,9);
    }

    public int getPosition() {
        return this.position;
    }

    public int increasePosition(int position) {
        return position + 1;
    }
}
