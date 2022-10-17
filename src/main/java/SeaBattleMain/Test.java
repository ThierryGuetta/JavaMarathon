package SeaBattleMain;

public class Test {
    public static void main(String[] args) {
        Player player = new Player();
        player.setShipOnMap(new Ship(5,5,5,6));
        //player.setShipOnMap(new Ship(5,6));
        System.out.println(player.getBattlefield());
    }
}
