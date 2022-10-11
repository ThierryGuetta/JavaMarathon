package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
        int index = 0;
        int maxSum = 0;

        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) { //[1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254]
                sum += array[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                index = i;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(maxSum + " " + index);
    }
}

