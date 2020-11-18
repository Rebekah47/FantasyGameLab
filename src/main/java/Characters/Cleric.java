package Characters;

import classes.Player;
import classes.attackOption.healingTools.HealingTool;

public class Cleric extends Player {
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
}
