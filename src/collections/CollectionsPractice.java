package collections;

import java.awt.print.Book;
import java.util.ArrayList;

public class CollectionsPractice {

    public static void main(String[] args) {
        System.out.println("=== Структуры данных (Collections) ===\n");

        // здесь будем вызывать методы
        // friendsList();
        //sumOfNumbers();
        printBooks();

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

    public static void printBooks() {
        ArrayList<String> books = new ArrayList<>();

        books.add("Властелин колец");
        books.add("Мастер и Маргарита");
        books.add("Война и мир");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));

        }

    }

}
