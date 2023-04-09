import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        System.out.println("Введите десятки первого числа, единицы второго и сумму");

        Scanner sc = new Scanner(System.in);
        int des = sc.nextInt() * 10;
        int ed = sc.nextInt();
        int sum = sc.nextInt();

        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (des + i + j * 10 +ed == sum) {
                    count += 1;
                    System.out.println(des + i + " + " + j + ed + " = " + sum);
                }
            }
        }
        System.out.println("\n");
        if (count == 0) {
            System.out.println("Решений нет\n");
        }
    }
}