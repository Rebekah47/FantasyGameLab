package Characters.Creatures;

import Behaviours.IAttack;
import Characters.Hero.Hero;
import classes.Player;

public class Enemy extends Player implements IAttack {
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


    public void attack(Player player){
        if (player instanceof Enemy == false){
            int currentEnemyHealth = player.getHealth();
            int newEnemyHealth = currentEnemyHealth - this.getDamage();
            player.setHealth(newEnemyHealth);
        }
    }
}
