package enums;

import model.items.Useable;
import model.items.expandables.Pizza;
import model.items.expandables.Water;
import model.items.expandables.Zombie;
import model.items.supplies.Gun;
import model.items.supplies.Mask;

public enum ItemEnum {//add double heal
    ZOMBI("zombi" ,new Zombie()) ,
    WATER("water" , new Water() ),
    PIZAA("pizza" , new Pizza()),
    GUN("gun" , new Gun()),
    MASK("mask" , new Mask());

    private String itemName;

    private Useable itemObject;
    ItemEnum(String itemName , Useable itemObject) {
        this.itemName=itemName;
        this.itemObject=itemObject;
    }

    public String getItemName() {
        return itemName;
    }

    public Useable getItemObject() {
        return itemObject;
    }
}
