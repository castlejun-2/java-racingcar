package racingcar.controller;

import java.util.Scanner;
import java.util.List;

import racingcar.domain.Cars;
import racingcar.domain.RacingGame;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final List<String> participants = InputView.getParticipants(scanner);
        final Cars cars = new Cars(participants);
        int round = InputView.getRoundNumber(scanner);

        final RacingGame racingGame = new RacingGame(cars, round);

        OutputView.println("\n실행 결과");
        while (!racingGame.isEnd(racingGame.getRound())) {
            racingGame.race();
        }
    }
}
