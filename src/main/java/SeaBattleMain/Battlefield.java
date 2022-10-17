package SeaBattleMain;

import java.util.Arrays;

public class Battlefield {

    private char[][] map = new char[10][10];

    {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = '~';
            }
        }
    }

    public char[][] getMap() {
        return map;
    }

    public void setMap(char[][] map) {
        this.map = map;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (char[] chars : map) {
            sb.append(Arrays.toString(chars)).append("\n");
        }
        return sb.toString();
    }
}
