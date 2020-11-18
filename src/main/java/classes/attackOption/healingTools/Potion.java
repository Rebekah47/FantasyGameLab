package classes.attackOption.healingTools;

public class Potion extends HealingTool{
    private Boolean immunity;

    public Potion(int healing) {
        super(healing);
        this.immunity = false;
    }

    public Boolean getImmunity() {
        return immunity;
    }

    public void setImmunity(Boolean immunity) {
        this.immunity = immunity;
    }
}
