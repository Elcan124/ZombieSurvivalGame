package model.items.expandables;

import model.items.Useable;

public abstract class ExpandableItem implements Useable {
    protected  int heal ;

    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }
}
