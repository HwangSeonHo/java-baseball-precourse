package baseball.service;

import baseball.domain.Manager;
import baseball.domain.Player;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

public class SettingService {

    Manager manager = Manager.getInstance();

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

    public Player getOpponent() {
        return this.manager.getOpponent();
    }

    public void setOpponent(int[] test_input) {
        this.manager.setOpponent(new Player("tester", test_input));
    }

    public void initializeChallenger(String name, int range) throws IllegalArgumentException {

        System.out.print("숫자를 입력해 주세요 : ");
        String input = Console.readLine();
        int[] card = new int[range];

        if(input.length() == 0 || input.length() > range)
            throw new IllegalArgumentException();

        for(int i = 0; i< input.length(); i++){
            checkOutRangedInput(input.charAt(i));
            card[i] = input.charAt(i) - '0';
        }

        this.manager.setChallenger(new Player(name, card));
    }

    private void checkOutRangedInput(char inputChar) throws IllegalArgumentException{
        if(!('0'<= inputChar && inputChar <= '9')) {
            throw new IllegalArgumentException();
        }
    }

    public int[] getRandomNumberByRange(int range) {
        int[] numbers = new int[range];
        for(int i=0; i<range; i++){
            numbers[i] = uniqRandomNumber(numbers, i);
        }
        return numbers;
    }

    private int uniqRandomNumber(int[] numbers, int i) {
        int randomNumber = Randoms.pickNumberInRange(1,9);
        boolean duplicated = false;
        for(int j=i-1; j>=0; j--){
            duplicated = isDuplicated(randomNumber, numbers[j]);
        }
        if(duplicated)
            return uniqRandomNumber(numbers, i);
        return randomNumber;
    }

    private boolean isDuplicated(int randomNumber, int number) {
        return randomNumber == number;
    }
}
