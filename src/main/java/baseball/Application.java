package baseball;

import baseball.controller.BaseballController;

public class Application {
    public static void main(String[] args) throws IllegalArgumentException {
        // TODO: 프로그램 구현
        BaseballController controller = new BaseballController();
        controller.run();
    }
}
