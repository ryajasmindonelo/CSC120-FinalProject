public class Monster {
    private String name;
    private int maxDamage;
    private int lives;
    private int col;
    private int row;
    private String description;
    private String defeated;

    public Monster(String name, int maxDamage, String description, int lives, int col, int row, String defeated) {
        this.name = name;
        this.maxDamage = maxDamage;
        this.lives = lives;
        this.description = description;
        this.col = col;
        this.row = row;
        this.defeated = defeated;

    }

    public void attack() {
        System.out.println("The " + this.name + " has attacked you.");
    }

    // Accessor for name
    public String getName() {
        return name;
    }

    public String getDefeated() {
        return defeated;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    // Accessor for maxDamage
    public int getMaxDamage() {
        return maxDamage;
    }

    // Accessor for description
    public String getDescription() {
        return description;
    }

    // Accessor for lives
    public int getLives() {
        return lives;
    }

    public void changeLives(int damage) {
        lives = lives - damage;
    }



}