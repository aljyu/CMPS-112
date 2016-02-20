public class Player{
	//Player Variabeles
    private int maxPlayerHealth; // = 100;
    private String name;
	private int playerHealth; // = 100;
	private int playerAttackDamage; //= 50;
	private int numPotions; // = 3; //starts with 3 potions
    private int potionHealAmount; //= 30;
    private int potionDropChance; //= 50 //percent

    // constructor for the player 
    public Player(String name, int health, int attackDamage){
    	name = this.name;
    	playerHealth = maxPlayerHealth = health;
    	playerAttackDamage = attackDamage;
    	//numPotions = potions;
    	//potionHealAmount = heal;
    	//potionDropChance = luck;
    }

    /* ------- Funtions for Game Advancement ------ */
   
    // get more helth after battleing a bunch
    public void levelUpHealth ( int newHealth){
    	playerHealth = newHealth;
    }

	public int playerCurrentHP() {
		
		return playerHealth;
	}

}