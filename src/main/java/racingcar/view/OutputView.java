package racingcar.view;

public class OutputView {
    final static void println(final String msg) {
        System.out.println(msg);
    }

    final static void printError(final String errorMsg) {
        System.out.println("[ERROR] "+errorMsg);
    }
}
