package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String city = scanner.nextLine();
            if (city.equals("Stop")) break;
            switch (city) {
                case "������":
                case "������":
                case "�����������":
                    System.out.println("������");
                    break;
                case "���":
                case "�����":
                case "�����":
                    System.out.println("������");
                    break;
                case "���������":
                case "���������":
                case "������":
                    System.out.println("������");
                    break;
                case "������":
                case "������":
                case "ʸ���":
                    System.out.println("��������");
                    break;
                default:
                    System.out.println("����������� ������");
            }
        }
    }
}