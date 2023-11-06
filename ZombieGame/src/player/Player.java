package player;

import location.Location;
import model.inventory.Inventory;

public class Player {


    private String name ;

    private Inventory inventory;
    private Location location;
    private  double  hp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        if(hp<=0){
            throw new IllegalArgumentException("Starting hp must be greater than 0");
        }
        this.hp = hp;
    }
}
