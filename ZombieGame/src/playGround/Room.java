package playGround;

import model.items.Useable;
import player.Player;

import java.util.ArrayList;

public class Room {

    private Player player;
    private ArrayList<Useable> items ;


    public Room() {
        items=new ArrayList<>();
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ArrayList<Useable> getItems() {
        return items;
    }

    public void setItems(ArrayList<Useable> items) {
        this.items = items;
    }
}
