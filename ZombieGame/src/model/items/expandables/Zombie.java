package model.items.expandables;

import enums.ItemEnum;
import player.Player;

public class Zombie  extends ExpandableItem{

    @Override
    public void itemAction(Player player) {

    }

    @Override
    public String toString() {
        return ItemEnum.ZOMBI.getItemName();
    }
}
