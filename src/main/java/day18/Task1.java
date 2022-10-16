package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {-402, -50, -249, -15, -665, -311};
        int i = 0;
        System.out.println(recursionSum(numbers, i));
    }

    public static int recursionSum(int[] number, int i) {
        if ( i == number.length) return 0;

        return number[i] += recursionSum(number, i + 1);
    }
}
