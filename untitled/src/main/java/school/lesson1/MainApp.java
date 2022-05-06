package school.lesson1;


public class MainApp {
    public static void main(String[] args) {
        System.out.println("checkSumSign");
        int a = 3;
        int b = 4;
        System.out.println(a + b);
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}