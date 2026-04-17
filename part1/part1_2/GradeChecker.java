package part1.part1_2;
//Реализуйте класс GradeChecker с двумя вариантами
//метода static String getGrade(int score): первый
//— через классический switch, второй — через
//стрелочный switch (Java 14+). Диапазоны оценок: 90–
//100 → "Отлично (A)", 80–89 → "Хорошо (B)", 70–79
//→ "Удовлетворительно (C)", 60–69 → "Слабо (D)",
//иначе → "Неудовлетворительно (F)". Протестируйте
//на значениях 95, 85, 73, 62, 45, 100, 0.

public class GradeChecker {

    public static String getGradeClassic(int score) {
        // TODO: реализуйте вариант через классический switch.
        // Подсказка: удобно сначала вычислить "десяток" score / 10.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        int dec = score / 10;
        switch (dec) {
            case 10:
            case 9:
                return ("Отлично (A)");
            case 8:
                return ("Хорошо (B)");
            case 7:
                return ("Удовлетворительно (C)");
            case 6:
                return ("Слабо (D)");
            default:
                return ("Неудовлетворительно (F)");
        }
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static String getGradeArrow(int score) {
        // TODO: реализуйте вариант через switch -> (Java 14+).
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        int dec = score / 10;
        return switch (dec) {
            case 10, 9 -> "Отлично (A)";
            case 8 -> "Хорошо (B)";
            case 7 -> "Удовлетворительно (C)";
            case 6 -> "Слабо (D)";
            default -> "Неудовлетворительно (F)";
        };
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static void main(String[] args) {
        int[] samples = {95, 85, 73, 62, 45, 100, 0};
        for (int score : samples) {
            System.out.printf("%d -> classic: %s | arrow: %s%n",
                score, getGradeClassic(score), getGradeArrow(score));
        }
        // Проверь себя: для одного score оба метода дают одинаковую оценку.
    }
}
