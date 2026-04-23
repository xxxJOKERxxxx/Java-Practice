package queue;

public class QueueTest {
    public static void main(String[] args) {
        // Создаём нашу очередь
        MyQueue queue = new MyQueue();

        // Добавляем элементы в конец
        System.out.println("Добавляем 10, 20, 30");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.print("Очередь сейчас: ");
        queue.print();  // [10, 20, 30]

        // Забираем из начала
        System.out.println("Забрали: " + queue.dequeue());  // 10
        System.out.print("Очередь после удаления: ");
        queue.print();  // [20, 30]

        // Смотрим первый элемент (не забирая)
        System.out.println("Первый элемент: " + queue.peek());  // 20

        // Добавляем ещё
        System.out.println("Добавляем 40");
        queue.enqueue(40);
        System.out.print("Очередь сейчас: ");
        queue.print();  // [20, 30, 40]

        // Забираем всё
        System.out.println("Забрали: " + queue.dequeue());  // 20
        System.out.println("Забрали: " + queue.dequeue());  // 30
        System.out.println("Забрали: " + queue.dequeue());  // 40

        System.out.println("Очередь пуста? " + queue.isEmpty());  // true
    }
}
