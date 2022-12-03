package racingcar.domain;

import java.util.List;
import java.util.ArrayList;

public class Cars {
    List<Car> carList = new ArrayList<>();

    public Cars(final List<String> carNames) {
        this.createCars(carNames);
    }

    public void createCars(List<String> carNames) {
        for (int i = 0; i < carNames.size(); i++)
            carList.add(new Car(carNames.get(i)));
    }
}
