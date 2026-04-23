package HashMap;

// Импортируем HashMap — готовый словарь из Java
import java.util.HashMap;

public class PhoneBook {
    public static void main(String[] args) {

        // ========== 1. СОЗДАЁМ ТЕЛЕФОННУЮ КНИГУ ==========
        // HashMap<ТипКлюча, ТипЗначения> имя = new HashMap<>();
        // <String, String> — ключ (имя) и значение (номер) — оба текст
        // phoneBook — имя переменной
        HashMap<String, String> phoneBook = new HashMap<>();

        // ========== 2. ДОБАВЛЯЕМ КОНТАКТЫ ==========
        // put(ключ, значение) — кладём пару в словарь
        phoneBook.put("Анна", "89123456789");   // Анна → номер
        phoneBook.put("Борис", "89234567890");  // Борис → номер
        phoneBook.put("Виктор", "89345678901"); // Виктор → номер

        // ========== 3. СМОТРИМ ВСЮ КНИГУ ==========
        // System.out.println(объект) — у HashMap есть встроенный вывод
        System.out.println("Телефонная книга: " + phoneBook);
        // Вывод: {Анна=89123456789, Борис=89234567890, Виктор=89345678901}

        // ========== 4. ИЩЕМ НОМЕР ПО ИМЕНИ ==========
        // get(ключ) — возвращает значение (номер) или null, если нет
        String number = phoneBook.get("Борис");
        System.out.println("Номер Бориса: " + number);  // 89234567890

        // ========== 5. ПРОВЕРЯЕМ, ЕСТЬ ЛИ КОНТАКТ ==========
        // containsKey(ключ) — возвращает true, если ключ есть
        if (phoneBook.containsKey("Анна")) {
            System.out.println("Анна есть в телефонной книге");
        }

        // ========== 6. ПРОВЕРЯЕМ, ЧЕГО НЕТ ==========
        if (phoneBook.containsKey("Галина")) {
            System.out.println("Галина есть");
        } else {
            System.out.println("Галины НЕТ в телефонной книге");
        }

        // ========== 7. УДАЛЯЕМ КОНТАКТ ==========
        // remove(ключ) — удаляет пару из словаря
        phoneBook.remove("Виктор");
        System.out.println("После удаления Виктора: " + phoneBook);

        // ========== 8. УЗНАЁМ КОЛИЧЕСТВО КОНТАКТОВ ==========
        // size() — возвращает сколько пар в словаре
        System.out.println("Количество контактов: " + phoneBook.size());

        // ========== 9. ИЗМЕНЯЕМ НОМЕР У СУЩЕСТВУЮЩЕГО КОНТАКТА ==========
        // put(существующий_ключ, новый_номер) — заменяет значение
        phoneBook.put("Анна", "89999999999");
        System.out.println("Новый номер Анны: " + phoneBook.get("Анна"));

        // ========== 10. КАК ПОЛУЧИТЬ ВСЕ ИМЕНА (БЕЗ List) ==========
        // keySet() — возвращает все ключи (можно обойти через цикл)
        // Цикл for-each — пробегает по всем ключам
        System.out.println("\n=== Все контакты ===");
        for (String name : phoneBook.keySet()) {
            // для каждого имени выводим имя и его номер
            System.out.println(name + " → " + phoneBook.get(name));
        }

        // ========== 11. КАК ПОЛУЧИТЬ ВСЕ НОМЕРА ==========
        // values() — возвращает все значения (обойти через цикл)
        System.out.println("\n=== Все номера ===");
        for (String phone : phoneBook.values()) {
            System.out.println(phone);
        }
    }
}
