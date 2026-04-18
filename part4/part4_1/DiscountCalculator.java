package part4.part4_1;

public class DiscountCalculator {

    public static double calculateDiscount(double price, String customerType) {
        // TODO: реализуйте скидку по типу клиента.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        return switch (customerType.toLowerCase()) {
            case "vip" -> price * 0.30;
            case "regular" -> price * 0.10;
            case "new" -> price * 0.05;
            default -> 0;
        };
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static double calculateDiscount(double price, int purchaseCount) {
        // TODO: реализуйте скидку по количеству покупок.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        if (purchaseCount >= 100) return price * 0.20;
        if (purchaseCount >= 50) return price * 0.15;
        if (purchaseCount >= 10) return price * 0.10;
        return 0;
    // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static double calculateDiscount(double price, String promoCode, boolean isFirstOrder) {
        // TODO: реализуйте скидку по промокоду + бонус за первый заказ.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        double discount = 0;
        if ("SAVE10".equals(promoCode)) discount = price * 0.10;
        if ("SAVE20".equals(promoCode)) discount = price * 0.20;
        if (isFirstOrder) discount += price * 0.05; // Дополнительная скидка новым
        return Math.min(discount, price * 0.50); // Не более 50%

        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static double calculateDiscount(double price, int age, String season) {
        // TODO: четвертая перегрузка (пример: возраст + сезон).
        // Подсказка: ограничьте максимальную скидку 50% от price.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        double discountPercent = 0.0;

        // Возрастная скидка
        if (age >= 60) {
            discountPercent += 15.0;
        } else if (age <= 18) {
            discountPercent += 10.0;
        }

        // Сезонная скидка
        switch (season.toLowerCase()) {
            case "winter": discountPercent += 10.0; break;
            case "summer": discountPercent += 5.0; break;
            case "spring": discountPercent += 8.0; break;
            case "autumn": discountPercent += 3.0; break;
        }

        // Ограничение 50%
        if (discountPercent > 50.0) {
            discountPercent = 50.0;
        }

        return price * discountPercent / 100;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static void main(String[] args) {
        double price = 10000.0;
        System.out.println("VIP: " + calculateDiscount(price, "vip"));
        System.out.println("75 покупок: " + calculateDiscount(price, 75));
        System.out.println("SAVE20 + first: " + calculateDiscount(price, "SAVE20", true));
        System.out.println("Возраст+сезон: " + calculateDiscount(price, 65, "winter"));
    }
}
