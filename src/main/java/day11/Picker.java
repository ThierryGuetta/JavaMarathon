package day11;

public class Picker implements Worker{

    private int salary;
    private Warehouse wh;

    public Picker(Warehouse wh) {
        this.wh = wh;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        this.salary += 80;
        wh.countOrder++;
    }

    @Override
    public void bonus() {
        if(wh.countOrder % 1500 == 0) salary *= 3;
    }
}
