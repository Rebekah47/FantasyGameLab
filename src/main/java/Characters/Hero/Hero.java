package Characters.Hero;

import Behaviours.IAttack;
import Characters.Creatures.Enemy;
import Characters.MagicItems.Item;
import classes.Player;
import classes.attackOption.Weapons.Weapon;
import classes.roomTypes.Forest;
import classes.roomTypes.RoomType;

public class Hero extends Player implements IAttack {
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

    public void attack(Player player){
        if (player instanceof Enemy){
            int currentEnemyHealth = player.getHealth();
            int newEnemyHealth = currentEnemyHealth - this.getWeapon().getDamage();
            player.setHealth(newEnemyHealth);
        }
    }
}
