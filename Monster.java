/**
 * The Monster class represents a monster entity in the game with attributes such as name, maximum damage, lives, position, and description
 **/
public class Monster {
    /**
     * Name of the monster
     **/
    private String name;

    /**
     * Maximum damage the monster can inflict the robber
     **/
    private int maxDamage;

    /**
     * Life status of the monster
     **/
    private int lives;

    /**
     * Column position of the monster in the museum
     **/
    private int col;

    /**
     * Row position of the monster in the museum
     **/
    private int row;

    /**
     * Description of the monster
     **/
    private String description;

    /**
     * Status when the monster is defeated
     **/
    private String defeated;

    /**
     * Constructs a new Monster instance with the specified attributes
     *
     * @param name str the name of the monster
     * @param maxDamage int the maximum damage the monster can inflict
     * @param description string the description of the monster
     * @param lives int the life status of the monster
     * @param col int the column position of the monster on the museum
     * @param row int the row position of the monster on the museum
     * @param defeated the status when the monster is defeated
     **/
    public Monster(String name, int maxDamage, String description, int lives, int col, int row, String defeated) {
        this.name = name;
        this.maxDamage = maxDamage;
        this.lives = lives;
        this.description = description;
        this.col = col;
        this.row = row;
        this.defeated = defeated;

    }

    /**
     * Simulates an attack by the monster on the robber and prints a message
     **/
    public void attack() {
        System.out.println("The " + this.name + " has attacked you.");
    }

    /**
     * Gets the name of the monster
     * @return the name of the monster
     **/
    public String getName() {
        return name;
    }

    /**
     * Gets the status or message displayed when the monster is defeated by the robber
     * @return the defeated message
     **/
    public String getDefeated() {
        return defeated;
    }

    /**
     * Gets the row position of the monster on the museum
     * @return the row position
     **/
    public int getRow() {
        return row;
    }

    /**
     * Gets the column position of the monster on the museum
     * @return the column position
     **/
    public int getCol() {
        return col;
    }

    /**
     * Gets the maximum damage the monster can inflict
     * @return the maximum damage
     **/
    public int getMaxDamage() {
        return maxDamage;
    }

    /**
     * Gets the description of the monster
     * @return the description of the monster
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Gets the life of the monster
     * @return life of the monster
     **/
    public int getLives() {
        return lives;
    }

    /**
     * Reduces the number of lives of the monster by the particular damage amount
     * @param damage the amount of damage to reduce the monster's lives by
     **/
    public void changeLives(int damage) {
        lives = lives - damage;
    }
}