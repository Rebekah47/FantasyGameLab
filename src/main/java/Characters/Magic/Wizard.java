package Characters.Magic;

import Characters.Creatures.Dragon;
import classes.Player;
import classes.attackOption.spells.Spell;

public class Wizard extends Player {
    private Dragon dragon;
    private Spell spell;

    public Wizard(String name, int health, Dragon dragon, Spell spell) {
        super(name, health);
        this.dragon = dragon;
        this.spell = spell;
    }

    public Dragon getDragon() {
        return dragon;
    }

    public void setDragon(Dragon dragon) {
        this.dragon = dragon;
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }
}
