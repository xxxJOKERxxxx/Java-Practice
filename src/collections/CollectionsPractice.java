package collections;

import java.util.ArrayList;

public class CollectionsPractice {

    public static void main(String[] args) {
        System.out.println("=== Структуры данных (Collections) ===\n");

        // здесь будем вызывать методы
        // friendsList();
        sumOfNumbers();

    }
    public static void friendsList() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Дима");
        names.add("Оля");
        names.add("Саша");
        System.out.println(names);
        names.add("Катя");
        System.out.println(names);
        names.remove(1);
        System.out.println(names);
    }

    public static void sumOfNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        System.out.println(list.size());
    }

}
