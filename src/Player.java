public class Player
{
	//Player Variables
    private int maxPlayerHealth; // = 100;
    private String name;
	private int playerHealth; // = 100;
	private int playerAttackDamage; //= 50;
	private int numPotions; // = 3; //starts with 3 potions
    private int potionHealAmount; //= 30;
    private int potionDropChance; //= 50 //percent

    // constructor for the player 
    public Player(/*String name,*/ int health, int attackDamage, int potions, int heal, int luck)
    {
//    	name = this.name;
    	maxPlayerHealth  = health;
    	playerHealth= health;
    	playerAttackDamage = attackDamage;
    	numPotions = potions;
    	potionHealAmount = heal;
    	potionDropChance = luck;
    }

    /* ------- Functions for Game Advancement ------ */
   
    // get more health after battling a bunch
    public void levelUpHealth ( int newHealth)
    {
    	playerHealth = newHealth;
    }
    
    // sets initial player health to 1000
	public int playerCurrentHP() {
		maxPlayerHealth = playerHealth = 10000;
		return 0;
	}
	// when called, displays the potions held 
	public String playerCurrentPotions() {
		numPotions = 0;
		return null;
	}

}