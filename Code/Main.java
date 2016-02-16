import java.util.*;

public class Main {
    public static void main (String[] args)  {
        Scanner in = new Scanner (System.in);
        String input;
        System.out.println ("Welcome to [the game]!");
/* Use if you want to do something with the player's name
        System.out.println ("What is your name?");
*/
/*
        System.out.println ("\nHello " + input + "!");
*/
        Player character = new Player (/*input, */100, 100, 5, 0, 30);
        System.out.println ("You currently have " + character.playerCurrentHP() + " HP and " + character.playerCurrentPotions() + " potions.");
        System.out.println ("If you wish to view these stats during any point of the game, type in \"Status\".");
        System.out.println ("\nNow, let's begin!\n");
        // The beginning of the game
        
		
		
		// Level 1
        System.out.println ("--------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println ("                                                                Level 1");
        System.out.println ("--------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("What do you want to do now?");
		input = in.nextLine();
        character.currentHealth = character.move();
        // Always call the following 2 lines after every scene
        status (input, character);
		System.out.println("What do you want to do now?");
		input = in.nextLine();
        character.currentHealth = character.move();
        status (input, character);

/*
        // Level 2
        System.out.println ("--------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println ("                                                                Level 2");
        System.out.println ("--------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("What do you want to do now?");
		input = in.nextLine();
        character.currentHealth = character.move();
        // Always call the following 2 lines after every scene
        status (input, character);
		System.out.println("What do you want to do now?");
		input = in.nextLine();
        character.currentHealth = character.move();
        status (input, character);

        // Level 3
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                                Level 3");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("What do you want to do now?");
		input = in.nextLine();
        character.currentHealth = character.move();
        // Always call the following 2 lines after every scene
        status (input, character);
		System.out.println("What do you want to do now?");
		input = in.nextLine();
        character.currentHealth = character.move();
        status (input, character);
        
        // Level 4
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                                Level 4");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("What do you want to do now?");
		input = in.nextLine();
        character.currentHealth = character.move();
        // Always call the following 2 lines after every scene
        status (input, character);
		System.out.println("What do you want to do now?");
		input = in.nextLine();
        character.currentHealth = character.move();
        status (input, character);

        // Level 5 (Boss Fight)
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                                Level 5");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("What do you want to do now?");
		input = in.nextLine();
        character.currentHealth = character.move();
        // Always call the following 2 lines after every scene
        status (input, character);
		System.out.println("What do you want to do now?");
		input = in.nextLine();
        character.currentHealth = character.move();
        status (input, character);
*/
    }

    // Checks to see if the player types in "status" during any time in the game
    public static void status(String command, Player person)  {
        if ((command.equals("Status") || command.equals("status")) && (person.playerCurrentHP() > 0)) {
            System.out.println("You currently have " + person.playerCurrentHP() + " HP and " + person.playerCurrentPotions() + " potions.\n");
        }
    }
}
