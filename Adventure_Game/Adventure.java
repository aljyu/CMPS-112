import java.util.Scanner;
import java.util.Random;


public class Adventure {

    /* ------------- Level 1 --------------- */
    public static String introLevel3 = "You find yourself in a long hallway.\n" +
            "There is a guard standing and seems like he is dozing off.\n" +
            "This room must be important for having a guard...\n";
   
	public static void main (String[] args)  {


		//system objects
		Scanner in = new Scanner (System.in);
		Random rand = new Random();

        // Level Booleans ( used for advancement of the game )
        boolean finish_level_1 = true;
        boolean finish_level_2 = true;
        boolean finish_level_3 = true; // set to false when you want to advance to next level

		//Game variables
		String[] enemies = { "Skeleton", "Zombie", "Rat", "Assasin"};
		String[] adj = {"Angry", "Bloody", "Rotting", "Old", "Decrepid", "Vicious", "Ugly"};
		int maxEnemyHealth = 100;
		int enemyAttackDamage = 25;

        System.out.println("Hello, what is your name?");
        String name = in.nextLine();

        Player player1 = new Player(name, 100, 50, 3, 30, 25);

        boolean running = true; // game is currently running

        System.out.println("Welcome to the Dungeon "  + player1.getPlayerName() + "!");
/* -------- OUTER GAME LOOP -------*/
        GAME:
        while(running) {
        	System.out.println("-------------------------------------------");
            System.out.println("----------- LEVEL 1: Abduction ------------");

            LEVEL3:   /* -------- Level 3 start ------- */ 
            while (finish_level_3) {
                System.out.println(introLevel3);
                System.out.println("What do you want to do?");
                System.out.println("1. Panic!");
                System.out.println("2. Search.");
                System.out.println("3. Wait for the doors to open and sneak inside.");

                // wait for command
                String command = in.nextLine();

                // result of pressing 1.
                if(command.equals("1")) { 
                    System.out.println( "-> You scream as loud as you can hoping this is somehow a dream you can wake up from" );
                    System.out.println( "-> You pass out from screaming your head off." );
                    System.out.println("Uppon awaking you find yourself back in your prison cell,");
                    System.out.println("with all of your belongings repossessed. ");
                    System.out.println("\n-------------------------------------------\n");
                    // go back a level maybe
                    continue GAME;

                } else if (command.equals("2")) {
                    System.out.println("Good idea. You need to find a way to defend yourself!");
                    System.out.println("You see three rooms. Which do you want to search for weapons?");
                    System.out.println("1. Laboratory.");
                    System.out.println("2. Break Room.");
                    System.out.println("3. Fauyer.");

                    command = in.nextLine();
                    if(command.equals("1")) { 
                        System.out.println("You carufully open the door and walk in...");
                        System.out.println("The place is deserted. You begin to look for a weapon.");
                        System.out.println("All you find is:\n");

                        System.out.println("1. Test Tubes.");
                        System.out.println("2. Gauze.");
                        System.out.println("3. Acid.");
                        System.out.println("4. Nothing.");

                        System.out.println("Do you want to pick any of them up? ");

                        command = in.nextLine();  // prompt user for command 

                        if(command.equals("1") || command.equals("Test Tubes")) {
                            // nothing benificial happens to player?
                            // add Test Tubes to their items

                        } else if(command.equals("2") || command.equals("Gauze")) {
                            // add code for potion++
                        } else if(command.equals("3") || command.equals("Acid")) {
                            // add code for playerAttack++
                        } else {
                            continue GAME; // you dont do antying go back to begining of level 3
                        }



                    }
        

                }

            }




            int enemyHealth = rand.nextInt(maxEnemyHealth);
            String enemy = adj[rand.nextInt(adj.length)] + " " +enemies[rand.nextInt(enemies.length)];
            System.out.println("\t# An " + enemy + " has appeared! #\n");

            while(enemyHealth > 0){ 		//while the enemy is not dead fight it
            	System.out.println("\tYour HP: " + player1.getCurrentHealth());
            	System.out.println("\t" + enemy + "'s HP: " + enemyHealth + "\n");
            	System.out.println("What do you want to do?");
            	System.out.println("1. Attack");
            	System.out.println("2. Drink potion.");
            	System.out.println("3. Run!");

            	String input = in.nextLine();

            	//check command imput
            	if(input.equals("1")){ // attcking
            		int damageDealt = rand.nextInt(player1.getPlayerAttackDamage());
            		int damageTaken = rand.nextInt(enemyAttackDamage);

            		enemyHealth = enemyHealth - damageDealt;
            		player1.getAttacked(damageTaken);

            		System.out.println("\t-> You attacked the " + enemy + " for " + damageDealt + " damage!");
            		System.out.println("\t-> The " + enemy + " attacked back!");
            		System.out.println("\t-> You take " + damageTaken + " damage.");

            		if (player1.getCurrentHealth() < 1){
            			System.out.println("\t-> You have taken too much damage!");
            			break;
            		}

            	} else if (input.equals("2")){
            		int damageTaken = rand.nextInt(enemyAttackDamage);

            		player1.getAttacked(damageTaken);

	            	System.out.println("\t-> The " + enemy + " attacked!");
            		System.out.println("\t-> You take " + damageTaken + " damage.");

            		if (player1.getNumPotions() > 0) {
            			player1.healPlayer();
	            		System.out.println("\t-> You used a potion! " + "+" + player1.getPotionHealAmount() + " HP." );
	            		System.out.println("\t-> Current HP: " + player1.getCurrentHealth());
	            		System.out.println("\t-> You now have " + player1.getNumPotions() + " left.");
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

            if (player1.getCurrentHealth() < 1){
            	System.out.println("You limp out of the battle...");
            }

            System.out.println("-------------------------------------------");
            System.out.println(" # " + enemy + " was defeted! #");
            System.out.println(" # You have " + player1.getCurrentHealth() + " HP left #");
            if(rand.nextInt(100) < player1.getLuck()){
            	System.out.println(" # The " + enemy + " dropped a Potion. #");
            	System.out.println(" # You now have " + player1.getPotion() + " potion(s). #");
            }
        }
	}
}