package racingcar;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.controller.Application;
import racingcar.domain.Car;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    Car testCar;
    @Test
    @BeforeEach
    void createCarObj() {
        testCar = new Car("test");
    }

    @Test
    @DisplayName("차를 앞으로 한칸 이동 시킨다")
    void increasePositionTest() {
        assertThat(testCar.increasePosition(testCar.getPosition())).isEqualTo(1);
    }
}
