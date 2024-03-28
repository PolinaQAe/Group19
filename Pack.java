package Pack;

public class Pack {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число цвета- от 1 до 7: ");
        int color = scanner.nextInt();

        if (color == 1) 
        {
            System.out.println("Красный");
        }
        else if (color == 2)
        {
            System.out.println("Оранжевый");
        }
         else if (color == 3) {
            System.out.println("Желтый");
        }
         else if (color == 4) {
            System.out.println("Зеленый");
        }
         else if (color == 5) {
            System.out.println("Голубой");
        }
        else if (color == 6) {
            System.out.println("Синий");
        } else {
            System.out.println("Фиолетовый");
        }
    }
}
