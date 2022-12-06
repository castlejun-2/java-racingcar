package racingcar;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domain.Cars;
import racingcar.domain.RacingGame;

import java.util.Arrays;
import java.util.List;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {
    RacingGame racingGame;
    @Test
    @BeforeEach
    void createRacingGameObj() {
        List<String> names = Arrays.asList("hip,pop,dance");
        Cars cars = new Cars(names);

        racingGame = new RacingGame(cars,3);
    }

    @Test
    @DisplayName("라운드 감소 함수 테스트")
    void subRoundTest() {
        assertThat(racingGame.subRound(racingGame.getRound())).isEqualTo(2);
    }
}
