package baseball.controller;

import baseball.service.GameService;
import baseball.service.SettingService;

public class BaseballController {

    SettingService settingService = new SettingService();
    GameService gameService = new GameService();

    public void run() throws IllegalArgumentException {
        initialize();
        gameRoop();
    }

    private void gameRoop() {
        settingService.initializeManager();
        settingService.initializeChallenger("User", 3);
        gameService.play();
        gameService.printResult();

        if(!gameService.isEndPhase())
            gameRoop();

        gameService.askRetry();

        if(!gameService.isEndPhase()){
            initialize();
            gameRoop();
        }
    }

    public void initialize() {
        settingService.initializeManager();
        settingService.initializeOpponent("Computer", 3);
        settingService.increaseTotalGameRound();
    }

}
