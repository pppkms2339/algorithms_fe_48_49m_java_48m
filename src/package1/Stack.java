package package1;

public class Stack {

    private String name;

    private Node top = null;

    public Stack(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Добавить элемент в стек
    public void push(int value) {
        Node temp = new Node();
        temp.value = value;
        if (isEmpty()) {
            // Стек пустой, поэтому добавляемый элемент
            // становится вершиной
            top = temp;
            return;
        }
        // Здесь мы окажемся, если стек не пустой
        temp.next = top;
        top = temp;
    }

    // Извлечь вершину стека
    public int pop() {
        int answer = top.value;
        top = top.next;
        return answer;
    }

    // Проверка пуст ли стек
    // Возвращается true, если стек пустой
    public boolean isEmpty() {
        return top == null;
    }

    // Вернуть значение, которое хранится в вершине стека
    // без удаления элемента
    public int peek() {
        return top.value;
    }

}

class Node {
    int value;
    Node next;
}
