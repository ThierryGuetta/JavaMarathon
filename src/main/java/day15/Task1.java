package day15;

import java.io.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        File input = new File("E:\\lessons\\JavaMarathon\\src\\main\\resources\\shoes.csv");
        Scanner scanner = new Scanner(input);

        File output = new File("C:\\Users\\Андрей\\Desktop\\text.txt");
        PrintWriter pw = new PrintWriter(output);

        while (scanner.hasNextLine()) {
            String[] array = scanner.nextLine().split(";");
            if (Integer.parseInt(array[2]) == 0) {
                pw.println(array[0] + " " + array[1] + " " + array[2]);
            }
        }
        pw.close();
        scanner.close();
    }
}
