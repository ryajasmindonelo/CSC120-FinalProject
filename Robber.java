import java.util.ArrayList;
import java.util.List;

public class Robber {
    private List<Item> inventory;
    private int currentRow;
    private int currentCol;
    

    public Robber() {
        this.inventory = inventory;
        this.currentRow = 0;
        this.currentCol = 0;
    }

    //so what will happen is in main i check if their string is an item in the array list

    public void grab(Item item, List<Item> inventory) {
        if (inventory.size() < 3) {
            System.out.println("The " + item.getName() + " is now in your inventory. Use it well.");
            inventory.add(item);
        }
        else {
            System.out.println("You do not have enough space to grab");
        }

    }

    public int getCurrentRow() {
        return currentRow;
    }
    
    // Getter for currentCol
    public int getCurrentCol() {
        return currentCol;
    }

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

    public void moveNorth() {
        currentRow--;
    }

    public void moveSouth() {
        currentRow++;
    }

    public void moveEast() {
        currentCol++;
    }

    public void moveWest() {
        currentCol--;
    }


}
