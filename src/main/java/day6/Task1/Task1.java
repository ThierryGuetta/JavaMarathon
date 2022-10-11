package day6.Task1;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car(2022, "Ferrari", "Yellow");
        Motorbike motorbike = new Motorbike(2022, "BMW", "Black");
        car.info();
        motorbike.info();
        System.out.println(car.yearDifference(2026));
        System.out.println(motorbike.yearDifference(2078));
    }
}
