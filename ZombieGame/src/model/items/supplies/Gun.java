package model.items.supplies;

import enums.ItemEnum;
import player.Player;

public class Gun extends SuppliesItem{

    @Override
    public void itemAction(Player player) {

    }

    @Override
    public String toString() {
        return ItemEnum.GUN.getItemName();
    }
}
