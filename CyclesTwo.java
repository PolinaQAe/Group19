public class Cy {
    public static void main(String[] args) {
        int i = 1;
        int number = 9;
        int sum = 0;
        while (i <= number) {
            sum += i;
            i++;
        }
        System.out.println("Сумма чисел от 1 до " + number + " равна " + sum);
    }
}
