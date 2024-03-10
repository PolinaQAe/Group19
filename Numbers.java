import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        boolean result = number % 2 == 0;
        if (result) {
            System.out.println("четное");
        } else {
            System.out.println("Нечетное");

        }

    }
}
