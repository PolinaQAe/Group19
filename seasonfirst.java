import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число месяца: ");
        int day = scanner.nextInt();


        switch (day) {
            case 1,2,12:
                System.out.println("Winter");
                break;
            case 3,4,5:
                System.out.println("Spring");
                break;
            case 6,7,8:
                System.out.println("Summer");
                break;
            case 9,10,11:
                System.out.println("Autumn");
                break;

        }

    }
}
