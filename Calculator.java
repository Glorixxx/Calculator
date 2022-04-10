import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Калькулятор 1.0");
        printMenu();

        Scanner scanner = new Scanner(System.in);
        MathOperation mathOperation = new MathOperation();

        byte command = scanner.nextByte();
        while (true) {

            if (command == 1) {
                System.out.println("Введите первое число для сложения:");
                double a = scanner.nextInt();
                System.out.println("Введите второе число для сложения:");
                double b = scanner.nextInt();
                mathOperation.add(a, b);
            } else if (command == 2) {
                System.out.println("Введите первое число для вычитания:");
                double a = scanner.nextInt();
                System.out.println("Введите второе число для вычитания:");
                double b = scanner.nextInt();
                mathOperation.min(a, b);
            } else if (command == 3) {
                System.out.println("Введите первое число для умножения:");
                double a = scanner.nextInt();
                System.out.println("Введите второе число для умножения:");
                double b = scanner.nextInt();
                mathOperation.multiply(a, b);
            } else if (command == 4) {
                System.out.println("Введите первое число для деление:");
                double a = scanner.nextInt();
                System.out.println("Введите второе число для деление:");
                double b = scanner.nextInt();
                mathOperation.division(a, b);
            } else if (command == 5 ) {
                System.out.println("Введите основание степени:");
                double a = scanner.nextInt();
                System.out.println("Введите показатель степени:");
                double b = scanner.nextInt();
                mathOperation.degree(a, b);
            } else {
                System.out.println("Вы ввели неверную команду, повторите действие");
            }
            printMenu();
            command = scanner.nextByte();
        }
    }

    static void printMenu() {
        System.out.println("Выберите какое действие вы хотите сделать:");
        System.out.println("1 - Сложение");
        System.out.println("2 - Вычитание");
        System.out.println("3 - Умножение");
        System.out.println("4 - Деление");
        System.out.println("5 - Возведение в степень");
    }

}
