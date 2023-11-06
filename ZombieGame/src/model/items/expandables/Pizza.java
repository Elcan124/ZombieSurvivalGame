package model.items.expandables;

import enums.ItemEnum;
import globalData.GlobalDataService;
import player.Player;

public class Pizza extends ExpandableItem {


    @Override
    public void itemAction(Player player) {



       GlobalDataService.player.setHp(GlobalDataService.player.getHp()+ heal);
    }

    @Override
    public String toString() {
        return ItemEnum.PIZAA.getItemName();
    }
}
