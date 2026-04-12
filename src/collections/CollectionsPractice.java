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
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        int sum = 0;
        for(int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println("sum = " + sum);
    }

}
