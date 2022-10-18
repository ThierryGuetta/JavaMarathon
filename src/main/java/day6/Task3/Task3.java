package day6.Task3;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Светлана", "химия");
        Student student = new Student("Иван");
        teacher.evaluate(student);
    }
}
