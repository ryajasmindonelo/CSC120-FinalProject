import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

        robber robber = new robber();

        String action = "";
        while (!action.equalsIgnoreCase("exit")) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("Options: 'walk', 'grab', 'attack', 'steal', 'exit'");
            action = sc.nextLine().toLowerCase();

            if (action.equals("walk")) {
                System.out.println("Choose a direction (North, South, East, West):");
                String direction = sc.nextLine();
                robber.walk(direction);
            } else if (action.equals("grab")) {
                System.out.println("What would you like to grab?");
                String item = sc.nextLine();
                robber.grab(item);
            } else if (action.equals("attack")) {
                System.out.println("What are you attacking with?");
                String weapon = sc.nextLine();
                robber.attack(weapon);
            } else if (action.equals("steal")) {
                robber.stealDiamond();
            } else if (action.equals("exit")) {
                System.out.println("Exiting the game. Goodbye!");
            } else {
                System.out.println("Invalid action. Please choose: 'walk', 'grab', 'attack', 'steal', or 'exit'.");
            }
        }

        sc.close();
    }
}
