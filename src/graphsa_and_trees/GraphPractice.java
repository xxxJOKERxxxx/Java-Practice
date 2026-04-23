package graphsa_and_trees;

// Создаём класс для вершины графа (человека)
class Person {
    String name;              // имя человека
    boolean[] connections;    // массив: с кем дружит (true/false)
    int index;                // номер человека в общем списке

    // Конструктор — вызывается при создании нового человека
    public Person(String name, int index, int totalPeople) {
        this.name = name;
        this.index = index;
        this.connections = new boolean[totalPeople]; // создаём массив связей
    }
}

// Класс для графа (социальной сети)
class SocialGraph {
    Person[] people;          // массив всех людей
    int size;                 // сколько людей добавлено

    // Конструктор — создаём пустой граф на максимум 10 человек
    public SocialGraph(int maxPeople) {
        people = new Person[maxPeople];
        size = 0;
    }

    // Метод для добавления нового человека
    public void addPerson(String name) {
        people[size] = new Person(name, size, 10); // создаём человека
        size++;
    }

    // Метод для добавления дружбы (связи между двумя людьми)
    public void addFriendship(String name1, String name2) {
        // Находим индексы людей по имени
        int index1 = findIndex(name1);
        int index2 = findIndex(name2);

        if (index1 != -1 && index2 != -1) {
            // Устанавливаем связь в обе стороны (неориентированный граф)
            people[index1].connections[index2] = true;
            people[index2].connections[index1] = true;
            System.out.println(name1 + " и " + name2 + " теперь друзья!");
        } else {
            System.out.println("Ошибка: один из людей не найден");
        }
    }

    // Вспомогательный метод — найти индекс человека по имени
    private int findIndex(String name) {
        for (int i = 0; i < size; i++) {
            if (people[i].name.equals(name)) {
                return i;
            }
        }
        return -1; // не найден
    }

    // Метод для проверки, дружат ли два человека
    public boolean areFriends(String name1, String name2) {
        int index1 = findIndex(name1);
        int index2 = findIndex(name2);

        if (index1 == -1 || index2 == -1) {
            return false; // если кого-то нет — не дружат
        }

        // Проверяем связь в массиве connections
        return people[index1].connections[index2];
    }

    // Метод для вывода всех связей (для наглядности)
    public void printGraph() {
        System.out.println("\n=== Социальная сеть ===");
        for (int i = 0; i < size; i++) {
            System.out.print(people[i].name + " дружит с: ");
            for (int j = 0; j < size; j++) {
                if (people[i].connections[j]) {
                    System.out.print(people[j].name + " ");
                }
            }
            System.out.println();
        }
    }
}

// Главный класс для запуска
public class GraphPractice {
    public static void main(String[] args) {
        // Создаём граф на 5 человек
        SocialGraph network = new SocialGraph(5);

        // Добавляем людей
        network.addPerson("Анна");
        network.addPerson("Борис");
        network.addPerson("Виктор");
        network.addPerson("Галина");
        network.addPerson("Дмитрий");

        // Добавляем дружеские связи
        network.addFriendship("Анна", "Борис");
        network.addFriendship("Анна", "Виктор");
        network.addFriendship("Борис", "Галина");
        network.addFriendship("Виктор", "Дмитрий");

        // Выводим всю сеть
        network.printGraph();

        // Проверяем связи
        System.out.println("\n=== Проверка дружбы ===");
        System.out.println("Анна и Виктор дружат? " + network.areFriends("Анна", "Виктор")); // true
        System.out.println("Анна и Галина дружат? " + network.areFriends("Анна", "Галина")); // false
        System.out.println("Борис и Дмитрий дружат? " + network.areFriends("Борис", "Дмитрий")); // false
    }
}
