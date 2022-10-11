package day4;

public class Task3 {
    public static void main(String[] args) {
        int[][] doubleArray = new int[12][8];
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < 8; j++) {
                doubleArray[i][j] = (int) (Math.random() * 50);
            }
        }
        int[] array = new int[doubleArray.length];
        for (int j = 0; j < doubleArray.length; j++) {
            for (int k = 0; k < 8; k++) array[j] += doubleArray[j][k];
        }

        int indexOfMax = 0;
        int tmp = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > tmp) {
                tmp = array[i];
                indexOfMax = i;
            }
        }
        System.out.println(indexOfMax);
    }
}
