public class Item {
    private String name;
    private int maxDamage;
    private String description;
    private boolean inGallery;

    public Item(String name, int maxDamage, String description, boolean inGallery) {
        this.name = name;
        this.maxDamage = maxDamage;
        this.description = description;
        this.inGallery = inGallery;
    }

    public String getName() {
        return name;
    }

    public boolean getInGallery() {
        return inGallery;
    }

    public void changeInGallery() {
        inGallery = !inGallery;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public String getDescription() {
        return description;
    }
}
