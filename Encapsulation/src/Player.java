package Encapsulation.src;

public class Player {

    public String name;
    public int health;
    public String weapon;

/*    public Player(String name, int health, String weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }*/

    public void losehealth(int damage) {
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

    public int healthRemaining() {
        if (health < 0) {
            health = 0;
            return  health;
        } else {
            return health;
        }

    }
}