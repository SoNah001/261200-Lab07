public class Character {
    private int health;
    private int stamina;
    private final int maxHealth;
    private final int maxStamina;

    //Constructor
    public Character(int health, int stamina) {
        this.health = health;
        this.stamina = stamina;
        this.maxHealth = health;
        this.maxStamina = stamina;
        System.out.println("Character created with " + this.health + " health and " + this.health + " stamina.");
    }

    //Getter
    public void getStatus() {
        System.out.println("Character's health: " + this.health + ", stamina: " + this.stamina + ".");
    }

    //Method
    public void swingSword(){
        if(this.stamina <= 0){
            System.out.println("Your character needs to cool down.");
            this.stamina = 0;
        }
        else{
            this.stamina = this.stamina - 10;
            System.out.println("Character swings the sword. Stamina is now " + this.stamina + ".");
            if(this.stamina <= 0){
                System.out.println("Your character needs to cool down.");
                this.stamina = 0;
            }
        }
    }
    public void takeDamage(int damageAmount){
        if(health <= 0){
            System.out.println("Character is dead.");
            this.health = 0;
        }
        else{
            this.health = this.health - damageAmount;
            System.out.println("Character takes " + damageAmount + " damage. " + "Health is now " + this.health + ".");
            if(health <= 0){
                System.out.println("Character is dead.");
                this.health = 0;
            }
        }
    }
    public void rest(){
        this.health = this.maxHealth;
        this.stamina = this.maxStamina;
        System.out.println("Character has rested. Health and stamina restored to maximum.");
    }
}
