import java.util.Scanner;
import java.util.Random;

public class Adventure {
	public static void main (String[] args)  {


		//system objects
		Scanner in = new Scanner (System.in);
		Random rand = new Random();

		//Game variables
		String[] enemies = { "Skeleton", "Zombie", "Rat", "Assasin"};
		String[] adj = {"Angry", "Bloody", "Rotting", "Old", "Decrepid", "Vicious", "Ugly"};
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

        System.out.println("Welcome to the Dungeon!");

        GAME:
        while(running) {
        	System.out.println("-------------------------------------------");
            
            int enemyHealth = rand.nextInt(maxEnemyHealth);
            String enemy = adj[rand.nextInt(adj.length)] + " " +enemies[rand.nextInt(enemies.length)];
            System.out.println("\t# An " + enemy + " has appeared! #\n");

            while(enemyHealth > 0){ 		//while the enemy is not dead fight it
            	System.out.println("\tYour HP: " + playerHealth);
            	System.out.println("\t" + enemy + "'s HP: " + enemyHealth + "\n");
            	System.out.println("What do you want to do?");
            	System.out.println("1. Attack");
            	System.out.println("2. Drink potion.");
            	System.out.println("3. Run!");

            	String input = in.nextLine();

            	//check command imput
            	if(input.equals("1")){ // attcking
            		int damageDealt = rand.nextInt(playerAttackDamage);
            		int damageTaken = rand.nextInt(enemyAttackDamage);

            		enemyHealth = enemyHealth - damageDealt;
            		playerHealth = playerHealth - damageTaken;

            		System.out.println("\t-> You attacked the " + enemy + " for " + damageDealt + " damage!");
            		System.out.println("\t-> The " + enemy + " attacked back!");
            		System.out.println("\t-> You take " + damageTaken + " damage.");

            		if (playerHealth < 1){
            			System.out.println("\t-> You have taken too much damage!");
            			break;
            		}

            	} else if (input.equals("2")){
            		int damageTaken = rand.nextInt(enemyAttackDamage);

            		playerHealth = playerHealth - damageTaken;

	            	System.out.println("\t-> The " + enemy + " attacked!");
            		System.out.println("\t-> You take " + damageTaken + " damage.");

            		if (numPotions > 0) {
            			if ( playerHealth + potionHealAmount >= maxPlayerHealth){
            				playerHealth = maxPlayerHealth;
            			} else {
	            			playerHealth = playerHealth + potionHealAmount;
	            			numPotions --;
	            			System.out.println("\t-> You used a potion! " + "+" + potionHealAmount + " HP." );
	            			System.out.println("\t-> Current HP: " + playerHealth);
	            			System.out.println("\t-> You now have " + numPotions + " left.");
	            		}
	            	} else {
	            		System.out.println("\t-> Out of potions.");
	            	}

            	} else if (input.equals("3")){
            		System.out.println("\t-> You try to run away from " + enemy + "!");
            		continue GAME;

            	} else{
            		System.out.println("\t-> Pay attention! You're in a battle!");
            	}
            }

            if (playerHealth < 1){
            	System.out.println("You limp out of the battle...");
            }

            System.out.println("-------------------------------------------");
            System.out.println(" # " + enemy + " was defeted! #");
            System.out.println(" # You have " + playerHealth + " HP left #");
            if(rand.nextInt(100) < potionDropChance){
            	numPotions++;
            	System.out.println(" # The " + enemy + " dropped a Potion. #");
            	System.out.println(" # You now have " + numPotions + " potion(s). #");
            }

        }

	}
}