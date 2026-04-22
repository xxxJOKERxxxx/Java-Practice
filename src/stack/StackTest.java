package stack;

public class StackTest {
    public static void main(String[] args) {
        // создаём наш стек
        MyStack stack = new MyStack();

        // кладём элементы
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // печатаем
        System.out.print("Стек после добавлений: ");
        stack.print();  // [10, 20, 30]

        // снимаем с верхушки
        System.out.println("Сняли: " + stack.pop());  // 30
        System.out.print("Стек после снятия: ");
        stack.print();  // [10, 20]

        // смотрим верхний (не снимая)
        System.out.println("Верхний элемент: " + stack.peek());  // 20

        System.out.println("Размер стека: " + stack.size());  // 2
        System.out.println("Стек пуст? " + stack.isEmpty());  // false
    }
}