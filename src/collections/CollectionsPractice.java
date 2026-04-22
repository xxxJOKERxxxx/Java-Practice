package collections;

import java.awt.print.Book;
import java.util.ArrayList;

public class CollectionsPractice {

    public static void main(String[] args) {
        System.out.println("=== Структуры данных (Collections) ===\n");

        // здесь будем вызывать методы
        // friendsList();
        //sumOfNumbers();
        //printBooks();
        // removeColors();
        //replacePet();
        //checkNumber();
        //clear();
        //clear1();

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

    public static void removeColors() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");
        System.out.println(colors);
        colors.remove("blue");
        System.out.println(colors);
    }

    public static void replacePet() {
        ArrayList<String> pets = new ArrayList<>();
        pets.add("кошка");
        pets.add("собака");
        pets.add("хомяк");
        pets.add("попугай");

        System.out.println(pets);
        pets.set(2,"пума");
        System.out.println(pets);
    }

    public static void checkNumber() {
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("10");
        numbers.add("20");
        numbers.add("30");
        numbers.add("40");
        numbers.add("50");

        // Проверяем наличие 30
        boolean check30 = false;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i).equals("30")) {
                check30 = true;
                break;
            }
        }
        System.out.println("30 есть в списке: " + check30);

        // Проверяем наличие 100
        boolean check100 = false;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i).equals("100")) {
                check100 = true;
                break;
            }
        }
        System.out.println("100 есть в списке: " + check100);
    }

    public static void clear() {
        ArrayList<String> list = new ArrayList<>();
        list.add("один");
        list.add("два");
        list.add("три");
        System.out.println(list);
        list.clear();
        System.out.println(list);
        System.out.println(list.size());

    }
    static void clear1() {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 0;

        }

    }

    public static void size() {

    }


}
