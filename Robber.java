/**
 * The Robber class represents a character in the game who can move, attack, and manage an inventory of items
 **/
import java.util.List;

public class Robber {
    /**
     * Inventory of items the robber can grab and carry
     **/
    private List<Item> inventory;

    /**
     * Current row position of the robber in the museum
     **/
    private int currentRow;

    /**
     * Current column position of the robber in the museum
     **/
    private int currentCol;
    
    /**
     * Constructs a new Robber instance with an empty inventory and initial position at (0, 0)
     **/
    public Robber() {
        this.inventory = inventory;
        this.currentRow = 0;
        this.currentCol = 0;
    }

    /**
     * Adds an item to the robber's inventory if there is space available.
     *
     * @param item the item to be added to the inventory
     * @param inventory the current inventory of the robber
     **/
    public void grab(Item item, List<Item> inventory) {
        if (inventory.size() < 3) {
            System.out.println("The " + item.getName() + " is now in your inventory. Use it well.");
            inventory.add(item);
        }
        else {
            System.out.println("You do not have enough space to grab");
        }
    }

    /**
     * Gets the robber's current row position
     * @return the current row position
     **/
    public int getCurrentRow() {
        return currentRow;
    }
    
    /**
     * Gets the robber's current column position
     * @return the current column position
     **/
    public int getCurrentCol() {
        return currentCol;
    }

    /**
     * Attacks a monster using a particular weapon which deals damage based on the weapon's maximum damage
     * @param weaponToUse the weapon used to the attack the monster
     * @param monster the monster being attacked
     **/
    public void attack(Item weaponToUse, Monster monster) {
        System.out.println("You attack using the " + weaponToUse.getName() + ". You have done damage!");
        if (weaponToUse.getMaxDamage() == 1) {
            monster.changeLives(1);
        }
        if (weaponToUse.getMaxDamage() == 2) {
            monster.changeLives(2);
        }
        if (weaponToUse.getMaxDamage() == 3) {
            monster.changeLives(3);
        }
    }

    /**
     * Moves the robber one step north in the museum (decreases the row position)
     **/
    public void moveNorth() {
        currentRow--;
    }

    /**
     * Moves the robber one step south in the museum (increases the row position)
     **/
    public void moveSouth() {
        currentRow++;
    }

    /**
     * Moves the robber one step east in the museum (increases the column position)
     **/
    public void moveEast() {
        currentCol++;
    }

    /**
     * Moves the robber one step west in the museum (decreasing the column position)
     **/
    public void moveWest() {
        currentCol--;
    }
}