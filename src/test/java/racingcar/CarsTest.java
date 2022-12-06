package racingcar;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domain.Cars;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Arrays;

public class CarsTest {
    Cars cars;
    @Test
    @BeforeEach
    void createCarsObj() {
        List<String> names = Arrays.asList("hip,pop,dance");
        cars = new Cars(names);
    }

    @Test
    @DisplayName("최종 우승자 반환 함수 테스트")
    void getWinnerTest() {
        cars.getCarInfo(0).move_forward();
        cars.getCarInfo(0).move_forward();

        assertThat(cars.getWinner().contains("hip")).isEqualTo(true);
    }

    @Test
    @DisplayName("현재 최대 위치 반환 함수 테스트")
    void getMaxPositionTest() {
        cars.getCarInfo(0).move_forward();
        cars.getCarInfo(0).move_forward();

        assertThat(cars.getMaxPosition()).isEqualTo(2);
    }
}
