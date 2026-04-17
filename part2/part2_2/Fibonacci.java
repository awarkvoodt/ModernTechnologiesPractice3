package part2.part2_2;

//Реализуйте класс Fibonacci с методами:
//fibIterative(int n) — итеративное вычисление с
//while-циклом; fibFor(int n) — с for-циклом.
//Выведите F(0)..F(15). Найдите первое число Фибоначчи,
//превышающее 1000.


public class Fibonacci {

    public static long fibIterative(int n) {
        // TODO: реализуйте while-вариант.
        // Подсказка: базовые случаи n=0 и n=1 обработайте отдельно.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        return -1;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static long fibFor(int n) {
        // TODO: реализуйте for-вариант.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        return -1;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static long firstGreaterThan(long threshold) {
        // TODO: найдите первое число Фибоначчи > threshold.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        return -1;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 15; i++) {
            System.out.printf("F(%d)=%d | %d%n", i, fibIterative(i), fibFor(i));
        }
        System.out.println("Первое число Фибоначчи > 1000: " + firstGreaterThan(1000));
        // Проверь себя: обе реализации fib дают одинаковые значения.
    }
}
