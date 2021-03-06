package classes.roomTypes;

import Characters.Creatures.Enemy;

import java.util.ArrayList;

public class Dungeon extends RoomType{
    private ArrayList<Enemy> enemies;

    public Dungeon() {
        this.enemies = new ArrayList<Enemy>();
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public void setEnemies(ArrayList<Enemy> enemies) {
        this.enemies = enemies;
    }

    public void addEnemy(Enemy enemy){
        enemies.add(enemy);
    }
}
