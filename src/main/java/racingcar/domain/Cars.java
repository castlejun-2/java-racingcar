package racingcar.domain;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Cars {
    List<Car> carList = new ArrayList<>();

    public Cars(final List<String> carNames) {
        this.createCars(carNames);
    }

    public void createCars(List<String> carNames) {
        for (int i = 0; i < carNames.size(); i++)
            carList.add(new Car(carNames.get(i)));
    }

    public void move() {
        for (int i = 0; i < this.carList.size(); i++) {
            this.carList.get(i).move_forward();
        }
    }

    public int getCarsLength() {
        return this.carList.size();
    }

    public Car getCarInfo(int index) {
        return this.carList.get(index);
    }

    public String getWinner() {
        int maxPosition = getMaxPosition();
        List<Car> names = this.carList.stream()
                .filter(car -> car.isOnPosition(maxPosition))
                .collect(Collectors.toList());
        return String.join(",",names.stream()
                .map(Car::getCarName)
                .collect(Collectors.toList()));
    }

    public int getMaxPosition() {
        return Collections.max(this.carList.stream()
                .map(Car::getPosition)
                .collect(Collectors.toList()));
    }
}
