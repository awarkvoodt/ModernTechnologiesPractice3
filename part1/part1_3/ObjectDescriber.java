package part1.part1_3;

//Напишите метод static String describe(Object obj) с использованием
//switch с паттерн-матчингом (Java 17+). Обрабатываемые случаи: null,
//Integer i (с пометкой положительное/не положительное), String s когда
//пустая, String s непустая, Double d, int[] arr, иные объекты (через
//default). Протестируйте на: null, 42, −5, "", "Привет", 3.14, new int[]
//{1,2,3}, true.
//

import java.util.Arrays;

public class ObjectDescriber {

    public static String describe(Object obj) {
        // TODO: используйте switch с pattern matching (Java 17+ preview).
        // Подсказка 1: обработайте null отдельным case.
        // Подсказка 2: для Integer укажите "положительное" или "не положительное".
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        return switch (obj) {
            case null -> "Это null";
            case Integer i when i > 0 -> "Это положительное целое число: " + i;
            case Integer i -> "Это не положительное целое число: " + i;
            case String s when s.isEmpty() -> "Это пустая строка";
            case String s -> "Это строка: " + s;
            case Double d -> "Это число с плавающей точкой: " + d;
            case int[] arr -> "Это массив int: " + Arrays.toString(arr);
            default -> "иные объекты: " + obj;
        };
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static void main(String[] args) {
        Object[] samples = {null, 42, -5, "", "Привет", 3.14, new int[]{1, 2, 3}, true};
        for (Object sample : samples) {
            System.out.println(describe(sample));
        }
        // Проверь себя: пустая строка и непустая строка должны различаться.
        // Типичные ошибки: забывают обработать default.
    }
}
