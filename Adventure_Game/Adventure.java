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
    	System.out.println("-------------------------------------------");
    	System.out.println("------------------LEVEL 1------------------");
    	System.out.println("-------------------------------------------");
    	System.out.println("[Level 1 script goes here ...blah blah many lines. Lorem ipsum....]");

        System.out.println("Wake up...");

        L1:
        while(running) 
        {
        	System.out.println("-------------------------------------------");
            
        	System.out.println("\033[1mLocation: Bedroom");
        	
            while(enemyHealth > 0)
            { 		//while the enemy is not dead fight it
            	System.out.println("\tYour HP: " + playerHealth);
            	System.out.println("\t" + enemy + "'s HP: " + enemyHealth + "\n");
            	System.out.println("What do you want to do?");
            	System.out.println("1. Attack");
            	System.out.println("2. Drink potion.");
            	System.out.println("3. Run!");

            	String input = in.nextLine();

            	//check command imput
            	if(input.equals("1"))
            	{ // attcking
            		int damageDealt = rand.nextInt(playerAttackDamage);
            		int damageTaken = rand.nextInt(enemyAttackDamage);

            		enemyHealth = enemyHealth - damageDealt;
            		playerHealth = playerHealth - damageTaken;

            		System.out.println("\t-> You attacked the " + enemy + " for " + damageDealt + " damage!");
            		System.out.println("\t-> The " + enemy + " attacked back!");
            		System.out.println("\t-> You take " + damageTaken + " damage.");

            		if (playerHealth < 1)
            		{
            			System.out.println("\t-> You have taken too much damage!");
            			break;
            		}

            	}
            	else if (input.equals("3"))
            	{
            		System.out.println("\t-> You try to run away from " + enemy + "!");
            		continue L1;

            	}
            	else
            	{
            		System.out.println("\t-> Pay attention! You're in a battle!");
            	}
            }

            if (playerHealth < 1)
            {
            	System.out.println("You limp out of the battle...");
            }

            System.out.println("-------------------------------------------");
            
            System.out.println(" # You have " + playerHealth + " HP left #");
            

        }

	}
}