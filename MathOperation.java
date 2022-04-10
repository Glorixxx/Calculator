public class MathOperation {

    static void add(double a, double b) {

        System.out.print("Результат сложения = ");
        System.out.println(a + b);
    }

    static void min(double a, double b) {
        System.out.print("Результат вычитания = ");
        System.out.println(a - b);
    }

    static void multiply(double a, double b) {
        System.out.print("Результат умножения = ");
        System.out.println(a * b);
    }

    static void division(double a, double b) {
        System.out.print("Результат деления = ");
        System.out.println(a / b);
    }
    static void degree(double a, double b) {
        System.out.println("Результат возведения в степень = ");
        System.out.println(Math.pow(a,b));
    }
}
