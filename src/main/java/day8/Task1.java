package day8;


public class Task1 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }
        System.out.println("1 StringBuilder Time: " + (System.currentTimeMillis() - time));

        long time2 = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i <= 20000; i++) {
            result += i + " ";
        }
        System.out.println("2 String Time: " + (System.currentTimeMillis() - time2));
    }
}
