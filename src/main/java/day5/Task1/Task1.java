package day5.Task1;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Blue");
        car.setModel("Ferrari");
        car.setYear(2021);
        System.out.println(car.getYear() + " " + car.getModel() + " " + car.getColor());
    }
}
