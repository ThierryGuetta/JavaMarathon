package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Ivan", 11);
        Teacher teacher = new Teacher("Victoria", "English");

        System.out.println(student.getClassRoom());
        System.out.println(teacher.getSubject());

        student.printInfo();
        teacher.printInfo();
    }
}
