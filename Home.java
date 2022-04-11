import java.util.Scanner;

public class Home {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        a = scanner.nextByte();
        b = scanner.nextByte();
        c = scanner.nextByte();
        int sum = 1;
        if (a < 0) {
            sum = (a + b + c);
        } else if (a > 0){
            sum =(a * b * c);
        }
        System.out.println(sum);
    }
}