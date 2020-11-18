package classes.roomTypes;

import classes.Player;

import java.util.ArrayList;

public class RoomType {
    private ArrayList<Player> charactersInRoom;

    public RoomType() {
        this.charactersInRoom = new ArrayList<Player>();
    }

    public ArrayList<Player> getCharactersInRoom() {
        return charactersInRoom;
    }

    public void setCharactersInRoom(ArrayList<Player> charactersInRoom) {
        this.charactersInRoom = charactersInRoom;
    }

    public void addCharacter(Player player){
        charactersInRoom.add(player);
    }
}
