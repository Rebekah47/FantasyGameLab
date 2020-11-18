package Characters.Hero;

import Characters.MagicItems.Item;
import classes.Player;
import classes.attackOption.Weapons.Weapon;

public class Hero extends Player {
    private Weapon weapon;
    private Item item;

    public Hero(String name, int health, Weapon weapon, Item item) {
        super(name, health);
        this.weapon = weapon;
        this.item = item;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
