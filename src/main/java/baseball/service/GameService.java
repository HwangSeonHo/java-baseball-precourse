package baseball.service;

import baseball.domain.Manager;
import baseball.domain.Player;

public class GameService {

    Manager manager = Manager.getInstance();

    public void compareEachPlayer() {
        int opponent_card[] = this.manager.getOpponent().getPlayer_card();
        int challenger_card[] = this.manager.getChallenger().getPlayer_card();

        for(int op_index=0; op_index<opponent_card.length; op_index++){
            compareEachCard(opponent_card, challenger_card, op_index);
        }

    }

    private void compareEachCard(int[] opponent_card, int[] challenger_card, int op_index) {
        for(int ch_index=0; ch_index < challenger_card.length; ch_index++){
            int opponent_number = opponent_card[op_index];
            int challanger_number = challenger_card[ch_index];
            compareEachNumber(opponent_number, challanger_number, op_index, ch_index);
        }
    }

    private void compareEachNumber(int opponent_number, int challanger_number, int op_index, int ch_index) {
        if(opponent_number == challanger_number && op_index == ch_index)
            this.manager.setStrike(this.manager.getStrike()+1);
        if(opponent_number == challanger_number && op_index != ch_index)
            this.manager.setBall(this.manager.getBall());
    }

    private void printResult() {
        int strike = this.manager.getStrike();
        int ball = this.manager.getBall();

        if (strike == 3){
            System.out.println("3스트라이크");
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            this.manager.setIs_endPhase(true);
            return;
        }

        if (ball == 0 && strike == 0) {
            System.out.println("낫싱");
        }
        if (ball == 0 && strike != 0) {
            System.out.println(strike + "스트라이크");
        }
        if (ball != 0 && strike == 0) {
            System.out.println(ball + "볼");
        }
        if (ball != 0 && strike != 0) {
            System.out.println(ball + "볼 " + strike + "스트라이크");
        }
        this.manager.setPhase(this.manager.getPhase()+1);
    }

}
