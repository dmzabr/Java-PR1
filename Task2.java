import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n");
        int n = sc.nextInt();

        int numbers[] = new int[n];

        System.out.println("Введите числа");

        for(int i = 0; i < n; i++)
        {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Введите множитель");

        int mnoj = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            numbers[i] = numbers[i] * mnoj;
            System.out.println(numbers[i]);
        }
    }
}