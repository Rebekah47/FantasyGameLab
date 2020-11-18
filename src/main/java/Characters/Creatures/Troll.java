package Characters.Creatures;

import Characters.Magic.Wizard;

public class Troll extends Enemy {
    private Wizard wizard;

    public Troll(int damage, Wizard wizard) {
        super(damage);
        this.wizard = wizard;
    }

    public Wizard getWizard() {
        return wizard;
    }

    public void setWizard(Wizard wizard) {
        this.wizard = wizard;
    }
}
