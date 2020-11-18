package classes.roomTypes;

import classes.roomTypes.treasure.Treasure;

public class Castle {
    private Treasure treasure;

    public Castle(Treasure treasure) {
        this.treasure = treasure;
    }

    public Treasure getTreasure() {
        return treasure;
    }

    public void setTreasure(Treasure treasure) {
        this.treasure = treasure;
    }
}
