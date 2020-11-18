package classes.roomTypes;

import Behaviours.IWin;
import Characters.Creatures.Enemy;
import classes.Player;

import java.util.ArrayList;

public class Forest extends RoomType implements IWin {
    private ArrayList<Enemy> enemies;

    public Forest() {
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

    public int clearDead(){
        ArrayList<Enemy> deadEnemies = new ArrayList<Enemy>();
        for (Enemy enemy : enemies){
            if(enemy.checkifDead()){
                deadEnemies.add(enemy);
            }
        }

        for (Enemy enemy : deadEnemies){
            enemies.remove(enemy);
        }
        return enemies.size();
    }

    public String win(){
        if(clearDead() == 0){
            return "You are Victorious!";
        }
        else {
            return "Continue in Battle!!";
        }
    }

}
