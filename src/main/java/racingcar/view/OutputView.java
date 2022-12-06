package racingcar.view;

import racingcar.domain.Cars;

public class OutputView {
    public final static void println(final String msg) {
        System.out.println(msg);
    }

    final static void printError(final String errorMsg) {
        System.out.println("[ERROR] "+errorMsg);
    }

    public final static void printRaceResult(Cars cars) {
        for (int i = 0; i < cars.getCarsLength(); i++) {
            System.out.println(cars.getCarInfo(i).getCarName()+" : "+"-".repeat(cars.getCarInfo(i).getPosition()));
        }
        println("");
    }

    public final static void printWinner(Cars cars) {
        System.out.println("최종 우승자 : "+cars.getWinner());
    }
}
