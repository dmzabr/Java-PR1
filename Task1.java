import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int[] numbers = new int[1000];
        for(int i = 0; i < 1000; i++)
        {
            numbers[i] = (i+1)*(i+1)*(i+1);
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите два числа");
        int first = sc.nextInt();
        int second = sc.nextInt();

        System.out.println(numbers[first-1] + "\n" + numbers[second-1]);

    }
}