package collections;

public class MyDynamicArray {
    private int[] data;      // это массив, где будут храниться числа
    private int size;        // сколько элементов реально добавлено
    private int max_size;    // максимальная вместимость (длина массива data)

    public MyDynamicArray() {          // конструктор без параметров
        max_size = 2;                  // начальная вместимость = 2
        data = new int[max_size];      // создаём массив на 2 ячейки
        size = 0;                      // пока элементов нет
    }

    //Метод add() — добавить элемент
    public void add(int value) {               // метод ничего не возвращает (void), принимает число value
        if (size == max_size) {                // если массив заполнен
            max_size *= 2;                     // увеличиваем вместимость в 2 раза
            int[] newData = new int[max_size]; // создаём новый массив большего размера

            for (int i = 0; i < size; i++) {   // копируем старые элементы в новый массив
                newData[i] = data[i];
            }

            data = newData;                    // заменяем старый массив новым
        }

        data[size] = value;                    // кладём новое значение в первую свободную ячейку
        size++;                                 // увеличиваем счётчик элементов
    }

    //Метод get() — получить элемент по индексу
    public int get(int index) {                             // метод возвращает int
        if (index < 0 || index >= size) {                   // если индекс вне границ
            throw new RuntimeException("Индекс вне границ"); // выкидываем ошибку
        }
        return data[index];                                 // возвращаем элемент
    }

    //Метод size() — узнать количество элементов
    public int size() {
        return size;      // просто возвращаем переменную size
    }

    //Метод print() — вывести массив на экран
    public void print() {
        System.out.print("[");                         // открывающая скобка
        for (int i = 0; i < size; i++) {               // идём только по реальным элементам
            System.out.print(data[i]);                 // печатаем элемент
            if (i < size - 1) {                        // если не последний элемент
                System.out.print(", ");                // печатаем запятую
            }
        }
        System.out.println("]");// закрывающая скобка и перевод строк

    }

    public boolean isEmpty() {
        return size == 0;
    }
    //Метод remove(int index) — удалить элемент по индексу
    // Логика удаления (по шагам):Проверить, что индекс существует (не отрицательный и не больше size)Сдвинуть все элементы справа от index на одну позицию влевоУменьшить size на 1(Опционально) последнюю ячейку обнулить

    public void remove(int index) {
        // 1. Проверка индекса
        if (index < 0 || index >= size) {
            throw new RuntimeException("Индекс вне границ");
        }

        // 2. Сдвигаем элементы влево (начиная с index)
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        // 3. Уменьшаем размер
        size--;

        // 4. (Опционально) последнюю ячейку обнуляем
        data[size] = 0;
    }

    public static void main(String[] args) {
       MyDynamicArray arr = new MyDynamicArray();

       /* arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.print();           // [10, 20, 30]

        arr.remove(1);         // удаляем элемент с индексом 1 (20)
        arr.print();           // [10, 30]

        System.out.println("Размер: " + arr.size());     // 2
        System.out.println("Пустой? " + arr.isEmpty());  // false   */
        /* arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.print();  // [10, 20, 30]

        arr.addingElementPosition(1, 99);
        arr.print();  // [10, 99, 20, 30]*/
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.print();        // [10, 20, 30]

        arr.clear();
        arr.print();        // []
        System.out.println(arr.size());  // 0

        arr.add(99);
        arr.print();        // [99]
    }

    public void addingElementPosition(int index, int value) {
        if (index < 0 || index > size) {
            throw new RuntimeException("Индекс вне границ");
        }

        if (size == max_size) {
            max_size *= 2;
            int[] newData = new int[max_size];
            for (int i = 0; i < size; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }

        // Сдвиг вправо
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = value;
        size++;
    }

    public void clear() {
        max_size = 2;
        data = new int[max_size];
        size = 0;

    }

}
