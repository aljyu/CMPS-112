public class Player{
	//Player Variabeles
    private int maxPlayerHealth; // = 100;
    private String name;
	private int playerHealth; // = 100;
	private int playerAttackDamage; //= 50;
	private int numPotions; // = 3; //starts with 3 potions
    private int potionHealAmount; //= 30;
    private String[3] bag; //
    private int luck; //= 50 //percent

    // constructor for the player 
    public Player(String name, int health, int attackDamage, int potions, int heal, int luck){
    	this.name = name;
    	playerHealth = health;
        maxPlayerHealth = health;
    	playerAttackDamage = attackDamage;
    	numPotions = potions;
    	potionHealAmount = heal;
        bag = NULL;
    	this.luck = luck;
    }

    /* ------- Funtions for Game Advancement ------ */
   
    // get more helth after battleing a bunch
    public void levelUpHealth ( int newHealth){
    	playerHealth = newHealth;
    }

    // getter funtion for current health
    public int getCurrentHealth(){
        return playerHealth;
    }

    public int getPlayerAttackDamage(){
        return playerAttackDamage;
    }
    public int getPotionHealAmount(){
        return potionHealAmount;
    }

    // potionDropChance fucntion returns number of potions on hand
    public int getPotion(){
        return numPotions++;
    }

    public int getLuck(){
        return luck;
    }

    // get current number of potions
    public int getNumPotions() {
        return numPotions;
    }

    // funtion used for healing the player, when a potion is used.
    public void healPlayer() {
        if (numPotions <=0 ){  // do you have any potions?
            System.out.println(" You are out of potions! ");
            return;
        }
        numPotions --;
        if( (playerHealth += potionHealAmount) >= maxPlayerHealth ){ // if using a potion would make current HP > max HP
            playerHealth = maxPlayerHealth;                           // set current HP to max HP
        } else {
            playerHealth += potionHealAmount; // else just add the amount a potion would heal.
        }
    }

    // player getts attacked by a enemy
    public void getAttacked(int damage){
        playerHealth -= damage;
    }

    public String getPlayerName(){
        return name;
    }

}