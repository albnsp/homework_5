import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        System.out.println("задание 7");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        int number = scanner.nextInt();

        int reversedNumber = reverseNumber(number);
        System.out.println("Перевернутое число: " + reversedNumber);
    }

    private static int reverseNumber(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }

        return reversedNumber;
    }
}
