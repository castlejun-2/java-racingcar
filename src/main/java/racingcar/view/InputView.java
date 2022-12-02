package racingcar.view;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

import racingcar.domain.Validator;
import java.lang.IllegalArgumentException;

public class InputView {
    public static List<String> getParticipants(final Scanner scanner) {
        try {
            OutputView.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
            List<String> participants = Arrays.asList(scanner.nextLine().split(","));
            Validator.isValidNameList(participants);
            return participants;
        } catch (IllegalArgumentException e) {
            OutputView.printError(e.getMessage());
            return getParticipants(scanner);
        }
    }
}
