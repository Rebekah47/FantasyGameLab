package Characters.Magic;

import Characters.Creatures.Ogre;
import classes.Player;
import classes.attackOption.spells.Spell;

public class Warlock extends Player {
    private Ogre ogre;
    private Spell spell;

    public Warlock(String name, int health, Ogre ogre, Spell spell) {
        super(name, health);
        this.ogre = ogre;
        this.spell = spell;
    }

    public Ogre getOgre() {
        return ogre;
    }

    public void setOgre(Ogre ogre) {
        this.ogre = ogre;
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }
}
