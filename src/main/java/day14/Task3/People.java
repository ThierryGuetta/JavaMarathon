package day14.Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static List<People> parseFileToObjList() {
        List<People> peoples = new ArrayList<>();
        File file = new File("E:\\lessons\\JavaMarathon\\src\\main\\java\\day14\\people.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] lines = line.split(" ");
                if (Integer.parseInt(lines[1]) < 0) throw new IllegalArgumentException();
                peoples.add(new People(lines[0], Integer.parseInt(lines[1])));
            }
            return peoples;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный файл");
        }
        return null;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}