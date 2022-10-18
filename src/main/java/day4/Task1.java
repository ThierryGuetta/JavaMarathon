package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int numsMore8 = 0;
        int num1 = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);

            sum += array[i];
            if (array[i] > 8) numsMore8++;
            if (array[i] == 1) num1++;
            if (array[i] % 2 == 0) evenNumbers++;
            else oddNumbers++;

        }
        System.out.println("Длина массива: " + array.length + ". " +
                "Сгенерирован следующий массив: " + Arrays.toString(array));

        System.out.println("Информация о массиве:" + "\n"
                + "Длина массива: " + array.length + "\n"
                + "Количество чисел больше 8: " + numsMore8 + "\n"
                + "Количество чисел равных 1: " + num1 + "\n" +
                "Количество четных чисел: " + evenNumbers + "\n"
                + "Количество нечетных чисел: " + oddNumbers + "\n"
                + "Сумма всех элементов массива: " + sum);
    }
}
