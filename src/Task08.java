import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        System.out.println("задание 8");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        int count = 0; // счетчик цифр
        int sum = 0; // сумма цифр

// Проверяем каждую цифру числа
        while (number != 0) {
            int digit = number % 10; // получаем последнюю цифру
            count++; // увеличиваем счетчик цифр
            sum += digit; // добавляем цифру к сумме
            number /= 10; // удаляем последнюю цифру
        }

        System.out.println("Количество цифр: " + count);
        System.out.println("Сумма цифр: " + sum);

    }
}
