import Characters.Cleric;
import Characters.Creatures.Dragon;
import Characters.Creatures.Enemy;
import Characters.Creatures.Ogre;
import Characters.Creatures.Orc;
import Characters.Magic.Wizard;
import classes.Player;
import classes.attackOption.Weapons.Weapon;
import classes.attackOption.healingTools.HealingTool;
import classes.attackOption.healingTools.Potion;
import classes.attackOption.spells.LightningStrike;
import classes.attackOption.spells.Spell;
import classes.roomTypes.Forest;
import classes.roomTypes.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForestTest {

    Player bekah;
    Player cyril;
    HealingTool healingTool;
    Spell spell;
    Dragon dragon;
    Player orc;
    Forest forest;

    @Before
    public void before(){
        healingTool = new Potion(20);
        dragon = new Dragon(45, 57);
        spell = new LightningStrike(20);
        cyril = new Wizard("Cyril", 100, dragon, spell);
        forest = new Forest();
        orc = new Orc("Blob", 100, 25);
        bekah = new Cleric("Bekah", 100, healingTool);
    }

    @Test
    public void canAddToRoom(){
        forest.addCharacter(bekah);
        forest.addCharacter(cyril);
        assertEquals(2, forest.getCharactersInRoom().size());
    }

    @Test
    public void playerCanAttackEnemy(){
        Wizard newCyril = (Wizard) cyril;
        newCyril.attack(orc);
        assertEquals(80, orc.getHealth());
    }

    @Test
    public void cantAttackFriend(){
        Wizard newCyril = (Wizard) cyril;
        newCyril.attack(bekah);
        assertEquals(100, bekah.getHealth());
    }

    @Test
    public void enemyAttack(){
        Enemy newOrc = (Enemy) orc;
        newOrc.attack(cyril);
        assertEquals(75, cyril.getHealth());
    }

    @Test
    public void canHeal(){
        Enemy newOrc = (Enemy) orc;
        newOrc.attack(cyril);
        Cleric newBekah = (Cleric) bekah;
        newBekah.heal(cyril);
        assertEquals(95, cyril.getHealth());
    }

    @Test
    public void canAttackButNotKill(){
        forest.addCharacter(cyril);
        Enemy newOrc = (Enemy) orc;
        forest.addEnemy(newOrc);
        Wizard newCyril = (Wizard) cyril;
        newCyril.attack(orc);
        assertEquals("Continue in Battle!!", forest.win());
    }

    @Test
    public void canKill(){
        forest.addCharacter(cyril);
        Enemy newOrc = (Enemy) orc;
        forest.addEnemy(newOrc);
        Spell newSpell = new LightningStrike(100);
        Wizard newCyril = new Wizard("Cyril", 100, dragon, newSpell);
        newCyril.attack(orc);
        assertEquals("You are Victorious!", forest.win());
    }



}
