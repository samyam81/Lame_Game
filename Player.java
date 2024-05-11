public class Player extends Character {
    private int experience;

    public Player(String name, int health, int experience) {
        super(name, health);
        this.experience = experience;
    }

    public void levelUp() {
        experience += 10;
        System.out.println(name + " leveled up! Current experience: " + experience);
    }
}