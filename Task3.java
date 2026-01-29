import java.util.Scanner;

public class Task3 {

    public  static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (isEven(number)) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }

        scanner.close();
    }
}