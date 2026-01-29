import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        System.out.println("""
Выберите арифметическую команду:
1) Сумма
2) Разность
3) Частное
4) Произведение
""");

        int d = scanner.nextInt();

        switch (d) {
            case 1:
                System.out.println("Сумма = " + (a + b));
                break;
            case 2:
                System.out.println("Разность = " + (a - b));
                break;
            case 3:
                if (b == 0) {
                    System.out.println("Ошибка: деление на ноль");
                } else {
                    System.out.println("Частное = " + (a / b));
                }
                break;
            case 4:
                System.out.println("Произведение = " + (a * b));
                break;
            default:
                System.out.println("Неверный выбор операции");
        }

        scanner.close();
    }
}
