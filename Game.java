public class Game {
    private Player player;
    private Enemy enemy;

    public Game(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    public void play() {
        System.out.println("Let the battle begin");
        while (player.isAlive() && enemy.isAlive()) {
            player.attack(enemy);
            if (!enemy.isAlive()) {
                System.out.println("Enemy died");
                player.levelUp();
                break;
            }
            enemy.attack(player);
            if (!player.isAlive()) {
                System.out.println("Player is dead!");
                break;
            }
        }
    }
}