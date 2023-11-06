package model.items.supplies;

import enums.ItemEnum;
import player.Player;

public class Mask extends SuppliesItem{


    @Override
    public void itemAction(Player player) {

    }

    @Override
    public String toString() {
        return ItemEnum.MASK.getItemName();
    }
}
