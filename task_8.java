import java.util.Scanner;

public class task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое положительное число n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Ошибка: введите положительное число.");
            return;
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("Сумма нечетных чисел от 1 до " + n + " равна: " + sum);
    }
}