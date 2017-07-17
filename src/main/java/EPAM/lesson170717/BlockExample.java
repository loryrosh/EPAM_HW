package EPAM.lesson170717;

public class BlockExample {
    public static void main(String[] args) {
        final int y = 0;

        {
            final int x = 10;
            {
                final int z = 10;
            }
            //System.out.println(z); // переменная z доступна только внутри блока
        }
    }
}
