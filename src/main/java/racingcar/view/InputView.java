package racingcar.view;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class InputView {
    public static List<String> getParticipants(final Scanner scanner) {
        OutputView.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        List<String> participants = Arrays.asList(scanner.nextLine().split(","));
        return participants;
    }
}
