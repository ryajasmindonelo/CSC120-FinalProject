public class Room {
    private String name;
    private Monster monster;
    private int roomStatus;
    private String descriptionOne;
    private String descriptionTwo;

    // Constructor with both name and monster
    public Room(String name, Monster monster, int roomStatus, String descriptionOne, String descriptionTwo) {
        this.name = name;
        this.monster = monster;
        this.roomStatus = roomStatus;
        this.descriptionOne = descriptionOne;
        this.descriptionTwo = descriptionTwo;
    }

    // Overloaded constructor with only name, defaulting monster to null or some value
    public Room(String name, int roomStatus, String descriptionOne) {
        this.name = name;
        this.roomStatus = roomStatus;
        this.descriptionOne = descriptionOne;
        this.monster = null; // Or assign null if no monster is present
    }

    public Room(String name, Monster monster, int roomStatus, String descriptionOne) {
        this.name = name;
        this.roomStatus = roomStatus;
        this.descriptionOne = descriptionOne;
        this.monster = monster; // Or assign null if no monster is present
    }

    public Room(String name, int roomStatus) {
        this.name = name;
        this.roomStatus = roomStatus;
        this.monster = null; // Or assign null if no monster is present
    }

    // Getters for name and monster (optional, based on your needs)
    public String getName() {
        return name;
    }

    public String getDescriptionOne() {
        return descriptionOne;
    }

    public String getDescriptionTwo() {
        return descriptionTwo;
    }

    public int getRoomStatus() {
        return roomStatus;
    }

    public void changeRoomStatus(int newRoomStatus) {
        roomStatus = newRoomStatus;
    }

    public Monster getMonster() {
        return monster;
    }
}