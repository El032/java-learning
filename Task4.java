import java.util.Scanner;

public class Task4 {

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        int result = max(a, b);
        System.out.println("Максимум = " + result);

        scanner.close();
    }
}