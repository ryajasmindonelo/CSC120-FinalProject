public class Item {
    // name of the weapon
    private String name;

    // the amount of damage the weapon will do
    private int maxDamage;

    // describes what the weapon is
    private String description;

    // boolean saying if the weapon is in the list, gallery or not
    private boolean inGallery;

    /**
     * constructor with the name, amount of damage, description, and if it is in the gallery or not
     * @param name
     * @param maxDamage
     * @param description
     * @param inGallery
     */
    public Item(String name, int maxDamage, String description, boolean inGallery) {
        this.name = name;
        this.maxDamage = maxDamage;
        this.description = description;
        this.inGallery = inGallery;
    }
    
    // getters for each parameter in the constructor
    public String getName() {
        return name;
    }

    public boolean getInGallery() {
        return inGallery;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public String getDescription() {
        return description;
    }

    // changes the boolean for inGallery
    public void changeInGallery() {
        inGallery = !inGallery;
    }
}
