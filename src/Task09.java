import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        System.out.println("задание 9");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество ярусов и высоту через пробел: ");
        int tiers = scanner.nextInt();
        int height_2 = scanner.nextInt();

        byte height = (byte) (height_2 * 2);

// Заполненный
        for (byte z = 0; z <= tiers; z++) {

            for (byte y = z; y < height_2 + z; y++) {

                for (byte x = (byte) (-height_2); x <= height + z; x++) {

                    if (x <= height_2 + y && x >= height_2 - y && z != tiers) {
                        System.out.print("<>");

                    } else if (x < height_2 + z - 1 && x > height_2 - z + 1
                            && z == tiers && y < height_2 + tiers - 1) {
                        System.out.print("<>");

                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.print("\n");
            }
        }

    }
}
