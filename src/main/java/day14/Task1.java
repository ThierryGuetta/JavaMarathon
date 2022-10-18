package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("E:\\lessons\\JavaMarathon\\src\\main\\java\\day14\\text.txt");
        printSumDigits(file);

    }

    public static void printSumDigits(File file) {
        int sum = 0;
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] nums = line.split(" ");
            if (nums.length != 10) throw new IllegalAccessException();
            for (String num : nums) {
                sum += Integer.parseInt(num);
            }
            scanner.close();
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalAccessException e) {
            System.out.println("Некорректный файл");
        }
    }
}
