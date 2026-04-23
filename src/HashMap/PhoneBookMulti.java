package HashMap;

// Импортируем HashMap и ArrayList
import java.util.HashMap;
import java.util.ArrayList;

public class PhoneBookMulti {
    public static void main(String[] args) {

        // ========== 1. СОЗДАЁМ ТЕЛЕФОННУЮ КНИГУ ==========
        // Ключ: имя (String)
        // Значение: список номеров (ArrayList<String>)
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

        // ========== 2. ВСПОМОГАТЕЛЬНЫЙ МЕТОД (внутри main) ==========
        // Добавляет номер к существующему контакту или создаёт новый

        // Добавляем Анне первый номер
        addNumber(phoneBook, "Анна", "89123456789");

        // Добавляем Анне второй номер
        addNumber(phoneBook, "Анна", "89234567890");

        // Добавляем Борису номер
        addNumber(phoneBook, "Борис", "89345678901");

        // ========== 3. ВЫВОДИМ ВСЮ КНИГУ ==========
        System.out.println("=== Телефонная книга ===");
        for (String name : phoneBook.keySet()) {
            System.out.println(name + " → " + phoneBook.get(name));
        }

        // ========== 4. УЗНАЁМ ВСЕ НОМЕРА АННЫ ==========
        ArrayList<String> annasNumbers = phoneBook.get("Анна");
        System.out.println("\nНомера Анны: " + annasNumbers);

        // ========== 5. УДАЛЯЕМ КОНКРЕТНЫЙ НОМЕР У АННЫ ==========
        removeNumber(phoneBook, "Анна", "89123456789");
        System.out.println("\nПосле удаления первого номера:");
        System.out.println("Анна → " + phoneBook.get("Анна"));

        // ========== 6. УДАЛЯЕМ ВЕСЬ КОНТАКТ (если номеров не осталось) ==========
        // Если у Анны остался 0 номеров — удаляем контакт
        if (phoneBook.get("Анна").isEmpty()) {
            phoneBook.remove("Анна");
            System.out.println("\nКонтакт Анна удалён (нет номеров)");
        }
    }

    // МЕТОД ДЛЯ ДОБАВЛЕНИЯ НОМЕРА
    // phoneBook — наша книга
    // name — имя контакта
    // number — номер для добавления
    static void addNumber(HashMap<String, ArrayList<String>> phoneBook,
                          String name, String number) {

        // Проверяем, есть ли уже такой контакт в книге
        if (phoneBook.containsKey(name)) {
            // Если есть — получаем список его номеров
            ArrayList<String> numbers = phoneBook.get(name);
            // Добавляем новый номер в список
            numbers.add(number);
            // Кладём обновлённый список обратно (можно не делать, но для ясности)
            phoneBook.put(name, numbers);
        } else {
            // Если контакта нет — создаём новый список
            ArrayList<String> newList = new ArrayList<>();
            // Добавляем номер в список
            newList.add(number);
            // Кладём в книгу новый контакт
            phoneBook.put(name, newList);
        }

        System.out.println("Добавлен номер " + number + " для " + name);
    }

    // МЕТОД ДЛЯ УДАЛЕНИЯ КОНКРЕТНОГО НОМЕРА
    static void removeNumber(HashMap<String, ArrayList<String>> phoneBook,
                             String name, String number) {

        // Проверяем, есть ли такой контакт
        if (phoneBook.containsKey(name)) {
            // Получаем список номеров
            ArrayList<String> numbers = phoneBook.get(name);
            // Удаляем нужный номер из списка
            numbers.remove(number);
            System.out.println("Удалён номер " + number + " у " + name);
        } else {
            System.out.println("Контакт " + name + " не найден");
        }
    }
}
