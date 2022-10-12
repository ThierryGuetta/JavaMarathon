package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 10, 20, 30),
                new Triangle("Red", 10, 20, 15),
                new Rectangle("Red", 5, 10),
                new Rectangle("Orange", 40, 15),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Red", 5),
        };

        System.out.println(calculateRedArea(figures));
        System.out.println(calculateRedPerimeter(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double result = 0;
        for (Figure e : figures) {
            if (e.getColor().equals("Red")) result += e.perimeter();
        }
        return result;
    }

    public static double calculateRedArea(Figure[] figures) {
        double result = 0;
        for (Figure e : figures) {
            if (e.getColor().equals("Red")) result += e.area();
        }
        return result;
    }
}

