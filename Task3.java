import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        while(true)
        {
            System.out.println("""
                    1 - умножение
                    2 - деление
                    3 - сложение
                    4 - вычитание""");

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Введите два множителч");

                    int first = sc.nextInt();
                    int second = sc.nextInt();

                    System.out.println(first * second);
                    break;

                case 2:
                    System.out.println("Введите делимое и делитель");

                    first = sc.nextInt();
                    second = sc.nextInt();

                    System.out.println(first / second);
                    break;

                case 3:
                    System.out.println("Введите два слагаемых");

                    first = sc.nextInt();
                    second = sc.nextInt();

                    System.out.println(first+second);
                    break;

                case 4:
                    System.out.println("Введите уменьшаемое и вычитаемое");

                    first = sc.nextInt();
                    second = sc.nextInt();

                    System.out.println(first-second);
                    break;

            }
        }
    }
}