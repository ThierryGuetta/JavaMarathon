package day6.Task3;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Татьяна Петровна", "Химия");
        Student student = new Student("Иван");
        teacher.evaluate(student);
    }
}
