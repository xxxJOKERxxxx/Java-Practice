package conditions;  // Пакет — как папка для организации кода

import java.util.Scanner;

/**
 * Практика по теме: Условные операторы
 * Содержит несколько независимых задач в разных методах
 * if, else, switch, ternary
 *
 * @author xxxJOKERxxxx
 */
public class ConditionsTasks {

    /**
     * Главный метод main — точка входа.
     * Здесь мы просто вызываем нужные методы.
     * Ненужные закомментированы.
     */
    public static void main(String[] args) {

        //Раскомментируй нужную задачу, закомментируй ненужные

        // taskIfExample();      // Примеры if, if-else, if-else-if, switch, ternary

        //taskSeasons();     // Задача: времена года

        //taskEvenOdd();     // Задача: чётное/нечётное
        //checkTemperature();  // введите температуру
        //getDiscount(); // определить скидку
        //getDayType();//определить день
        //getMonthSeason();


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

        System.out.println("==================== ЗАДАЧИ ДЛЯ ПРАКТИКИ ====================");
    }

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
        int number = 7;
        String result = (number % 2 == 0) ? "чётное" : "нечётное";
        System.out.println("Число " + number + " — " + result);
    }

    public static void checkTemperature() {

   /* Задача 1 (if-else)
    Условие:
    Напиши метод checkTemperature(int temp), который:

    Если temp < 0 → выводит "Ледяной холод"

    Если temp >= 0 и temp <= 15 → выводит "Прохладно"

    Если temp > 15 и temp <= 25 → выводит "Тепло"

    Если temp > 25 → выводит "Жара"*/

        Scanner sc = new Scanner(System.in);
        System.out.println(" введите температуру: ");
        int temp = sc.nextInt();
        if (temp < 0) {
            System.out.println("температура " + temp + ": Мороз!");
        } else if (temp >= 0 && temp <= 15) {
            System.out.println("температура " + temp + ": Прохладно!");
        } else if (temp >= 15 && temp <= 25) {
            System.out.println("температура " + temp + ": Тепло!");
        } else if (temp >= 25 && temp <= 35) {
            System.out.println("температура " + temp + ": Жара!");
        } else System.out.println("температура " + temp + ": спасайся кто может!!!");
        sc.close();
    }

    public static void getDiscount() {
        System.out.println(" Введите возраст: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println(" скидка: 0%");
        } else if (age >= 18 && age <= 60) {
            System.out.println(" скидка: 5%");
        } else if (age >= 60) {
            System.out.println(" скидка: 10%");

        }
    }

    public static void getDayType() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" введите день недели от 1 до 7 : ");
        int dayNumber = sc.nextInt();
        switch (dayNumber) {
            case 1: case 2: case 3: case 4: case 5: System.out.println("Будний день!");
            break;
            case 6: case 7:
                System.out.println("Выходной день!");
                break;
                default:
                    System.out.println("Неверный день недели!");
        }
        sc.close();
    }

    public static void getMonthSeason() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" введите число месяца: ");
        int month = sc.nextInt();
        switch (month) {
            case 1: case 2: case 12:
                System.out.println("Зима");
            break;
            case 3: case 4: case 5:
                System.out.println("Весна");
                break;
                case 6: case 7: case 8:
                System.out.println("Лето");
                break;
                case 9: case 10: case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("неправильное число (1-12)!!!");
        }

    }

}
