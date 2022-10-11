package day7.Task1;

public class Plane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Plane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info() {
        System.out.println("������������: " + producer + ", " + "��� �������: " + year + ", "
                + "�����: " + length + ", " + "���: " + weight + ", "
                + "���������� ������� � ����: " + fuel);
    }

    public void fillUp(int fuel) {
        this.fuel += fuel;
    }

    public static void compareAirplanes(Plane plane1, Plane plane2) {
        if (plane1.length == plane2.length) System.out.println("�������� �����");
        String s = plane1.length > plane2.length ? "������ ������� ������� �������" : "������ ������� ������� �������";
        System.out.println(s);
    }
}
