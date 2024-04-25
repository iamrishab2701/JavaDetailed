package basics3.Encapsulation;

public class EnhancedPlayer {

    private String fullName;
    private int healthPercentage;
    private String weaponType;

    public EnhancedPlayer(String fullName) {
        this(fullName, 100, "Sword");
    }

    public EnhancedPlayer(String fullName, int healthPercentage, String weaponType) {
        this.fullName = fullName;
        if (healthPercentage < 0) {
            this.healthPercentage = 1;
        } else if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = healthPercentage;
        }
        this.weaponType = weaponType;
    }

    public void loseHealth(int damage) {
        healthPercentage = healthPercentage - damage;
        if (healthPercentage <= 0) {
            System.out.println("Player knocked out of game");
        }
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth) {
        healthPercentage = healthPercentage + extraHealth;
        if (healthPercentage > 100) {
            System.out.println("Player restored to 100%");
        }
        healthPercentage = healthPercentage + extraHealth;
        healthPercentage = 100;
    }
}
