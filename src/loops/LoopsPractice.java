package loops;

public class LoopsPractice {
    public static void main(String[] args) {
        // === ПРИМЕРЫ ИЗ УРОКА ===
//        taskWhileExample();
//        taskForExample();
//        taskDoWhileExample();
//        taskDifferenceExample();
//
//        System.out.println("========== МОЯ ПРАКТИКА ==========");
//        findNumber();
//        calculateSum();
//        multiplicationTable();
//        factorial();
//        countEvenNumbers();
        //sumOfArray();
        sumOfEvenNumbers();
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
    // "поиск числа в массиве"
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

    //Задача 2: "Сумма чисел от 1 до N" Компьютер должен сложить все числа подряд, начиная с 1, заканчивая тем числом N, которое ввел пользователь.
    public static void calculateSum() {
        int sum = 0; // сюда будем добавлять
        int n = 5; //  до какого числа складываем
        for (int i = 1; i <= n; i++) { // На каждой итерации прибавлять текущее число к sum
            sum = sum + i;
        }

        System.out.println("Сумма чисел от 1 до " + n + " = " + sum);
    }

    // Следующая задача — "Таблица умножения" Вывести таблицу умножения от 1 до 5
    public static void multiplicationTable() {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int result = i * j;
                System.out.println(i + " x " + j + " = " + result);
            }
            System.out.println();
        }
    }

    // Следующая задача: "Факториал числа"   Факториал числа n — это произведение всех чисел от 1 до n
    public static void factorial() {
        int n = 5;
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println("Факториал " + n + "! = " + result);
    }

    // Задача: "Посчитать количество чётных чисел"

    public static void countEvenNumbers() {
        int[] numbers = {2, 5, 8, 3, 10, 7};
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("колличество чётных чисел: " + count);
    }

    // Задача: "Найти сумму всех чисел в массиве"
    public static void sumOfArray() {
        int[] numbers = {2, 5, 8, 3, 10, 7};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("Сумма чисел: " + sum);
    }

    public static void sumOfEvenNumbers() {
        int[] numbers = {3, 6, 9, 12, 15};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum = sum + numbers[i];
            }


        }
        System.out.println("Сумма чётных чисел: " + sum + "(потому что 6 + 12 = 18) ");


    }

}
