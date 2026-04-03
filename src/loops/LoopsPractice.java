package loops;

public class LoopsPractice {
    public static void main(String[] args) {
        // === ПРИМЕРЫ ИЗ УРОКА ===
        /*
        taskWhileExample();
        taskForExample();
        taskDoWhileExample();
        taskDifferenceExample();
        */
        System.out.println("========== МОЯ ПРАКТИКА ==========");
        findNumber();
    }
    public static void taskWhileExample() {
        System.out.println("=== Цикл while ===");

        int counter = 1;  // Создаём переменную-счётчик. Начинаем с 1.

        while (counter <= 5) {  //Проверяем условие: пока counter меньше или равен 5
            System.out.println("counter = " + counter);
            //    - Если ДА → заходим внутрь
            //    - Если НЕТ → пропускаем и идём дальше
             counter = counter + 1;  //  Увеличиваем счётчик на 1 (чтобы когда-то остановиться)
            //    Без этого шага цикл будет бесконечным!
            // Возвращаемся к строке 2 (проверяем условие с новым значением counter)
        }
        // 6. Когда условие стало false (counter = 6), выходим из цикла и идём сюда
        System.out.println("Цикл закончился, counter стал = " + counter); // 3. Печатаем текущее значение
    }
    public static void taskForExample() {
        System.out.println("=== Цикл for ===");

        // for (начало; условие_продолжения; шаг)
        // начало:       int i = 1          → создаём счётчик i, начинаем с 1
        // условие:      i <= 5            → пока i меньше или равно 5, работаем
        // шаг:          i = i + 1         → каждый раз увеличиваем i на 1

        for (int i = 1; i <= 5; i = i + 1) {
            System.out.println("Привет! Это повтор номер " + i);
        }

        System.out.println("Цикл закончился, i больше не существует (жил только внутри цикла)");
    }

    public static void taskDoWhileExample() {
        System.out.println("\n=== Цикл do-while ===");

        int counter = 1;

        // do — "сделай"
        do {
            System.out.println("counter = " + counter);
            counter = counter + 1;
        } while (counter <= 5);  // while — "пока" (проверка ПОСЛЕ выполнения)

        System.out.println("Цикл закончился, counter стал = " + counter);
    }

    public static void taskDifferenceExample() {
        System.out.println("\n=== Разница между while и do-while ===");

        int i = 10;  // условие сразу ложно (10 > 5)

        System.out.println("--- while ---");
        while (i <= 5) {
            System.out.println("while: i = " + i);  // НЕ выполнится ни разу
        }
        System.out.println("while: не выполнился ни разу");

        System.out.println("\n--- do-while ---");
        i = 10;  // сбрасываем счётчик
        do {
            System.out.println("do-while: i = " + i);  // выполнится ОДИН раз
        } while (i <= 5);
        System.out.println("do-while: выполнился один раз, потом проверил условие и вышел");
    }

    // ========== МОЯ ПРАКТИКА ==========
    public static void findNumber() {
        int[] numbers = {3, 7, 1, 9, 5};  // массив чисел
        int target = 17;                     // искомое число
        boolean found = false;              // флаг: пока не нашли

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Найдено");
        } else {
            System.out.println("Не найдено");
        }
    }

}
