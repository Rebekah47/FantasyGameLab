package classes;

import classes.roomTypes.treasure.Treasure;

import java.util.ArrayList;

public class Player {
    private String name;
    private int health;
    private ArrayList<Treasure> treasures;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
        this.treasures = new ArrayList<Treasure>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }

    public void setTreasures(ArrayList<Treasure> treasures) {
        this.treasures = treasures;
    }
}
