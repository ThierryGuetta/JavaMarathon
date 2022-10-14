package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append((int) (Math.random() * 100)).append(" ");
        }
        File file = new File("E:\\lessons\\JavaMarathon\\src\\main\\java\\day16\\text1.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println(sb);
        pw.close();

        Scanner scanner = new Scanner(file);
        String[] line = scanner.nextLine().split(" ");
        scanner.close();

        int[] array = new int[line.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(line[i]);
        }
        double[] array2 = new double[50];

        int index = 0;
        for (int i = 0; i < array.length; i += 20) {
            for (int j = i; j < i + 20; j++) {
                array2[index] += array[j];
            }
            array2[index] = array2[index] / 20;
            index++;
        }
        File file2 = new File("E:\\lessons\\JavaMarathon\\src\\main\\java\\day16\\text2.txt");

        PrintWriter fw2 = new PrintWriter(file2);

        for (double num : array2) {
            fw2.print(num + " ");
        }
        fw2.close();

        printResult(file2);
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        double sum = 0;
        String[] array = scanner.nextLine().split(" ");
        scanner.close();
        for (String e : array) {
            sum += Double.parseDouble(e);
        }
        System.out.println((int) sum);
    }
}
