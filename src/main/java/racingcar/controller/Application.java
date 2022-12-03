package racingcar.controller;

import java.util.Scanner;
import java.util.List;

import racingcar.domain.Cars;
import racingcar.view.InputView;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final List<String> participants = InputView.getParticipants(scanner);
        final Cars cars = new Cars(participants);
        int round = InputView.getRoundNumber(scanner);


    }
}
