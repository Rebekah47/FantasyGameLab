package Characters;

import Behaviours.IHeal;
import classes.Player;
import classes.attackOption.healingTools.HealingTool;

public class Cleric extends Player implements IHeal {
    private HealingTool healingTool;

    public Cleric(String name, int health, HealingTool healingTool) {
        super(name, health);
        this.healingTool = healingTool;
    }

    public HealingTool getHealingTool() {
        return healingTool;
    }

    public void setHealingTool(HealingTool healingTool) {
        this.healingTool = healingTool;
    }

    public void heal(Player player){
        int currentPlayerHealth = player.getHealth();
        int newPlayerHealth = healingTool.getHealing() + currentPlayerHealth;
        player.setHealth(newPlayerHealth);
    }
}
