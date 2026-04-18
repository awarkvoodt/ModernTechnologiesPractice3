package part2.part2_3;

public class StringProcessor {
    private static final String VOWELS = "aeiouyаеёиоуыэюя";

    public static int countVowels(String text) {
        // TODO: посчитайте русские и английские гласные.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        String text_lower = text.toLowerCase();

        int cnt = 0;
        for (int i = 0; i < text_lower.length(); i++){
            char c = text_lower.charAt(i);
            if (VOWELS.indexOf(c) != -1){
                cnt++;
            }
        }

        return cnt;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static boolean isPalindrome(String text) {
        // TODO: палиндром без учета регистра и знаков препинания.
        // Подсказка: сравнение символов с двух концов.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        String text_clean = text.toLowerCase().replaceAll("[^a-zа-яё0-9]", "");

        int left = 0;
        int right = text_clean.length()-1;

        while (left < right){
            if (text_clean.charAt(left) != text_clean.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static String reverse(String text) {
        // TODO: реверс без StringBuilder.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        char[] chars = text.toCharArray();
        int left = 0;
        int right = text.length() - 1;

        while (left < right){
            char c = chars[left];
            chars[left] = chars[right];
            chars[right] = c;

            left++;
            right--;
        }
        return new String(chars);
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static String findLongestWord(String sentence) {
        // TODO: найдите самое длинное слово.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        String[] words = sentence.split("[^a-zA-Zа-яА-ЯёЁ0-9]+");

        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲

    public static void main(String[] args) {
        String s1 = "Привет, Java-разработчик!";
        String s2 = "топот";
        String s3 = "Madam";
        String s4 = "hello";
        String s5 = "А роза упала на лапу Азора";
        String s6 = "The quick brown fox jumps over the lazy dog";

        System.out.println("Гласные: " + countVowels(s1));
        System.out.println("Палиндром (топот): " + isPalindrome(s2));
        System.out.println("Палиндром (Madam): " + isPalindrome(s3));
        System.out.println("Реверс (hello): " + reverse(s4));
        System.out.println("Палиндром (фраза): " + isPalindrome(s5));
        System.out.println("Самое длинное слово: " + findLongestWord(s6));
    }
}
