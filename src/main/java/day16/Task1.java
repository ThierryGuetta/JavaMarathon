package day16;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException{
        File file = new File("E:\\lessons\\JavaMarathon\\src\\main\\java\\day16\\text.txt");
        printResult(file);
    }

    public static void printResult(File file) throws IOException {
        Scanner scanner = new Scanner(file);
        int sum = 0;
        int length = 0;
        while (scanner.hasNextLine()) {
            String[] array = scanner.nextLine().split(" ");
            for (String num : array) {
                sum += Integer.parseInt(num);
                length++;
            }
        }
        System.out.println(sum / length);
    }
}
