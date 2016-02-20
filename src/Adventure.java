import java.util.Scanner;
import java.util.Random;

public class Adventure {
	public static void main (String[] args)  {


		//system objects
		Scanner in = new Scanner (System.in);
		Random rand = new Random();

		//Game variables
		String[] enemies = { "Alien Guard", "Regular Alien"};
		int maxEnemyHealth = 100;
		int enemyAttackDamage = 25;

		//Player Variabeles
	    int maxPlayerHealth = 100;
		int playerHealth = 100;
		int playerAttackDamage = 50;
		int numPotions = 3; //starts with 3 potions
        int potionHealAmount = 30;
        int potionDropChance = 50; //percent

        boolean running = true; 
    
        System.out.println("Wake up...");
    	String str = "Poop";
		Player character = new Player (str,100, 100);
		System.out.println("Your name is " + str + "\n");
    	String input = in.nextLine();

        START:
        while(running) 
        {
        	System.out.println("-------------------------------------------");
        	System.out.println("------------------LEVEL 1------------------");
        	System.out.println("-------------------------------------------");
        	System.out.println("[Level 1 script goes here ...blah blah many lines. Lorem ipsum....]");
        	
        
        	System.out.println("Location: Bedroom");
        	System.out.println("What do you want to do now?");

        	input = in.nextLine();
            while (statusCheck(input)) 
            {
                status (input, character);
                input = in.nextLine();
            }

            System.out.println("-------------------------------------------");
            
            System.out.println(" # You have " + playerHealth + " HP left #");
            System.out.println("next level");
        	input = in.nextLine();
        	
        	if (input.equals("no")) running = false;
        	else if (input.equals("yes")) continue;
        	else System.out.println("ayyy");
        	
        	L2:
        	System.out.println("-------------------------------------------");
        	System.out.println("------------------LEVEL 2------------------");
        	System.out.println("-------------------------------------------");
        	System.out.println("[Level 2 script goes here ...blah blah many lines. Lorem ipsum....]");
        	
        	System.out.println("Location: Space Ship");
        	System.out.println("What do you want to do now?");

        	input = in.nextLine();
            while (statusCheck(input)) 
            {
                status (input, character);
                input = in.nextLine();
            }

            System.out.println("-------------------------------------------");
            
            System.out.println(" # You have " + playerHealth + " HP left #");
        	System.out.println("end?");
        	input = in.nextLine();
        	if(input.equals("yes"))
        		running = false;
        	if(input.equals("no"))
        		continue START;       		

        }
		              	
	}
	// Method explains what happens if the player types in "status" during any time in the game
		public static void status(String command, Player person)  {
			while (statusCheck(command)) {
				if (person.playerCurrentHP() > 0) {
					System.out.println("You currently have " + person.playerCurrentHP() + " HP.\n");
				}
				else {
					System.out.println("GAME OVER!");
					// Terminates the program [temporary for now]
					System.exit(0);
				}
			}
		}
		// Method checks to see if the player typed in "status"
		public static boolean statusCheck(String prompt) {
			if (prompt.equals("Status") || prompt.equals("status")) { return true; } 
			else { return false; }
		}
}


