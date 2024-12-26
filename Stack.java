public class Stack<T> {
    private T[] data;
    private int size;

    public Stack(int capacity) {
        data = (T[]) new Object[capacity];
        size = 0;
    }

    // добав-е эл-та в стек
    public void push(T element) {
        if (size == data.length) {
            throw new StackOverflowError("Стек переполнен");
        }
        data[size] = element;
        size++;
    }

    // Метод для удаления элемента из стека
    public T pop() {
        if (size == 0) {
            throw new IllegalStateException("Стек пуст");
        }
        size--;
        T element = data[size]; // Получаем верхний элемент
        data[size] = null;
        return element;
    }

    // Метод для получения верхнего элемента стека без его удаления
    public T peek() {
        if (size == 0) {
            throw new IllegalStateException("Стек пуст");
        }
        return data[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
