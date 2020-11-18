package Characters.Creatures;

import classes.Player;

public class Enemy extends Player{
    private int damage;

    public Enemy(String name, int health, int damage) {
        super(name, health);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
