package day9.Task1;

public class Student extends Human {
    private int classRoom;

    public Student(String name, int classRoom) {
        super(name);
        this.classRoom = classRoom;
    }

    public int getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(int classRoom) {
        this.classRoom = classRoom;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Это студент с именем " + getName());
    }
}
