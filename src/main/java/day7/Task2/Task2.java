package day7.Task2;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();
        Player.info();
        Player player6 = new Player();
        Player.info();
        System.out.println(player1.getStamina());
        player1.run();
        System.out.println(player1.getStamina());
        for (int i = player1.getStamina(); i > 0; i--) {
            player1.run();
        }
    }
}
