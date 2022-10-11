package day6.Task3;

public class Teacher {
    private String name;
    private String object;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public Teacher(String name, String object) {
        this.name = name;
        this.object = object;
    }

    public void evaluate(Student student) {
        int point = (int) (2 + Math.random() * 4);
        String mark = "";
        switch (point) {
            case 2:
                mark = "�������������������";
                break;
            case 3:
                mark = "�����������������";
                break;
            case 4:
                mark = "������";
                break;
            case 5:
                mark = "�������";
        }
        System.out.println("������������� " + this.name + " ������ �������� � ������ "
                + student.getName() + " �� �������� " + this.object + " �� ������ " + mark + ".");
    }
}
