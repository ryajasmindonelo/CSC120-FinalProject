import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Room [][] rooms = new Room[8][6];
        for (int col = 0; col < 2; col ++) {
            for (int row = 0; row < 2; row++) {
                rooms[col][row] = new Room("Ancient Weapons");
            }
            
        }
        for (int col = 2; col < 4; col ++) {
            for (int row = 0; row < 2; row++) {
                rooms[col][row] = new Room("Bones", "dinosaur");
            }
            
        }
        for (int col = 4; col < 6; col ++) {
            for (int row = 0; row < 2; row++) {
                rooms[col][row] = new Room("Geology and Gems");
            }
            
        }
        for (int col = 6; col < 8; col ++) {
            for (int row = 0; row < 2; row++) {
                rooms[col][row] = new Room("Butterfly Pavillion", "poison butterflies");
            }
            
        }
        for (int col = 0; col < 2; col ++) {
            for (int row = 2; row < 4; row++) {
                rooms[col][row] = null;
            }
            
        }
        for (int col = 2; col < 4; col ++) {
            for (int row = 2; row < 4; row++) {
                rooms[col][row] = new Room("Mammals", "lion");
            }
            
        }
        for (int col = 4; col < 6; col ++) {
            for (int row = 2; row < 4; row++) {
                rooms[col][row] = null;
            }
            
        }

        for (int col = 6; col < 8; col ++) {
            for (int row = 2; row < 4; row++) {
                rooms[col][row] = new Room("Insect Zoo", "spiders");
            }
            
        }

        for (int col = 0; col < 2; col ++) {
            for (int row = 4; row < 6; row++) {
                rooms[col][row] = new Room("Planetarium", "comet");
            }
            
        }

        for (int col = 2; col < 4; col ++) {
            for (int row = 4; row < 6; row++) {
                rooms[col][row] = new Room("Marine Animals", "megalodon");
            }
            
        }

        for (int col = 4; col < 6; col ++) {
            for (int row = 4; row < 6; row++) {
                rooms[col][row] = new Room("Precious Items", "lasers");
            }
            
        }

        for (int col = 6; col < 8; col ++) {
            for (int row = 4; row < 6; row++) {
                rooms[col][row] = new Room("Ancient Egypt", "mummy");
            }
            
        }
        
        // for (int i = 0; i < 8; i++) {  // 8 rows
        //     ArrayList<String> row = new ArrayList<>();
        //     for (int j = 0; j < 6; j++) {  // 6 columns
        //         row.add("Room (" + i + ", " + j + ")");
        //     }
        //     rooms.add(row);
        // }
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome");
        System.out.println("Would you like to read the instructions before starting? Type 'Yes' or 'No':");
        String userInput = sc.nextLine().toLowerCase();

        while (!userInput.equals("yes") && !userInput.equals("no")) {
            System.out.println("Invalid input. Please type 'Yes' or 'No':");
            userInput = sc.nextLine().toLowerCase();
        }

        if (userInput.equals("yes")) {
            System.out.println("Instruction Manual");
            System.out.println("1. Navigate the museum using directions (North, South, East, West).");
            System.out.println("2. Grab items and use them to overcome obstacles.");
            System.out.println("3. Your goal is to steal the Hope Diamond and escape.");
        } else if (userInput.equals("no")) {
            System.out.println("Starting game...");
        }

        System.out.println("Storyline: INTRODUCTION TO GAME.");

        Robber robber = new Robber();


        String direction = "";


        System.out.println("You have entered the game! You may go in any direction");
        while (!direction.equals("exit")) {
            direction = sc.nextLine().toLowerCase();
            if (direction.equals("north")) {
                robber.moveNorth();
                System.out.println("You are in the " + rooms[robber.getCurrentCol()][robber.getCurrentRow()].getName() + " Room.");
                if (rooms[robber.getCurrentCol()][robber.getCurrentRow()] == null) {
                    robber.moveSouth();
                    System.out.println("You've run into a wall! You are still in " + rooms[robber.getCurrentCol()][robber.getCurrentRow()].getName());
                }
            }
            else if (direction.equals("east")) {
                robber.moveEast();
                System.out.println("You are in the " + rooms[robber.getCurrentCol()][robber.getCurrentRow()].getName() + " Room.");
                if (rooms[robber.getCurrentCol()][robber.getCurrentRow()] == null) {
                    robber.moveWest();
                    System.out.println("You've run into a wall! You are still in " + rooms[robber.getCurrentCol()][robber.getCurrentRow()].getName());
                }
            }
            else if (direction.equals("west")) {
                robber.moveWest();
                System.out.println("You are in the " + rooms[robber.getCurrentCol()][robber.getCurrentRow()].getName() + " Room.");
                if (rooms[robber.getCurrentCol()][robber.getCurrentRow()] == null) {
                    robber.moveEast();
                    System.out.println("You've run into a wall! You are still in " + rooms[robber.getCurrentCol()][robber.getCurrentRow()].getName());
                }
            }
            else if (direction.equals("south")) {
                robber.moveSouth();
                System.out.println("You are in the " + rooms[robber.getCurrentCol()][robber.getCurrentRow()].getName() + " Room.");
                if (rooms[robber.getCurrentCol()][robber.getCurrentRow()] == null) {
                    robber.moveNorth();
                    System.out.println("You've run into a wall! You are still in " + rooms[robber.getCurrentCol()][robber.getCurrentRow()].getName());
                }

            }
            else {
                System.out.println("This is not a valid direction.");
            }
            // System.out.println("You are in the " + rooms[robber.getCurrentCol()][robber.getCurrentRow()].getName() + " Room.");

                // try {
                //     // Attempt to access the room and print its name
                //     System.out.println("You are in the " + rooms[robber.getCurrentCol()][robber.getCurrentRow()].getName() + " Room.");
                // } catch (NullPointerException e) {
                //     // Handle the case where the room is null
                //     System.out.println("You've run into a wall!");
                // }
        }


        // while (!action.equalsIgnoreCase("exit")) {
        //     System.out.println("\nWhat would you like to do?");
        //     System.out.println("Options: 'walk', 'grab', 'attack', 'steal', 'exit'");
        //     action = sc.nextLine().toLowerCase();
            

        //     if (action.equals("walk")) {
        //         System.out.println("Choose a direction (North, South, East, West):");
        //         String direction = sc.nextLine();
        //         robber.walk(direction);

        //     } else if (action.equals("grab")) {
        //         System.out.println("What would you like to grab?");
        //         String item = sc.nextLine();
        //         robber.grab(item);
        //     } else if (action.equals("attack")) {
        //         System.out.println("What are you attacking with?");
        //         String weaponToUse = sc.nextLine();
        //         robber.attack(weaponToUse);
        //     } else if (action.equals("steal")) {
        //         robber.stealDiamond();
        //     } else if (action.equals("exit")) {
        //         System.out.println("Exiting the game. Goodbye!");
        //     } else {
        //         System.out.println("Invalid action. Please choose: 'walk', 'grab', 'attack', 'steal', or 'exit'.");
        //     }
        // }

        // sc.close();
    }
}
