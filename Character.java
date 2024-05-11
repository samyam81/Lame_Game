import java.util.Random;

public class Character{
    protected int health;
    protected String name;

    public Character(String name, int health) {
        this.health = health;
        this.name = name;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public void attack(Character target) {
        Random rand = new Random();
        int damage = rand.nextInt(10) + 1;
        target.takeDamage(damage);
        System.out.println(name + " attacked " + target.name + " and made " + damage + " damage");
    }
}
