public class robber {
    private boolean hasWeapon;
    private boolean hasDiamond;

    public robber() {
        this.hasWeapon = false;
        this.hasDiamond = false;
    }

    public void grab(String weapon) {
        if (hasWeapon) {
            System.out.println("You already have a weapon and cannot grab another.");
        } else {
            System.out.println("Grabbing " + weapon);
            this.hasWeapon = true;
        }
    }

    public void attack(String weapon) {
        if (hasWeapon) {
            System.out.println("Attacking using " + weapon);
        } else {
            System.out.println("You have no weapon to attack with!");
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
