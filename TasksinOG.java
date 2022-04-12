import java.util.Scanner;

public class TasksinOG {
    public static void main(String[] args) {
        byte amax = 0;
        Scanner scanner = new Scanner(System.in);
        byte n;
        n = scanner.nextByte();
        for (int i = 0; i < n; i++) {
           byte a;
            a = scanner.nextByte();
            if (a % 5 == 0 && a > amax) {
                amax = a;
            }
        }
        System.out.println(amax);
    }
}