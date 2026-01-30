import java.util.Scanner;

public class BigTask1_Hard {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
boolean programRunning = true;

        while (programRunning) {

int n;
            do {
                    System.out.print("Введите число N больше 0: ");
n = sc.nextInt();
            } while (n <= 0);

boolean analyzeRunning = true;
            while (analyzeRunning) {

        System.out.println("""
                        Выберите команду:
                        1 - Посчитать всё
                        2 - Только суммы
                        3 - Только количество
                        4 - Вывести чётные числа
                        5 - Вывести нечётные числа
                        """);
int command = sc.nextInt();
int sum = 0;
int evenCount = 0;
int oddCount = 0;
int evenSum = 0;
int oddSum = 0;

                for (int i = 1; i <= n; i++) {
sum += i;

                    if (i % 2 == 0) {
evenCount++;
evenSum += i;
                    } else {
oddCount++;
oddSum += i;
                    }
                            }

                            switch (command) {
        case 1 -> System.out.printf(
                                "Сумма всех чисел: %d%n" +
                                        "Количество чётных: %d%n" +
                                        "Количество нечётных: %d%n" +
                                        "Сумма чётных: %d%n" +
                                        "Сумма нечётных: %d%n",
                                sum, evenCount, oddCount, evenSum, oddSum
                                );
                    case 2 -> System.out.printf(
                                "Сумма всех чисел: %d%n" +
                                        "Сумма чётных: %d%n" +
                                        "Сумма нечётных: %d%n",
                                sum, evenSum, oddSum
                                );
                    case 3 ->  System.out.printf(
                                "Количество чётных: %d%n" +
                                        "Количество нечётных: %d%n",
                                evenCount, oddCount
                                );
                    case 4 -> {
                            System.out.print("Чётные числа: ");
                        for (int i = 1; i <= n; i++) {
        if (i % 2 == 0) System.out.print(i + " ");
                        }
                                System.out.println();
                    }
                            case 5 -> {
                            System.out.println("Нечётные числа: ");
                        for (int i = 1; i <= n; i++) {
        if (i % 2 != 0) System.out.print(i + " ");
                        }
                                System.out.println();
                    }
default -> System.out.println("Такой команды нет");
                }
                        System.out.println("""
                        Что дальше?
                        1 - Повторить анализ с тем же N
                        2 - Ввести новое N
                        0 - Выйти
                        """);

int choice = sc.nextInt();

                if (choice == 0) {
analyzeRunning = false;
programRunning = false;
        } else if (choice == 2) {
analyzeRunning = false;
        }


        }
        }


        sc.close();
        System.out.println("Программа завершена. Пока!");
        }
                }