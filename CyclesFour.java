public class CyclesFour {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 10; i <= 20; i++) {
            sum = i * i;

            {
                System.out.println( sum);
                System.out.println();
            }
        }
    }
}