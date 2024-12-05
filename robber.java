import java.util.ArrayList;
import java.util.List;

public class robber {
    private List<String> weapons;
    private boolean hasDiamond;

    public robber() {
        this.weapons = new ArrayList<>();
        this.hasDiamond = false;
    }

    public void grab(String item) {
        if (weapons.contains(item.toLowerCase())) {
            System.out.println("You already have " + item + ".");
        } else {
            System.out.println("Grabbing " + item);
            weapons.add(item.toLowerCase());
        }
    }

    public void attack(String weaponToUse) {
        if (weapons.contains(weaponToUse.toLowerCase())) {
            System.out.println("Attacking using " + weaponToUse);
        } else {
            System.out.println("You don't have " + weaponToUse + "! You need to grab it first.");
        }
    }

    public boolean walk(String direction) {
        if (direction.equalsIgnoreCase("north") || direction.equalsIgnoreCase("south") ||
            direction.equalsIgnoreCase("east") || direction.equalsIgnoreCase("west")) {
            System.out.println("Walking " + direction);
            return true;
        } else {
            System.out.println("Invalid direction. Please choose: North, South, East, or West.");
            return false;
        }
    }

    public void stealDiamond() {
        if (!hasDiamond) {
            System.out.println("You successfully steal the Hope Diamond!");
            this.hasDiamond = true;
        } else {
            System.out.println("You already have the Hope Diamond!");
        }
    }
}
