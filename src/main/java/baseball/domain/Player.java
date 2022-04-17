package baseball.domain;


public class Player {
    private String player_name;
    private int[] player_card;

    public Player(String player_name, int[] player_card) {
        this.player_name = player_name;
        this.player_card = player_card;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public int[] getPlayer_card() {
        return player_card;
    }

    public void setPlayer_card(int[] player_card) {
        this.player_card = player_card;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }
}
