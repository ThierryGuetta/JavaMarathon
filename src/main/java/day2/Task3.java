package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        if (first >= second) System.out.println("Некорректный ввод");
        while (first + 1 < second) {
            if (first % 5 == 0 && first % 10 != 0) System.out.println(first);
            first++;
        }
    }
}