public class Queue {

    private QueueItem head = null, tail = null;

    public void add(int value) {
        QueueItem temp = new QueueItem();
        temp.value = value;
        if (tail != null) {
            // Если очередь не пустая
            tail.next = temp;
        } else {
            // Если очередь пустая
            head = temp;
        }
        tail = temp;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = head.value;
        if (head == tail) {
            // У нас один элемент в очереди
            head = null;
            tail = null;
        } else {
            // В очереди больше одного элемента
            head = head.next;
        }
        return value;
    }

    public boolean isEmpty() {
        return head == null || tail == null;
    }

    class QueueItem {
        int value;
        QueueItem next;
    }

}


