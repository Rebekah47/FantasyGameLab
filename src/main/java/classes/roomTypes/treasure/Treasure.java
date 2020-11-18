package classes.roomTypes.treasure;

public enum Treasure {
    GOLD(500),
    SILVER(200),
    GEMS(1000),
    FUR(50);

    private int value;

    Treasure(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
