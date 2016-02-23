import java.util.*;

public class Main {
    public static void main (String[] args)  {
        Scanner in = new Scanner (System.in);
        String input;
        System.out.println ("Welcome to [the game]!");
        System.out.println ("What is your name?");
        String playerName = in.nextLine();
        System.out.println ("\nHello " + playerName + "!");
        
        Player character = new Player (/*input, */100, 100, 5, 0, 30);
        System.out.println ("You currently have " + character.playerCurrentHP() + " HP and " + character.playerCurrentPotions() + " potions.");
        System.out.println ("If you wish to view these stats during any point of the game, type in \"Status\".");
	System.out.println("If you wish to drink a potion, first type in \"Status\" and follow the instructions given.");
	System.out.println("In this game, every time you perform an action you will lose HP. When your HP hits 0, you will die and the game will end.");
        System.out.println ("\nNow, let's begin...\n");
        // The beginning of the game
	// Global game variable
	boolean gameStatus = true;
	// Global level variable
	boolean checked = false;

        System.out.println ("--------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println ("                                                                Level 1");
        System.out.println ("--------------------------------------------------------------------------------------------------------------------------------------------");
	System.out.println("ZZZzzz...\nYou are sleeping peacefully, dreaming of summer vacation, when suddenly you are awakened by a bright, annoying light flashing through the window, directly at your face.");
	System.out.println("\"Why is is so bright...?!\" you gripe as you pull your covers over your head, trying to ignore the light and fall back asleep.");
	System.out.println("However, your attempts turn out to be futile as you being to hear a series of high-pitched noises.");
	System.out.println("You decide that you've had enough and get out of bed to check the window for the source of the disturbance, only to realize that the light shining through your window is making it too bright to see anything outside.");
	System.out.println("As you stand next to your window clad only in your PJs wondering what you should do, the high-pitched noises begin to fade as you hear a voice.");
	System.out.println("\"" + playerName + "\" a soft, gentle voice calls out.");
	System.out.println("You look around, trying to pinpoint the location of the voice.");
	System.out.println("\"This voice is hauntingly beautiful... and... familiar...?\" you think as you being to feel compelled to track down its owner.");
	System.out.println("As you being to walk out of your room, the light behind you begins to slowly fade away.\n");
	System.out.println("\"Alright\" you think to yourself \"Where should I check out first? Should I CHECK OUT THE KITCHEN, CHECK OUT THE DOG HOUSE, or CHECK OUT THE BACKYARD?\"");
	input = in.nextLine();
        // Always call the following 11 lines after every input
        while (statusCheck(input)) {
        	status (input, character);
		if (character.numPotions > 0) {
			System.out.println("Would you like to drink a potion? YES or NO?");
			input = in.nextLine();
			if (input.equalsIgnoreCase("yes")) {
				character.currentHealth = character.drink();
				character.numPotions--;
			}
			else if (input.equalsIgnoreCase("no")) {
			}
			else {
				System.out.println("Command not recognized. Please try again.\n");
			}
		}
		System.out.println();
        	input = in.nextLine();
        }

		LEVEL_1: // LEVEL 1
		while (gameStatus) {
			if (input.equalsIgnoreCase("check out the dog house")) {
				character.currentHealth = character.move();
				// Always call the following 3 lines after every move
				if (character.currentHealth <= 0) {
					gameStatus = false;
					break LEVEL_1;
				}
				System.out.println("\n\"Blue?\" you call out as you walk out the front door towards the dog house.");
				System.out.println("You hear your dog, Blue, trotting towards you with something in his mouth.");
				System.out.println("\"Should I TAKE THE ITEM, CHECK OUT THE KITCHEN, or CHECK OUT THE BACKYARD?\" you wonder to yourself as you absent-mindedly pet Blue on the head.");
				input = in.nextLine();
				// Always call the following 11 lines after every input
				while (statusCheck(input)) {
					status (input, character);
					if (character.numPotions > 0) {
						System.out.println("Would you like to drink a potion? YES or NO?");
						input = in.nextLine();
						if (input.equalsIgnoreCase("yes")) {
							character.currentHealth = character.drink();
							character.numPotions--;
						}
						else if (input.equalsIgnoreCase("no")) {
						}
						else {
							System.out.println("Command not recognized. Please try again.\n");
						}
					}
					System.out.println();
					input = in.nextLine();
				}
				if (input.equalsIgnoreCase("take the item")) {
					if (checked == false) {
						checked = true;
						character.currentHealth = character.move();
						// Always call the following 3 lines after every move
						if (character.currentHealth <= 0) {
							gameStatus = false;
							break LEVEL_1;
						}
						System.out.println("You remove the item from Blue's mouth.\nYOU HAVE OBTAINED A POTION!\n");
						character.numPotions++;
					}
					else {
						System.out.println("You remove the item from Blue's mouth only to find out that it is an old tennis ball.\n");
					}
					System.out.println("Do you want to CHECK OUT THE KITCHEN or CHECK OUT THE BACKYARD?");
					input = in.nextLine();
					// Always call the following 11 lines after every input
					while (statusCheck(input)) {
						status (input, character);
						if (character.numPotions > 0) {
							System.out.println("Would you like to drink a potion? YES or NO?");
							input = in.nextLine();
							if (input.equalsIgnoreCase("yes")) {
								character.currentHealth = character.drink();
								character.numPotions--;
							}
							else if (input.equalsIgnoreCase("no")) {
							}
							else {
								System.out.println("Command not recognized. Please try again.\n");
							}
						}
					System.out.println();
						input = in.nextLine();
					}
					continue LEVEL_1;
				}
				continue LEVEL_1;
			}
			else if (input.equalsIgnoreCase("check out the kitchen")) {
				character.currentHealth = character.move();
				// Always call the following 3 lines after every move
				if (character.currentHealth <= 0) {
					gameStatus = false;
					break LEVEL_1;
				}
				System.out.println("\nYou walk into the kitchen.\n\"Alright\" you think to yourself \"Do I want to LOOK INSIDE THE SINK, CHECK OUT THE DOG HOUSE, or CHECK OUT THE BACKYARD");
				input = in.nextLine();
				// Always call the following 4 lines after every input
				// Always call the following 11 lines after every input
				while (statusCheck(input)) {
					status (input, character);
					if (character.numPotions > 0) {
						System.out.println("Would you like to drink a potion? YES or NO?");
						input = in.nextLine();
						if (input.equalsIgnoreCase("yes")) {
							character.currentHealth = character.drink();
							character.numPotions--;
						}
						else if (input.equalsIgnoreCase("no")) {
						}
						else {
							System.out.println("Command not recognized. Please try again.\n");
						}
					}
					System.out.println();
					input = in.nextLine();
				}
				if (input.equalsIgnoreCase("look inside the sink")) {
					character.currentHealth = character.move();
					// Always call the following 3 lines after every move
					if (character.currentHealth <= 0) {
						gameStatus = false;
						break LEVEL_1;
					}
					System.out.println("\nYou look over to your sink and find a bunch of dirty dishes. \"I should've cleaned those hours ago...\" you think to yourself");
					System.out.println("\"Do I want to CHECK OUT THE DOG HOUSE, or CHECK OUT THE BACKYARD\"?\n");
					input = in.nextLine();
					// Always call the following 11 lines after every input
					while (statusCheck(input)) {
						status (input, character);
						if (character.numPotions > 0) {
							System.out.println("Would you like to drink a potion? YES or NO?");
							input = in.nextLine();
							if (input.equalsIgnoreCase("yes")) {
								character.currentHealth = character.drink();
								character.numPotions--;
							}
							else if (input.equalsIgnoreCase("no")) {
							}
							else {
								System.out.println("Command not recognized. Please try again.\n");
							}
						}
					System.out.println();
						input = in.nextLine();
					}
					continue LEVEL_1;
				}
				continue LEVEL_1;
			}
			else if (input.equalsIgnoreCase("check out the backyard")) {
				character.currentHealth = character.move();
				// Always call the following 3 lines after every move
				if (character.currentHealth <= 0) {
					gameStatus = false;
					break LEVEL_1;
				}
				System.out.println("\nYou walk outside to the backyard where you are immediately caught in a tractor beam.");
				System.out.println("Your thoughts immediately go into overdrive mode, debating whether it would be better to STRUGGLE AGAINST THE BEAM or JUST COMPLY.");
				input = in.nextLine();
				// Always call the following 11 lines after every input
				while (statusCheck(input)) {
					status (input, character);
					if (character.numPotions > 0) {
						System.out.println("Would you like to drink a potion? YES or NO?");
						input = in.nextLine();
						if (input.equalsIgnoreCase("yes")) {
							character.currentHealth = character.drink();
							character.numPotions--;
						}
						else if (input.equalsIgnoreCase("no")) {
						}
						else {
							System.out.println("Command not recognized. Please try again.\n");
						}
					}
					System.out.println();
					input = in.nextLine();
				}
				if (input.equalsIgnoreCase("struggle against the beam")) {
					System.out.println("Your struggles are useless as you feel yourself being beamed up and everything fades to black.");
				}
				else {
					System.out.println("\nYou relax your body and as you feel yourself being beamed up, everything fades to black.");
				}
				break LEVEL_1;
			}
			else {
				while (!input.equalsIgnoreCase("CHECK OUT THE KITCHEN") || !input.equalsIgnoreCase("CHECK OUT THE DOG HOUSE") || !input.equalsIgnoreCase("CHECK OUT THE BACKYARD") || !input.equals("status")) {
					System.out.println("Command not recognized. Please try again.\n");
					input = in.nextLine();
					while (statusCheck(input)) {
						status (input, character);
						if (character.numPotions > 0) {
							System.out.println("Would you like to drink a potion? YES or NO?");
							input = in.nextLine();
							if (input.equalsIgnoreCase("yes")) {
								character.currentHealth = character.drink();
								character.numPotions--;
							}
							else if (input.equalsIgnoreCase("no")) {
							}
							else {
								System.out.println("Command not recognized. Please try again.\n");
							}
						}
					System.out.println();
						input = in.nextLine();
					}
					break;
				}
				continue LEVEL_1;
			}
		}
		
		LEVEL_2:
		while (gameStatus) {
			System.out.println ("--------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println ("                                                                Level 2");
			System.out.println ("--------------------------------------------------------------------------------------------------------------------------------------------");
			checked = false;
			break LEVEL_2;
		}
/*		
        character.currentHealth = character.move();
		// Always call the following 3 lines after every move
		if (character.currentHealth <= 0) {
			gameStatus = false;
			break LEVEL_1;
		}
		System.out.println("What do you want to do now?");
		input = in.nextLine();
        // Always call the following 11 lines after every input
        while (statusCheck(input)) {
            status (input, character);
			if (character.numPotions > 0) {
						input = in.nextLine();
				System.out.println("Would you like to drink a potion? YES or NO?");
				if (input.equalsIgnoreCase("yes")) {
					character.currentHealth = character.drink();
					character.numPotions--;
				}
				else if (input.equalsIgnoreCase("no")) {
				}
				else {
					System.out.println("Command not recognized. Please try again.\n");
				}
			}
            input = in.nextLine();
					System.out.println();
        }
*/
/*
        // Level 2
        
	System.out.println("What do you want to do now?");
        input = in.nextLine();
        // Always call the following 4 lines after every input
        while (statusCheck(input)) {
            status (input, character);
            input = in.nextLine();
        }
        character.currentHealth = character.move();
	System.out.println("What do you want to do now?");
	input = in.nextLine();
        // Always call the following 4 lines after every input
        while (statusCheck(input)) {
            status (input, character);
            input = in.nextLine();
        }
        character.currentHealth = character.move();
	
        // Level 3
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                                Level 3");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("What do you want to do now?");
        input = in.nextLine();
        // Always call the following 4 lines after every input
        while (statusCheck(input)) {
            status (input, character);
            input = in.nextLine();
        }
        character.currentHealth = character.move();
	System.out.println("What do you want to do now?");
	input = in.nextLine();
        // Always call the following 4 lines after every input
        while (statusCheck(input)) {
            status (input, character);
            input = in.nextLine();
        }
        character.currentHealth = character.move();
	
        // Level 4
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                                Level 4");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("What do you want to do now?");
        input = in.nextLine();
        // Always call the following 4 lines after every input
        while (statusCheck(input)) {
            status (input, character);
            input = in.nextLine();
        }
        character.currentHealth = character.move();
	System.out.println("What do you want to do now?");
	input = in.nextLine();
        // Always call the following 4 lines after every input
        while (statusCheck(input)) {
            status (input, character);
            input = in.nextLine();
        }
        character.currentHealth = character.move();
	
        // Level 5 (Boss Fight)
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                                Level 5");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("What do you want to do now?");
        input = in.nextLine();
        // Always call the following 4 lines after every input
        while (statusCheck(input)) {
            status (input, character);
            input = in.nextLine();
        }
        character.currentHealth = character.move();
		System.out.println("What do you want to do now?");
		input = in.nextLine();
        // Always call the following 4 lines after every input
        while (statusCheck(input)) {
            status (input, character);
            input = in.nextLine();
        }
        character.currentHealth = character.move();
*/
		System.out.println("You ran out of HP. Better luck next time!\nGAME OVER!");
	}
    // Method explains what happens if the player types in "status" during any time in the game
    public static void status(String command, Player person)  {
        if (statusCheck(command)) {
			System.out.println("You currently have " + person.playerCurrentHP() + " HP and " + person.playerCurrentPotions() + " potions.\n");
        }
    }
    // Method checks to see if the player typed in "status"
    public static Boolean statusCheck(String prompt) {
        if (prompt.equalsIgnoreCase("Status")) {
            return true;
        }
        else {
            return false;
        }
    }
}
