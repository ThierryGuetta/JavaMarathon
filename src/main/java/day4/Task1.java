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
        System.out.println("������� ����� " + array.length + ". " +
                "������������ ��������� ������: " + Arrays.toString(array));

        System.out.println("���������� � �������:" + "\n"
                + "����� �������: " + array.length + "\n"
                + "���������� ����� ������ 8: " + numsMore8 + "\n"
                + "���������� ����� ������ 1: " + num1 + "\n" +
                "���������� ������ �����: " + evenNumbers + "\n"
                + "���������� �������� �����: " + oddNumbers + "\n"
                + "����� ���� ��������� �������: " + sum);
    }
}
