package day12;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("BMW");
        list.add("LADA");
        list.add("Corvette");
        list.add("Toyota");
        list.add("Opel");

        System.out.println(list);

        list.add(2, "Ford");

        list.remove(0);

        System.out.println(list);
    }
}
