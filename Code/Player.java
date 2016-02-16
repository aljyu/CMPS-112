public class Player{
    // Player Variables
//    private String name;
    public static int maxHealth;
    public static int currentHealth;
    public static int attackDamage;
    public static int numPotions;
    public static int potionHealAmount;

    // Player's constructor
    public Player (/*String name, */ int maxHP, int currentHP, int damage, int potion, int heal) {
//        name = this.name;
        maxHealth = maxHP;
        currentHealth = currentHP;
        attackDamage = damage;
        numPotions = potion;
        potionHealAmount = heal;
    }

    // Method to view the player's max HP
    public static int playerMaxHP() {
        return maxHealth;
    }
    // Method to view the player's current HP
    public static int playerCurrentHP() {
        return currentHealth;
    }
    // Method to view the player's current number of potions
    public static int playerCurrentPotions() {
        return numPotions;
    }
	
	// Method to state what happens every time the player makes a move
	public static int move() {
		return (currentHealth - 5);
	}
	
	// Method to state what happens when the player gets hit (by the boss)
	public static int hit() {
		return (currentHealth - 10);
	}
}