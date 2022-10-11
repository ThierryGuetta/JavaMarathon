package day7.Task2;

public class Player {
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private int stamina;
    private static int countPlayers;

    public int getStamina() {
        return stamina;
    }

    public Player() {
        this.stamina = (int) (90 + Math.random() * 11);
        if (countPlayers < 7) countPlayers++;
    }

    public static void info() {
        if (countPlayers < 6) System.out.println("������� ��������. �� ���� ��� ���� "
                + (6 - countPlayers) + " ��������� ����");
        else System.out.println("�� ���� ��� ��������� ����");
    }

    public void run() {
        --this.stamina;
        if (this.stamina == MIN_STAMINA) {
            System.out.println("����� ����� � ���� � ����");
            System.out.println("�� ���� ��������: " + (--countPlayers) + " �������");
        }
    }
}
