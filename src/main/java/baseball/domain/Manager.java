package baseball.domain;

public enum Manager {

    INSTANCE;

    private int total_game_round;
    private boolean is_playing;
    private boolean is_endPhase;
    private int phase;
    private Player opponent;
    private Player challenger;
    private int strike;
    private int ball;

    public boolean isIs_endPhase() {
        return is_endPhase;
    }

    public void setIs_endPhase(boolean is_endPhase) {
        this.is_endPhase = is_endPhase;
    }

    public int getStrike() {
        return strike;
    }

    public void setStrike(int strike) {
        this.strike = strike;
    }

    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }

    public static Manager getInstance() {
        return INSTANCE;
    }

    public int getTotal_game_round() {
        return total_game_round;
    }

    public void setTotal_game_round(int total_game_round) {
        this.total_game_round = total_game_round;
    }

    public boolean is_playing() {
        return is_playing;
    }

    public void setIs_playing(boolean is_playing) {
        this.is_playing = is_playing;
    }

    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }

    public Player getOpponent() {
        return opponent;
    }

    public void setOpponent(Player opponent) {
        this.opponent = opponent;
    }

    public Player getChallenger() {
        return challenger;
    }

    public void setChallenger(Player challenger) {
        this.challenger = challenger;
    }
}
