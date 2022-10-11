package day7.Task1;

public class Task1 {
    public static void main(String[] args) {
        Plane plane1 = new Plane("Boeing", 2019, 25, 100);
        Plane plane2 = new Plane("Boeing", 2019, 36, 100);
        Plane.compareAirplanes(plane1, plane2);
    }
}