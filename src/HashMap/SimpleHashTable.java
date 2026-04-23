package HashMap;

public class SimpleHashTable {

    // Внутренний массив на 10 ячеек
    static String[] buckets = new String[10];

    // Простая хэш-функция: вычисляем индекс по имени
    static int getIndex(String key) {
        // Суммируем коды всех букв в строке
        int sum = 0;
        for (int i = 0; i < key.length(); i++) {
            sum += key.charAt(i);  // charAt(i) — возвращает код символа
        }

        // Берём остаток от деления на размер массива (10)
        int index = sum % buckets.length;

        // Выводим отладку
        System.out.println("Ключ: " + key + ", сумма кодов: " + sum + ", индекс: " + index);

        return index;
    }

    // Метод для добавления пары ключ-значение
    static void put(String key, String value) {
        int index = getIndex(key);
        buckets[index] = value;
        System.out.println("  -> положили '" + value + "' в ячейку " + index);
    }

    // Метод для получения значения по ключу
    static String get(String key) {
        int index = getIndex(key);
        return buckets[index];
    }

    public static void main(String[] args) {
        System.out.println("=== Простая хэш-таблица ===\n");

        // Добавляем пары
        put("Анна", "89123456789");
        put("Борис", "89234567890");
        put("Виктор", "89345678901");
        put("Галина", "89456789012");

        System.out.println("\n=== Содержимое массива ===");
        for (int i = 0; i < buckets.length; i++) {
            System.out.println("Ячейка " + i + " → " + buckets[i]);
        }

        System.out.println("\n=== Поиск ===");
        System.out.println("Телефон Анны: " + get("Анна"));
        System.out.println("Телефон Бориса: " + get("Борис"));
        System.out.println("Телефон Виктора: " + get("Виктор"));
    }
}
