package day4;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
        int max = array[0];
        int min = array[0];
        int multipleOf10 = 0;
        int sumMultipleOf10 = 0;

        for (int e : array) {
            if (e > max) max = e;
            if (e < min) min = e;
            if (e % 10 == 0) {
                multipleOf10++;
                sumMultipleOf10 += e;
            }
        }
        System.out.println(max + "\n" + min + "\n" + multipleOf10 + "\n" + sumMultipleOf10);
    }
}
