public class Room {
    private String name;
    private String monster;

    // Constructor with both name and monster
    public Room(String name, String monster) {
        this.name = name;
        this.monster = monster;
    }

    // Overloaded constructor with only name, defaulting monster to null or some value
    public Room(String name) {
        this.name = name;
        this.monster = "None"; // Or assign null if no monster is present
    }

    // Getters for name and monster (optional, based on your needs)
    public String getName() {
        return name;
    }

    public String getMonster() {
        return monster;
    }
}