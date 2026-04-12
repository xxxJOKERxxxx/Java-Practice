package loops;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LoopsPractice {
    public static void main(String[] args) {

        // === ПРИМЕРЫ ИЗ УРОКА ===

        //taskWhileExample();
        //taskForExample();
        //taskDoWhileExample();
        //taskDifferenceExample();
        //System.out.println("========== МОЯ ПРАКТИКА ==========");
        //findNumber();
        //calculateSum();
        //multiplicationTable();
        //factorial();
        // countEvenNumbers();
        // sumOfArray();
        //sumOfEvenNumbers();
        //findMax();
        //reverseArray();
        //reverseArray2();
        //findMinIndex();
        //numberOccurs();
        //numberSearch();
        //shiftLeft();
        //findFirstNegative();
        //findLastNegative();
        //findSecondMaximumNumber(); // второе максимальное число
        // guessNumberWhile(); //угадай число
        //inputValidNumber(); //do-while — "Хотя бы раз ввести"
        //determiningTimeDay(); // определение времени суток
        guessNumberLimited();
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

    public static void findMax() {
        int[] numbers = {4, 7, 2, 9, 11, 5};
        int max = numbers[0];//(первый элемент)
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {// В цикле сравнивай каждый элемент с max
                max = numbers[i];// Если элемент больше max — обновляй max

            }
        }
        System.out.println(" максимальное число: " + max);
    }

    public static void reverseArray() {

        int[] numbers = {10, 20, 30, 40, 50};
        int[] reversedArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversedArray[i] = numbers[numbers.length - 1 - i];
        }
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.println(reversedArray[i]);
        }
    }

    public static void reverseArray2() {
        int[] numbers = {11, 22, 33, 44, 55};
        int[] expandArray = new int[numbers.length];
        int j = 0;//Имя переменной. Будет указывать, в какую ячейку expandArray класть значение
        for (int i = numbers.length - 1; i >= 0; i--) {//i = numbers.length - 1 Начинаем с последнего индекса. Длина 5, индексы 0,1,2,3,4 → последний индекс 4, i >= 0	Пока i не станет меньше 0 (т.е. пока не прошли все элементы), i--	После каждого шага уменьшаем i на 1 (двигаемся к началу)
            expandArray[j] = numbers[i];// expandArray[j]	Обращаемся к j-й ячейке нового массива, =	Присваиваем, numbers[i]	Берём значение из исходного массива по индексу i
            j++;//Увеличиваем j на 1 (то же самое что j = j + 1), Зачем: После того как положили значение в expandArray[0], нужно перейти к следующей ячейке — expandArray[1], Без j++: Все значения кладутся в expandArray[0], последнее записанное перезатирает предыдущие.
        }
        System.out.println("обратный масив циклом равен: " + Arrays.toString(expandArray));// Arrays	Класс с полезными методами для работы с массивами, toString()	Метод, который превращает массив в читаемую строку, Зачем: Без этого System.out.println(expandArray) напечатает странный адрес в памяти, а не элементы.

    }

    public static void findMinIndex() {
        int[] numbers = {5, 67, 8, 13, 9, 2, 33};
        int min = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[min]) {
                min = i;
            }
        }
        System.out.println("Индекс минимального числа: " + min);
        System.out.println("Минимальное число: " + numbers[min]);
    }
    //Задача: "Подсчитать, сколько раз встречается число"

    public static void numberOccurs() {
        int[] numbers = {3, 5, 3, 8, 3, 5, 9};
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 3) {
                count++;
            }
        }
        System.out.println("Число 3 встречаетс: " + count + " раза ");
    }

    public static void numberSearch() {
        int[] numbers = {3, 5, 3, 8, 3, 5, 9};
        int target = 3;
        int count = 0;
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                count++;
            }

        }
        if (count > 0) {
            System.out.println(" Да, число: " + target + " есть " + count + " раза!!!");
        } else {
            System.out.println("Нет, числа " + target + " нет");
        }

    }

    public static void shiftLeft() {
        int[] numbers = {10, 20, 30, 40, 50};
        int[] shiftedArray = new int[numbers.length];
        for (int i = 0; i < numbers.length - 1; i++) {
            shiftedArray[i] = numbers[i + 1];  // копируем со сдвигом
            shiftedArray[numbers.length - 1] = 0; // // последнему 0
        }
        System.out.println(Arrays.toString(shiftedArray));
    }

    public static void findFirstNegative() {
        int[] numbers = {5, -3, 8, -1, 6, -4};
        int index = -1; // не нашли
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Индекс первого отрицательного числа: " + index);
        } else System.out.println("Отрицательных чисел нет");

    }

    public static void findLastNegative() {
        int[] numbers = {5, -3, 8, 1, 6, 4};
        int index = -1;
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] < 0) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Индекс последнего отрицательного числа: " + index + "(" + numbers[index] + ")");
        } else {
            System.out.println(" отрицательных чисел нет");
        }

    }

    public static void findSecondMaximumNumber() {
        int[] numbers = {7, 2, 9, 5, 9, 3};
        int max = numbers[0];
        int secondMax = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                secondMax = max;
                max = numbers[i];
            } else if (numbers[i] > secondMax && numbers[i] != max) {
                secondMax = numbers[i];
            }
        }
        if (secondMax == max) {
            System.out.println("нет второго максимального числа");
        } else {
            System.out.println("Второе максимальное число: " + secondMax);
        }

    }

    public static void guessNumberWhile() {
        // Создаём Scanner для чтения ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Загаданное число (тип int, значение 7)
        int secret = 7;

        // Переменная для хранения числа, которое введёт пользователь
        // Начинаем с 0, потому что 0 точно не равно 7 (чтобы цикл начался)
        int guess = 0;

        // Приветствие
        System.out.println("Угадай число от 1 до 10");

        // while — цикл с предусловием
        // Сначала проверяем условие, потом выполняем тело
        // Цикл работает, пока guess НЕ равно secret
        while (guess != secret) {

            // Просим пользователя ввести число
            System.out.print("Твой вариант: ");

            // Читаем число, которое ввёл пользователь, и сохраняем в guess
            guess = scanner.nextInt();

            // Если введённое число меньше загаданного
            if (guess < secret) {
                System.out.println("Мало, пробуй ещё!");
            }
            // Если введённое число больше загаданного
            else if (guess > secret) {
                System.out.println("Много, пробуй ещё!");
            }
            // Если равно — условие while (guess != secret) станет false,
            // и цикл закончится, не заходя на следующий круг
        }

        // Эта строка выполнится ТОЛЬКО после выхода из цикла
        // То есть когда guess == secret
        System.out.println("Угадал! Это " + secret);

        // Закрываем Scanner (освобождаем ресурсы)
        scanner.close();
    }

    public static void inputValidNumber() { // метод: хотя бы раз ввести число
        // Создаём Scanner для чтения ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);

        int number; // переменная для хранения числа, тип int

        // do-while — цикл с постусловием
        // Сначала выполняет тело, потом проверяет условие
        do {
            // Выводим приглашение на экран
            System.out.print("Введи число от 1 до 10: ");

            // Читаем число, которое ввёл пользователь
            number = scanner.nextInt();

            // Если число вне диапазона 1-10
            if (number < 1 || number > 10) {
                // Выводим сообщение об ошибке
                System.out.println("Ошибка! Пробуй ещё.");
            }

        } while (number < 1 || number > 10); // Условие: пока число НЕ в диапазоне — повторяем

        // Эта строка выполнится, только когда число в диапазоне 1-10
        System.out.println("Принято! Твоё число: " + number);

        // Закрываем Scanner
        scanner.close();
    }

    public static void determiningTimeDay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите час (0-23): ");
        int hour = scanner.nextInt();

        // Сначала проверяем, корректный ли час
        if (hour < 0 || hour > 23) {
            System.out.println("Введённый час неверный");
        }
        // Ночь: с 22 до 23 и с 0 до 5
        else if (hour >= 22 || hour <= 5) {
            System.out.println("Это ночь");
        }
        // Утро: с 6 до 11
        else if (hour >= 6 && hour <= 11) {
            System.out.println("Это утро");
        }
        // День: с 12 до 17
        else if (hour >= 12 && hour <= 17) {
            System.out.println("Это день");
        }
        // Вечер: с 18 до 21
        else if (hour >= 18 && hour <= 21) {
            System.out.println("Это вечер");
        }

        scanner.close();
    }

    public static void guessNumberLimited() {
        // 1. Создаём Random и Scanner
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        // 2. Загадываем число ОДИН раз (от 1 до 20)
        int secret = rand.nextInt(20) + 1;

        // 3. Счётчик попыток
        int attempts = 0;

        // 4. Цикл на 5 попыток
        while (attempts < 5) {
            System.out.print("Введите число от 1 до 20: ");
            int userGuess = scanner.nextInt();
            attempts++;  // увеличиваем счётчик

            if (userGuess == secret) {
                System.out.println("Угадал! За " + attempts + " попыток");
                return;  // выходим из метода (или break, если только из цикла)
            } else if (userGuess < secret) {
                System.out.println("Загаданное число БОЛЬШЕ");
            } else {
                System.out.println("Загаданное число МЕНЬШЕ");
            }
        }

        // 5. Если вышли из цикла (попытки кончились)
        System.out.println("Проигрыш! Было загадано: " + secret);
        scanner.close();
    }
}