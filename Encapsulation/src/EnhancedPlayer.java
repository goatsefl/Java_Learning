package Encapsulation.src;
import java.util.StringJoiner;


public class EnhancedPlayer {
    private String name;
    private int health;
    private String weapon;

    public EnhancedPlayer(String name) {
        this(name, 100,"Sword");
    }

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health  < 0 ){
            this.health = 1;
        }else if (health > 100){
            this.health = 100;
        }else {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println("Player is Knocked Out");
        }
    }

    public void restoreHealth(int extraHealth) {
        health += extraHealth;
        if (health > 100) {
            System.out.println("Player Health Restored to 100%");
            health = 100;
        }

    }


    @Override
    public String toString() {
        return new StringJoiner(", ", EnhancedPlayer.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("health=" + health)
                .add("weapon='" + weapon + "'")
                .toString();
    }

    public int healthRemaining() {
            if (health < 0) {
                health = 0;
                return  health;
            } else {
                return health;
            }

        }
    }
