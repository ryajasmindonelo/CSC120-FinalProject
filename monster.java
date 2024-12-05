public class monster {
    private String name;
    private int maxDamage;
    private int lives;

    public monster(String name, int maxDamage) {
        this.name = name;
        this.maxDamage = maxDamage;
    }

    public void attack() {
        System.out.println(this.name + "has attacked you.");
        int new_lives = lives - 1;
        System.out.println("You have " + new_lives + "lives left.");
    }
}