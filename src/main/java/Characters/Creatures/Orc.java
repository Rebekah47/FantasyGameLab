package Characters.Creatures;

import Characters.Hero.Knight;
import classes.Player;

public class Orc extends Enemy{
    private Knight knight;

    public Orc(int damage, Knight knight) {
        super(damage);
        this.knight = knight;
    }

    public Knight getKnight() {
        return knight;
    }

    public void setKnight(Knight knight) {
        this.knight = knight;
    }
}
