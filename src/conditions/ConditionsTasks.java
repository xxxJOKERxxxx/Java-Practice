package conditions;  // Пакет — как папка для организации кода

/**
 * Практика по теме: Условные операторы
 * Содержит несколько независимых задач в разных методах
 * if, else, switch, ternary
 * @author xxxJOKERxxxx
 */
public class ConditionsTasks {

    /**
     * Главный метод main — точка входа.
     * Здесь мы просто вызываем нужные методы.
     * Ненужные закомментированы.
     */
    public static void main(String[] args) {

        // Раскомментируй нужную задачу, закомментируй ненужные

        //taskIfExample();      // Примеры if, if-else, if-else-if, switch, ternary

         taskSeasons();     // Задача: времена года (пока закомментирована)
        // taskEvenOdd();     // Задача: чётное/нечётное (пока закомментирована)
    }

    // ==================== ПРИМЕРЫ РАЗНЫХ КОНСТРУКЦИЙ ====================

    /**
     * Метод, показывающий примеры всех основных условных конструкций:
     * 1. if
     * 2. if-else
     * 3. if-else if-else
     * 4. switch-case
     * 5. тернарный оператор
     */
    public static void taskIfExample() {

        System.out.println("========== ПРИМЕР 1: if ==========");
        // Пример 1: просто if
        int age = 18;  // объявляем переменную age типа int со значением 18
        if (age >= 18) {  // если age больше или равно 18
            // этот код выполнится только если условие true
            System.out.println("Доступ разрешен");
        }

        System.out.println("\n========== ПРИМЕР 2: if-else ==========");
        // Пример 2: if-else
        int temperature = 25;  // переменная для температуры
        if (temperature > 30) {  // если температура больше 30
            System.out.println("Жарко, включи кондиционер");
        } else {  // иначе (температура <= 30)
            System.out.println("Нормально, можно открыть окно");
        }

        System.out.println("\n========== ПРИМЕР 3: if-else if-else ==========");
        // Пример 3: if-else if-else (множественный выбор)
        int score = 85;  // переменная для баллов
        if (score >= 90) {           // если баллы от 90 и выше
            System.out.println("Отлично");
        } else if (score >= 75) {    // иначе если баллы от 75 до 89
            System.out.println("Хорошо");
        } else if (score >= 60) {    // иначе если баллы от 60 до 74
            System.out.println("Удовлетворительно");
        } else {                     // иначе (баллы меньше 60)
            System.out.println("Нужно подтянуть");
        }

        System.out.println("\n========== ПРИМЕР 4: switch-case ==========");
        // Пример 4: switch-case (выбор по конкретному значению)
        int day = 3;  // номер дня недели (1-7)
        String dayName;  // переменная для хранения названия дня

        switch (day) {  // switch смотрит значение переменной day
            case 1:     // если day == 1
                dayName = "Понедельник";
                break;  // break — выйти из switch (без него продолжит выполнение)
            case 2:
                dayName = "Вторник";
                break;
            case 3:
                dayName = "Среда";
                break;
            case 4:
                dayName = "Четверг";
                break;
            case 5:
                dayName = "Пятница";
                break;
            default:    // если ни один case не подошёл
                dayName = "Выходной";
                break;
        }
        System.out.println(dayName);  // выводим результат

        System.out.println("\n========== ПРИМЕР 5: Тернарный оператор ==========");
        // Пример 5: тернарный оператор (условие ? если правда : если_ложь)
        int age2 = 20;  // переменная для возраста
        // Тернарный оператор — сокращённая запись if-else в одну строку
        String status = (age2 >= 18) ? "Взрослый" : "Ребенок";
        // То же самое через if-else:
        // if (age2 >= 18) { status = "Взрослый"; } else { status = "Ребенок"; }
        System.out.println(status);
    }

    // ==================== ЗАДАЧИ ДЛЯ ПРАКТИКИ (пока пустые) ====================

    /**
     * Задача 1: Определение времени года по номеру месяца
     */
    public static void taskSeasons() {
        int month = 5;
        int year = 2026;

        if (month >= 1 && month <= 2 || month == 12) {
            System.out.println("месяц = " + month + ", зима " + year);
        } else if (month >= 3 && month <= 5) {
            System.out.println("месяц = " + month + ", весна " + year);
        } else if (month >= 6 && month <= 8) {
            System.out.println("месяц = " + month + ", лето " + year);
        } else if (month >= 9 && month <= 11) {
            System.out.println("месяц = " + month + ", осень " + year);
        } else {
            System.out.println("Ошибка: нет месяца " + month);
        }
    }

    /**
     * Задача 2: Проверка чётности числа
     */
    public static void taskEvenOdd() {
        // Здесь будет код задачи
    }

}
