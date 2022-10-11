package day6.Task2;

public class Task2 {
    public static void main(String[] args) {
        Plane plane = new Plane("Boeing", 2019, 25, 100);
        plane.setLength(30);
        plane.setYear(2020);
        plane.fillUp(100);
        plane.fillUp(150);
        plane.info();
    }
}
