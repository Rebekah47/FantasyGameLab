package Characters.Creatures;

import Characters.Magic.Wizard;

public class Troll extends Enemy {
    private Wizard wizard;

    public Troll(String name, int health, int damage) {
        super(name, health, damage);
        this.wizard = null;
    }


    public Wizard getWizard() {
        return wizard;
    }

    public void setWizard(Wizard wizard) {
        this.wizard = wizard;
    }
}
