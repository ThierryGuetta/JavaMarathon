package day11;

public class Courier implements Worker {

    private int salary;
    private Warehouse wh;

    public Courier(Warehouse wh) {
        this.wh = wh;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        this.salary += 100;
        wh.balance += 1000;
    }

    @Override
    public void bonus() {
        if (wh.balance % 1000000 == 0) salary = salary * 2;
    }
}
