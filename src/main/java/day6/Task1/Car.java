package day6.Task1;

public class Car {
    private int year;
    private String model;

    public Car(int year, String model, String color) {
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int year) {
        return year - this.year;
    }
}
