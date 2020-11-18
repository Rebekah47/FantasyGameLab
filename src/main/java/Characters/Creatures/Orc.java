package Characters.Creatures;

import Characters.Hero.Knight;
import classes.Player;

public class Orc extends Enemy{
    private Knight knight;

    public Orc(String name, int health, int damage) {
        super(name, health, damage);
        this.knight = null;
    }


    public Knight getKnight() {
        return knight;
    }

    public void setKnight(Knight knight) {
        this.knight = knight;
    }
}
