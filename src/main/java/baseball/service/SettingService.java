package baseball.service;

import baseball.domain.Manager;
import baseball.domain.Player;
import camp.nextstep.edu.missionutils.Randoms;

public class SettingService {

    Manager manager = Manager.getInstance();

    public boolean checkGamePlaying() {
        return manager.is_playing();
    }

    public void increaseTotalGameRound() {
        this.manager.setTotal_game_round(this.manager.getTotal_game_round()+1);
    }

    public void initializeManager() {
        this.manager.setPhase(0);
        this.manager.setIs_endPhase(false);
        this.manager.setStrike(0);
        this.manager.setBall(0);
    }

    public void initializeOpponent(String name, int range) {
        this.manager.setOpponent(new Player(name, getRandomNumberByRange(range)));
    }

    public void initializeChallenger(String name, int range) {
        this.manager.setChallenger(new Player(name, new int[range]));
    }

    public int[] getRandomNumberByRange(int range) {
        int[] numbers = new int[range];
        for(int i=0; i<range; i++){
            numbers[i] = Randoms.pickNumberInRange(1,9);
        }
        return numbers;
    }
}
