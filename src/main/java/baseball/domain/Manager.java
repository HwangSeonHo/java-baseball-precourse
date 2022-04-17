package baseball.domain;

public enum Manager {

    RESUME,
    END;

    private int total_game_round;
    private boolean is_playing;
    private int phase;
    private Player opponent;
    private Player challenger;

    public int getTotal_game_round() {
        return total_game_round;
    }

    public void setTotal_game_round(int total_game_round) {
        this.total_game_round = total_game_round;
    }

    public boolean isIs_playing() {
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
