package racingcar;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;
import racingcar.domain.Cars;
import racingcar.domain.RacingGame;

import java.util.Arrays;
import java.util.List;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {
    @Test
    void createRacingGameObj() {
        List<String> names = Arrays.asList("hip,pop,dance");
        Cars cars = new Cars(names);

        RacingGame racingGame = new RacingGame(cars,3);
    }
}
