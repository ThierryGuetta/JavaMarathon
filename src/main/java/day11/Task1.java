package day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse wh = new Warehouse();
        Courier courier = new Courier(wh);
        Picker picker = new Picker(wh);

        while(wh.countOrder < 1500){
            picker.doWork();
            picker.bonus();
            courier.doWork();
            courier.bonus();
        }

        System.out.println(wh);
        System.out.println(picker.getSalary() + " " + courier.getSalary());

        Warehouse wh2 = new Warehouse();
        Courier courier2 = new Courier(wh2);
        Picker picker2 = new Picker(wh2);
        courier2.doWork();
        picker2.doWork();

        System.out.println(wh2);
        System.out.println(picker2.getSalary() + " " + courier2.getSalary());
    }
}
