import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //lists of items from the item class to store what items are in the game and what items the user picked up
        List<Item> gallery = new ArrayList<>();
        List<Item> inventory = new ArrayList<>();

        //a list of monsters from the monster class that stores what monsters will be used in the game
        List<Monster> monsters = new ArrayList<>();


        //
        String action = "";

        //the max amount of health the user will have
        int health = 100;

        //instances of item class to be used by the user
        Item sword = new Item("Ashen Blade", 2, "A charred sword believed to be forged in the fires of a long-extinct volcano.", true);
        Item hammer = new Item("Stonebreaker Hammer", 3, "Used by ancient builders to shape mountains.", true);
        Item axe = new Item("Thunderstrike Axe", 2, "A massive weapon said to summon storms when swung.", true);
        Item piercer = new Item("Sky Piercer", 2, "A ceremonial spear said to touch the heavens.", true);
        Item star = new Item("Iron Star", 1, "A spiked buckler shaped like a star.", true);
        Item trident = new Item("Firemane Trident", 2, "A weapon of flame-wielding sea warriors.", true);
        Item harpoon = new Item("Bone Harpoon", 2, "A weapon made from the bones of a mythical sea creature.", true);
        Item dart = new Item("Phoenix Feather Dart", 1, "A set of ceremonial throwing darts believed to ignite upon impact.", true);
        Item flail = new Item("Screaming Flail", 1, "A flail with spiked heads that whistle as they swing.", true);
        Item shield = new Item("Golden Aegis", 3, "A shield gilded in gold, said to be unbreakable.", true);


        //instances of monster class used to attack the user
        Monster lion = new Monster("horrific lion", 10, "A ferocious lion stands before you, its bloodstained teeth bared in a savage snarl, eyes blazing with primal fury!", 2, 3, 3, "The lion collapses with a final, guttural growl, its ferocity extinguished.");
        Monster dinosaur = new Monster("terrifying tyrannosaurus rex", 15, "The towering T. rex, pieced together from countless ancient bones, thunders toward you with earth-shaking steps!", 3, 3,0, "The towering skeleton shatters into a cascade of ancient bones, clattering to the ground.");
        Monster spider = new Monster("colossal arachnid", 5, "A colossal spider skitters toward you, its sharp pincers snapping menacingly as its eight beady eyes glint with predatory intent!", 2, 7, 3, "The massive spider curls up, its legs folding inward as it falls lifeless to the floor.");
        Monster comet = new Monster("blazing meteor", 10, "A blazing meteor hurtles toward you, leaving a fiery trail as it threatens to engulf everything in its path!", 2, 0, 5, "The meteor disintegrates mid-air, leaving only a fading trail of fiery embers.");
        Monster megalodon = new Monster("massive megalodon", 15, "The massive megalodon bursts from its tank, water cascading around its colossal, gaping jaws!", 3, 2, 4, "The megalodon sinks back into the water, its monstrous form going still and silent.");
        Monster mummy = new Monster("grotesque mummy", 10, "The decayed mummy shuffles toward you, its hollow groans echoing through the air, linen bandages trailing like ghostly whispers!", 2, 6, 5, "The mummy crumbles to dust, its centuries-old bandages fluttering to the ground.");
        Monster lasers = new Monster("deadly laserbeams", 5, "Sharp beams of lasers slice through the air, crisscrossing in a deadly web around the diamond's case!", 1, 4, 5, "The laser beams flicker and fade, leaving only the quiet hum of deactivated machinery.");

        //adding the instances of monster class to the list, monsters
        monsters.add(lion);
        monsters.add(dinosaur);
        monsters.add(spider);
        monsters.add(comet);
        monsters.add(megalodon);
        monsters.add(mummy);
        monsters.add(lasers);

        // adding the instances of item class to the list, gallery
        gallery.add(sword);
        gallery.add(hammer);
        gallery.add(axe);
        gallery.add(piercer);
        gallery.add(star);
        gallery.add(trident);
        gallery.add(harpoon);
        gallery.add(dart);
        gallery.add(flail);
        gallery.add(shield);

        //sets up an instance of room class, where each individual room is a certain amount of rows and columns that will be used as the map for the game
        Room [][] rooms = new Room[8][6];
        for (int col = 0; col < 2; col ++) {
            for (int row = 0; row < 2; row++) {
                rooms[col][row] = new Room("Ancient Weapons Gallery", 1, " You are in the Ancient Weapons Gallery, where legendary weapons line the walls, each one a masterpiece of craftsmanship and history. Their gleaming edges and intricate designs seem to whisper tales of epic battles and forgotten heroes. Type 'wneapons' to see available weapons. Tye 'grab' to grab a weaopn. Type 'examine' to examine a weapon.");
            }
            
        }
        for (int col = 2; col < 4; col ++) {
            for (int row = 0; row < 2; row++) {
                rooms[col][row] = new Room("Bones Atrium", dinosaur, 1, " You are in the Bones Atrium. A towering T.rex skeleton dominates the room, its jagged teeth casting long shadows, while delicate bird skeletons perch in glass cases, their hollow forms eerily still. The air is cool and heavy, carrying the faint, metallic tang of preservation. Suddenly, a ferocious roar echoes throughout the atrium. Choose your path wisely.", " You are in the Bones Atrium. A shattered T. rex skeleton lies strewn across the room. Delicate bird skeletons remain untouched in their glass cases, their hollow forms watching silently over the wreckage. The air is heavy with the metallic tang of preservation and a new, unsettling silence.");
            }
            
        }
        for (int col = 4; col < 6; col ++) {
            for (int row = 0; row < 2; row++) {
                rooms[col][row] = new Room("Geology and Gems Hall", 1, " You are in the Geology and Gems Hall. It glimmers with the light of countless crystals and polished gemstones, their colors casting a kaleidoscope of reflections across the walls. Massive geodes stand open like natural treasure chests, while rare minerals and ancient fossils rest in sleek glass displays. The air hums faintly, as though alive with the energy of the earth's buried secrets.");
            }
            
        }
        for (int col = 6; col < 8; col ++) {
            for (int row = 0; row < 2; row++) {
                rooms[col][row] = new Room("Butterfly Pavillion", 1, " You are in the Butterfly Pavillion. vibrant butterflies flit gracefully through the warm, sunlit air. Tropical plants and blooming flowers create a lush haven, their sweet scent mingling with the soft rustle of delicate wings.");
            }
            
        }
        for (int col = 0; col < 2; col ++) {
            for (int row = 2; row < 4; row++) {
                rooms[col][row] = null;
            }
            
        }
        for (int col = 2; col < 4; col ++) {
            for (int row = 2; row < 4; row++) {
                rooms[col][row] = new Room("Great Mammals Wing", lion, 1, " You are in the Great Mammals Wing. A towering, lifelike lion sculpture stands poised mid-roar, its fierce gaze seeming to follow you across the room. Around it, detailed dioramas showcase elephants, bears, and other magnificent creatures, set against sweeping landscapes that evoke the wildness of their natural habitats. You hear a fierce snarl. Choose your path wisely.", " You are in the Great Mammals Wing. The mangled body of a once-towering lion sculpture lies sprawled across the floor. Around the scene, dioramas of elephants, bears, and other majestic creatures remain untouched, their serene poses starkly contrasting the chaos below.");
            }
            
        }
        for (int col = 4; col < 6; col ++) {
            for (int row = 2; row < 4; row++) {
                rooms[col][row] = null;
            }
            
        }

        for (int col = 6; col < 8; col ++) {
            for (int row = 2; row < 4; row++) {
                rooms[col][row] = new Room("Insect Zoo", spider, 1, " You are in the Insect Zoo. It buzzes with life, its walls lined with terrariums teeming with scuttling beetles, glowing fireflies, and shimmering mantises. Overhead, the faint rustle of movement hints at something larger, hidden among the web-laden corners of the exhibit. The air is warm and earthy, alive with the hum of wings and the occasional chitter of unseen creatures. Choose your path wisely.", " You are in the Insect Zoo. hums with life, its terrariums alive with darting beetles, fluttering moths, and mantises swaying like living leaves. In one shadowy corner, a tangle of abandoned webs clings to a massive, lifeless spider, its legs curled inwards like the petals of a withering flower. The air is thick with the earthy scent of soil.");
            }
            
        }

        for (int col = 0; col < 2; col ++) {
            for (int row = 4; row < 6; row++) {
                rooms[col][row] = new Room("Planetarium", comet, 1, " You are in the Planetarium. It is a vast, domed chamber where the universe unfolds across the ceiling in a dazzling display of light and motion. Stars twinkle and swirl in a perfect replica of the night sky, while distant galaxies and vibrant nebulae pulse with cosmic energy. The room is silent save for the soft hum of the projector. Choose your path wisely.", " You are in the Planetarium. Its domed ceiling is alive with swirling galaxies and constellations. In the center of the room rests a massive meteorite, split cleanly in half to reveal its shimmering, crystalline core");
            }
            
        }

        for (int col = 2; col < 4; col ++) {
            for (int row = 4; row < 6; row++) {
                rooms[col][row] = new Room("Marine Animals Hall", megalodon, 1, " You are in the Marine Animals Hall. Vibrant aquariums showcase colorful coral reefs, shimmering schools of fish, and graceful sea turtles. Dominating the room is a life-sized display of a megalodon, its enormous body suspended within a tank, jaws agape in a silent, eternal roar. Choose your path wisely.", " You are in the Marine Animals Hall. Its aquariums are alive with colorful marine creatures, their movements a stark contrast to the centerpiece of the room. In the largest tank, the massive, lifeless body of a megalodon lies still, its once-powerful frame now a husk at the bottom of the glass enclosure.");
            }
            
        }

        for (int col = 4; col < 6; col ++) {
            for (int row = 4; row < 6; row++) {
                rooms[col][row] = new Room("Precious Items Display", lasers, 1, " You are in the Precious Items Display. It is a dazzling chamber where treasures from across the ages gleam under carefully placed lights. At the center of the room, resting on a velvet-lined pedestal within a bulletproof glass case, is the legendary Hope Diamond. Navigate the room to reach the Hope Diamond, surpass the lasers, and seize it to claim your fortune.");
            }
            
        }

        for (int col = 6; col < 8; col ++) {
            for (int row = 4; row < 6; row++) {
                rooms[col][row] = new Room("Ancient Egypt Exhibit", mummy, 1, " You are in the Ancient Egypt Exhibit. It transports you to the land of pharaohs and pyramids, its dim lighting and sandstone-colored walls evoking the atmosphere of a long-lost tomb. At the center lies a glass case housing a meticulously preserved mummy, its linen wrappings yellowed with age, yet still intact. Hieroglyph-covered artifacts, golden sarcophagi, and canopic jars surround the display. Choose your path wisely.", " You are in the Ancient Egypt exhibit. It is eerily silent, its sandstone walls and faint incense-like scent drawing you into the world of the pharaohs. At the center, the glass case meant to hold the exhibit's prized mummy stands open and empty, its velvet lining undisturbed. On the floor nearby lies a crumpled pile of bandages, yellowed and brittle.");
            }
            
        }

        //prints the storyline to give the user a context to what the game is about

        System.out.println("");
        System.out.println("Storyline: You are a daring robber, set on pulling off the greatest heist of all time: stealing the legendary Hope Diamond from the Natural History Museum. Under the cover of darkness, you break in, ready for the challenge. But the museum hides a chilling secret—after sunset, its exhibits come to life. Danger prowls in every shadow, and turning back isn’t an option. Armed with ancient weapons, you must navigate deadly obstacles, face living legends, and seize the Hope Diamond to claim unimaginable riches. The stakes are high, and the night is unforgiving. Good luck—you’re going to need it.");
        
        //
        Scanner sc = new Scanner(System.in);

        // prints out a statement that gives the user a choice to view the commands or not
        System.out.println("Would you like to view the available commands before starting? Type 'yes' or 'no':");
        String userInput = sc.nextLine().toLowerCase();

        //if the user does not type in yes or no, it will reprompt them to type in another response
        while (!userInput.equals("yes") && !userInput.equals("no")) {
            System.out.println("Invalid input. Please type 'Yes' or 'No':");
            userInput = sc.nextLine().toLowerCase();
        }

        // when the user types in yes, it will list the commands that can be used and then prompt the user to type in their name 
        if (userInput.equals("yes")) {
            System.out.println("");
            System.out.println("Commands:");
            System.out.println("To move, type 'north', 'south', 'east', or 'west'. To view your inventory type 'inventory'. To view your surroundings, type 'view'.");
            System.out.println("Type your name to continue:");
            String userName = sc.nextLine();
        
        // when the user types in no, it will skip the print statements that list the commands, then prompt the user to type in their name and will start the game
        } else if (userInput.equals("no")) {
            System.out.println("");
            System.out.println("Type your name to continue:");
            String userName = sc.nextLine();
            System.out.println("");
            System.out.println("Starting game...");
        }

        // creates an instance of robber class
        Robber robber = new Robber();


        String direction = "";

        // prints the next part of the storyline and lets the user know that 
        System.out.println("");
        System.out.println("To view the available commands type 'help'.");
        System.out.println("You find yourself in the Ancient Weapons Gallery, where legendary weapons line the walls, each one a masterpiece of craftsmanship and history. Their gleaming edges and intricate designs seem to whisper tales of epic battles and forgotten heroes. The weapons include:");

        // prints all the weapons in the gallery
        for (Item item : gallery) {
            System.out.println("The " + item.getName());
        }

        // prints a statement telling the user to examine or grab weapons in the ancient weapons gallery
        System.out.println("Beware, this museum is not what it seems. These weapons may come in use. Type 'weapons' to view weapons available. Type 'examine' to examine the weapons. Type 'grab' to choose your weapons. You have 3 inventory slots.");
        System.out.println("When you are done grabbing and examining weapons, type a cardinal direction to begin moving through the game.");
        Room previousRoom = rooms[robber.getCurrentCol()][robber.getCurrentRow()]; //instance of the room class that has the previous room the robber was in
        while (health > 0 && lasers.getLives() > 0) {
            System.out.println("");
            direction = sc.nextLine().toLowerCase(); // prompts user to enter a command
            if (direction.equals("grab")) {
                Room currentRoom = rooms[robber.getCurrentCol()][robber.getCurrentRow()];
                if (currentRoom.getName().equals("Ancient Weapons Gallery") && inventory.size() < 3) {
                    System.out.println("What item are you grabbing? (Do not type 'The')"); // prompts user to type a weapon to grab
                    String userWeapon = sc.nextLine();
                    String itemString = userWeapon.toLowerCase();
                    
                    boolean itemExists = false;
                    for (Item item : new ArrayList<>(gallery)) { //loops through the list, gallery with all the weapons
                        if (item.getName().equalsIgnoreCase(itemString)) { 
                            itemExists = true;
                            item.changeInGallery();
                            System.out.println("You have grabbed the " + item.getName() + "!");
                            robber.grab(item, inventory);
                            gallery.remove(item);
                            if (inventory.size() == 3) { //prints an extra statement when the inventory is at capacity
                                System.out.println("Your inventory is full. You can't grab anymore weapons. Type 'drop' to drop an item or type a cardinal direction to continue through the game.");
                            }
                        }
                    }
                
                    if (!itemExists) { //prints a statement when the item the user types in does not exist
                        System.out.println(userWeapon + " is not in the gallery right now. Type 'grab' to grab a different weapon, 'weapons' to see the list of weapons, or 'examine' to look at a weapon.");
                    }
                
                }
                else { // prints a statement that says you cannot grab a weapon
                    System.out.println("There is nothing to grab in the "  + currentRoom.getName() + " because your inventory is full or there are no weapons. Please type another command.");
                }
                continue;
            }

            if (direction.equals("help")) { // prints the commands when the user types in help
                System.out.println("To move, type 'north', 'south', 'east', or 'west'. To view your inventory type 'inventory'. To view your surroundings, type 'view'. To view the available commands type 'help'.");
                continue;
            }

            if (direction.equals("view")) { // prints the description of the room they are in 
                Room currentRoom = rooms[robber.getCurrentCol()][robber.getCurrentRow()];
                if (currentRoom.getRoomStatus() == 1) {
                    System.out.println(currentRoom.getDescriptionOne());
                }
                else if (currentRoom.getRoomStatus() == 2){
                    System.out.println(currentRoom.getDescriptionTwo());
                }
                continue;
            }


            if (direction.equals("weapons")) { // prints the list of weapons when the user is in the ancient weapons gallery
                Room currentRoom = rooms[robber.getCurrentCol()][robber.getCurrentRow()];
                if (currentRoom.getName().equals("Ancient Weapons Gallery")) {
                    for (Item item : gallery) {
                        System.out.println("The " + item.getName());
                    }
                }
                else {
                    System.out.println("You are not in the Ancient Weapons Gallery.");
                }
                continue;

            }

            if (direction.equals("inventory")) { // prints the inventory when the user types in inventory
                int i = 1;
                for (Item item: inventory) {
                    System.out.println(i + ". " + item.getName());
                    i = i + 1;
                }
                continue;
            }

            if (direction.equals("examine")) { // when the user types examine for the variable direction
                Room currentRoom = rooms[robber.getCurrentCol()][robber.getCurrentRow()];
                if (currentRoom.getName().equals("Ancient Weapons Gallery")) {
                    System.out.println("What item are you examining? (Do not type 'The')"); // asks the user what item they want to look at and stores it 
                    String userExamine = sc.nextLine().toLowerCase(); // stores the user's answer as the variable userExamine
            
                    boolean itemFound = false; // Flag to check if the item exists in the gallery
            
                    for (Item item : gallery) {
                        if (userExamine.equals(item.getName().toLowerCase())) { // Check if names match
                            System.out.println("The " + item.getName() + ": " + item.getDescription());
                            itemFound = true; // Mark the item as found
                            break; // Exit the loop after finding the item
                        }
                    }
            
                    if (!itemFound) {
                        System.out.println(userExamine + " is not in the gallery."); // prints a statement when an item is not in the list, gallery
                    }
                } else {
                    System.out.println("You are not in the Ancient Weapons Gallery."); // prints a statement when you are not in the Ancient Weapons Gallery because you cannot grab weapons from another room
                }
                continue;
            }

            if (direction.equals("drop")) { 
                System.out.println("What item are you dropping? (Do not type 'The')"); // prompts the user to type a weapon they want to drop
                String userDrop = sc.nextLine();
                String drop = userDrop.toLowerCase();
            
                boolean itemFound = false;
            
                for (Item item : new ArrayList<>(inventory)) { 
                    if (drop.equals(item.getName().toLowerCase())) { 
                        System.out.println("You have dropped the " + item.getName() + ". It clangs against the ground and vanishes in front of your eyes, returning to its display in the Ancient Weapons Gallery.");
                        inventory.remove(item); // removes the item from the user's inventory
                        gallery.add(item); // adds the item back to the list, gallery
                        itemFound = true; 
                        break; 
                    }
                }
            
                if (!itemFound) {
                    System.out.println(userDrop + " is not in your inventory."); // Print if no match is found
                }
            continue;
            }

            if (direction.equals("north")) { // when the user types in north
                robber.moveNorth();
                if (robber.getCurrentCol() < 0 || robber.getCurrentCol() >= 8 || robber.getCurrentRow() < 0 || robber.getCurrentRow() >= 6 || rooms[robber.getCurrentCol()][robber.getCurrentRow()] == null) {
                    robber.moveSouth();
                    System.out.println("You have run into a wall! You are still in " + rooms[robber.getCurrentCol()][robber.getCurrentRow()].getName() + "."); // prints a statement that says the user ran into a wall when the user tries to go beyond the map
                } else {
                    Room currentRoom = rooms[robber.getCurrentCol()][robber.getCurrentRow()];
                    if (currentRoom != null && !currentRoom.getName().equals(previousRoom.getName())) { // prints a statement when the user is in the room for the first time
                        System.out.print("You have moved north.");
                        if (currentRoom.getRoomStatus() == 1) {
                            System.out.println(currentRoom.getDescriptionOne()); // prints a description before the monster in the room is killed
                        }
                        else if (currentRoom.getRoomStatus() == 2){
                            System.out.println(currentRoom.getDescriptionTwo()); // prints a description after the monster is killed
                        }
                    }
                    else {
                        System.out.println("You have moved north. You are in the " + rooms[robber.getCurrentCol()][robber.getCurrentRow()].getName() + "."); // prints a statement saying the direction and room you are in when you move within the same room
                    }
                    previousRoom = currentRoom;
                }
            }
            else if (direction.equals("east")) {
                robber.moveEast();
                if (robber.getCurrentCol() < 0 || robber.getCurrentCol() >= 8 || robber.getCurrentRow() < 0 || robber.getCurrentRow() >= 6 || rooms[robber.getCurrentCol()][robber.getCurrentRow()] == null) {
                    robber.moveWest();
                    System.out.println("You have run into a wall! You are still in " + rooms[robber.getCurrentCol()][robber.getCurrentRow()].getName() + "."); //prints a statement that says the user ran into a wall when the user tries to go beyond the map
                } else {
                    Room currentRoom = rooms[robber.getCurrentCol()][robber.getCurrentRow()];
                    if (currentRoom != null && !currentRoom.getName().equals(previousRoom.getName())) { // prints a statement when the user is in the room for the first time
                        System.out.print("You have moved east.");
                        if (currentRoom.getRoomStatus() == 1) {
                            System.out.println(currentRoom.getDescriptionOne()); // prints a description before the monster in the room is killed
                        }
                        else if (currentRoom.getRoomStatus() == 2){
                            System.out.println(currentRoom.getDescriptionTwo()); // prints a description after the monster is killed
                        }
                    }
                    else {
                        System.out.println("You have moved east. You are in the " + rooms[robber.getCurrentCol()][robber.getCurrentRow()].getName() + "."); // prints a statement saying the direction and room you are in when you move within the same room
                    }
                    previousRoom = currentRoom;
                }
            }
            else if (direction.equals("west")) {
                robber.moveWest();
                if (robber.getCurrentCol() < 0 || robber.getCurrentCol() >= 8 || robber.getCurrentRow() < 0 || robber.getCurrentRow() >= 6 || rooms[robber.getCurrentCol()][robber.getCurrentRow()] == null) {
                    robber.moveEast();
                    System.out.println("You have run into a wall! You are still in " + rooms[robber.getCurrentCol()][robber.getCurrentRow()].getName() + "."); //prints a statement that says the user ran into a wall when the user tries to go beyond the map
                } else {
                    Room currentRoom = rooms[robber.getCurrentCol()][robber.getCurrentRow()];
                    if (currentRoom != null && !currentRoom.getName().equals(previousRoom.getName())) { // prints a statement when the user is in the room for the first time
                        System.out.print("You have moved west.");
                        if (currentRoom.getRoomStatus() == 1) {
                            System.out.println(currentRoom.getDescriptionOne()); // prints a description before the monster in the room is killed
                        }
                        else if (currentRoom.getRoomStatus() == 2){
                            System.out.println(currentRoom.getDescriptionTwo()); // prints a description after the monster is killed
                        }
                    }
                    else {
                        System.out.println("You have moved west. You are in the " + rooms[robber.getCurrentCol()][robber.getCurrentRow()].getName() + "."); // prints a statement saying the direction and room you are in when you move within the same room
                    
                    }
                    previousRoom = currentRoom;
                }
            }
            else if (direction.equals("south")) {
                robber.moveSouth();
                if (robber.getCurrentCol() < 0 || robber.getCurrentCol() >= 8 || robber.getCurrentRow() < 0 || robber.getCurrentRow() >= 6 || rooms[robber.getCurrentCol()][robber.getCurrentRow()] == null) {
                    robber.moveNorth();
                    System.out.println("You have run into a wall! You are still in " + rooms[robber.getCurrentCol()][robber.getCurrentRow()].getName() + "."); //prints a statement that says the user ran into a wall when the user tries to go beyond the map
                } else {
                    Room currentRoom = rooms[robber.getCurrentCol()][robber.getCurrentRow()];
                    if (currentRoom != null && !currentRoom.getName().equals(previousRoom.getName())) { // prints a statement when the user moves into this room for the first time
                        System.out.print("You have moved south.");
                        if (currentRoom.getRoomStatus() == 1) {
                            System.out.println(currentRoom.getDescriptionOne()); // prints a description before the monster in the room is killed
                        }
                        else if (currentRoom.getRoomStatus() == 2){
                            System.out.println(currentRoom.getDescriptionTwo()); // prints a description after the monster is killed
                        }
                    }
                    else {
                        System.out.println("You have moved south. You are in the " + rooms[robber.getCurrentCol()][robber.getCurrentRow()].getName() + "."); // prints a statement saying the direction and room you are in when you move within the same room
                    }
                    previousRoom = currentRoom;
                }
            }
            else {
                System.out.println("This is not a valid command. Type 'help' to see available commands."); // prints a statment when the command typed in does not match 
            }



            for (Monster monster : monsters) {
                if (robber.getCurrentCol() == monster.getCol() && robber.getCurrentRow() == monster.getRow()) {
                    if (monster.getLives() > 0) {
                        while (monster.getLives() > 0 && health > 0) {
                            System.out.print(monster.getDescription()); // prints the description of the monster when it is in the part of the arraylist that a monster is in
                            System.out.println(" You must defeat it to pass! Type 'attack'!"); // prompts the user
                            System.out.println("");
                            action = sc.nextLine().toLowerCase();
                            if (action.equals("attack")) {
                                System.out.println("What are you attacking with? You have:"); // asks the user to type a weapon they are attacking with
                                int i = 1;
                                for (Item item: inventory) { // loops through the inventory
                                    System.out.println(i + ". " + item.getName()); 
                                    i = i + 1;
                                }
                                String weaponToUse = sc.nextLine();
                                boolean found = false;
            
                                for (Item item : inventory) {
                                    if (item.getName().equalsIgnoreCase(weaponToUse)) { // when using a weapon to attack
                                        robber.attack(item, monster); // calls attack method from robber class
                                        monster.attack(); // calls attack method from monster clawss
                                        health -= monster.getMaxDamage(); // decreases health
                                        System.out.println("You now have " + health + " health left.");
                                        found = true;
                                        break;
                                    }
                                }
            
                                if (!found) { // If no match was found in the inventory
                                    System.out.println("You don't have that!");
                                    monster.attack();
                                    health -= monster.getMaxDamage();
                                    System.out.println("You now have " + health + " health left.");
                                }
                            } else { // when the user does not type attack 
                                monster.attack();
                                health -= monster.getMaxDamage();
                                System.out.println("You now have " + health + " health left.");
                                System.out.print("Do you have a death wish? You must attack! ");
                            }
            
                            if (health < 1) { 
                                System.out.println("The " + monster.getName() + " has killed you. You lose!"); // prints a statement when health is below 1 that tells the user they died and lost
                            } else if (monster.getLives() < 1) {
                                System.out.print(monster.getDefeated()); // calls getDefeated from the monster class that describes how the monster died
                                System.out.println(" You have defeated the " + monster.getName() + ". You may go in any direction."); // prints a statement when the user was able to defeat the monster
            
                                // Update room status globally
                                String currentRoomName = rooms[robber.getCurrentCol()][robber.getCurrentRow()].getName();
                                for (int col = 0; col < rooms.length; col++) {
                                    for (int row = 0; row < rooms[col].length; row++) {
                                        if (rooms[col][row] != null && rooms[col][row].getName().equals(currentRoomName)) {
                                            rooms[col][row].changeRoomStatus(2); // Set status to 2
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            if (lasers.getLives() < 1) { // when the user gets to the diamond and wins the game!
                System.out.println("The legendary Hope Diamond lies before you, glimmering with an otherworldly allure. With steady hands, you take the priceless jewel, sealing your fate as one of the wealthiest people in history. Congratulations— you've successfully completed your heist and won the game!");

            }
        }
    }
}

