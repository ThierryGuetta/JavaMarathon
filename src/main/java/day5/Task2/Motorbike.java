package day5.Task2;

public class Motorbike {
    private int year;
    private String model;
    private String color;

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Motorbike(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }
}
//2. Создать класс Мотоцикл (англ. Motorbike), с полями “Год выпуска”, “Цвет”,
//“Модель”. Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не
//использовать). Придерживаться принципов инкапсуляции и использовать ключевое
//слово this. Геттером получить год выпуска, цвет, модель, вывести значения в
//консоль.