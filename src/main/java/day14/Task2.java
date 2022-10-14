package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("E:\\lessons\\JavaMarathon\\src\\main\\java\\day14\\people.txt");
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> peoples = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] lines = line.split(" ");
                if (0 > Integer.parseInt(lines[1])) throw new IllegalAccessException();
                peoples.add(line);
            }
            scanner.close();
            return peoples;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalAccessException e){
            System.out.println("Некорректный файл");
        }
        return null;
    }
}
