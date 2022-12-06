package racingcar;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;
import racingcar.domain.Cars;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Arrays;

public class CarsTest {
    @Test
    void createCarsObj() {
        List<String> names = Arrays.asList("hip,pop,dance");
        Cars cars = new Cars(names);
    }
}
