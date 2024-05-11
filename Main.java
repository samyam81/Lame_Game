
public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Hero", 50, 0);
        Enemy enemy1 = new Enemy("Evil Monster", 30);
        Game game1 = new Game(player1, enemy1);
        try {
            game1.play();
        } catch (Exception e) {
            System.out.println("Something went wrong");
            System.out.println(e);
        }
    }
}
