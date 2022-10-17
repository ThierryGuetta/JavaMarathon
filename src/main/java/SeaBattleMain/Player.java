package SeaBattleMain;

public class Player {
    private Battlefield battlefield = new Battlefield();
    private Ship ship;

    public Battlefield getBattlefield() {
        return battlefield;
    }

    public void setShipOnMap(Ship ship) {
        char[][] newMap = battlefield.getMap();

        if (battlefield.getMap()[ship.getX()][ship.getY()] != '~') {
            System.out.println("—юда ставить корабль нельз€");
            return;
        }
        newMap[ship.getX()][ship.getY()] = ship.getSymbolOfShip();
        battlefield.setMap(newMap);
        newMap[ship.getX1()][ship.getY1()] = ship.getSymbolOfShip();
        battlefield.setMap(newMap);
        newMap[ship.getX2()][ship.getY2()] = ship.getSymbolOfShip();
        battlefield.setMap(newMap);
        newMap[ship.getX3()][ship.getY3()] = ship.getSymbolOfShip();
        battlefield.setMap(newMap);

    }
}
//    public void setShipOreol(Ship ship){
//        newMap[ship.getX() - 1][ship.getY()] = ship.getSymbolOfOreol();
//        newMap[ship.getX() - 1][ship.getY() - 1] = ship.getSymbolOfOreol();
//        newMap[ship.getX() - 1][ship.getY() + 1] = ship.getSymbolOfOreol();
//
//        newMap[ship.getX()][ship.getY() - 1] = ship.getSymbolOfOreol();
//        newMap[ship.getX()][ship.getY() + 1] = ship.getSymbolOfOreol();
//
//        newMap[ship.getX() + 1][ship.getY()] = ship.getSymbolOfOreol();
//        newMap[ship.getX() + 1][ship.getY() - 1] = ship.getSymbolOfOreol();
//        newMap[ship.getX() + 1][ship.getY() + 1] = ship.getSymbolOfOreol();
//    }

