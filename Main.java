import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // Математические операции

        Operation add = (a, b) -> a + b;

        Operation subtract = (a, b) -> a - b;

        Operation multiply = (a, b) -> a * b;

        Operation divide = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Деление на ноль");
            }

            return a / b;
        };

        double a = 12;
        double b = 4;

        System.out.println("Сложение: " + add.apply(a, b));
        System.out.println("Вычитание: " + subtract.apply(a, b));
        System.out.println("Умножение: " + multiply.apply(a, b));
        System.out.println("Деление: " + divide.apply(a, b));


        // Работа с коллекциями

        List<Integer> numbers = Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        );

        List<Integer> result = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .collect(Collectors.toList());

        System.out.println("\nЧётные числа, умноженные на 2: "
                + result);


        // Работа со строками

        String input = " Hello, World! ";

        StringOperation upperCase =
                str -> str.toUpperCase();

        StringOperation lowerCase =
                str -> str.toLowerCase();

        StringOperation trim =
                str -> str.trim();

        StringOperation reverse =
                str -> new StringBuilder(str)
                        .reverse()
                        .toString();

        System.out.println("\nИсходная строка: [" + input + "]");

        System.out.println("Верхний регистр: ["
                + StringProcessor.processString(input, upperCase) + "]");

        System.out.println("Нижний регистр: ["
                + StringProcessor.processString(input, lowerCase) + "]");

        System.out.println("Удаление пробелов: ["
                + StringProcessor.processString(input, trim) + "]");

        System.out.println("Строка наоборот: ["
                + StringProcessor.processString(input, reverse) + "]");
    }
}
