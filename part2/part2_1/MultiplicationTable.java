package part2.part2_1;

//Напишите программу, которая выводит таблицу
//умножения от 1 до 10 в форматированном виде (числа
//выровнены по столбцам шириной 4). Используйте
//вложенные for-циклы. Каждая строка начинается с
//номера строки, затем все произведения.


public class MultiplicationTable {

    public static void printTable() {
        // TODO: выведите таблицу умножения 1..10, ширина столбца 4.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        for (int i = 1; i < 11; i++){
            System.out.printf("%4d",i);
            for(int j = 1; j < 11; j++){
                System.out.printf("%4d", i * j);
            }
        System.out.println();

        }

        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static void main(String[] args) {
        printTable();
        // Проверь себя: каждая строка начинается с номера строки.
    }
}
