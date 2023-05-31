public class Main3 {

    public static void main(String[] args) {
        // Объединение двух отсортированных списков в третий
        LinkedList list1 = new LinkedList();
        list1.pushToHead(10);
        list1.pushToTail(15);
        list1.pushToTail(20);
        LinkedList list2 = new LinkedList();
        list2.pushToHead(5);
        list2.pushToTail(9);
        list2.pushToTail(11);
        list2.pushToTail(16);
        list2.pushToTail(21);
        LinkedList list = new LinkedList();
        LinkedList.Node t1 = list1.getHead();
        LinkedList.Node t2 = list2.getHead();
        while (t1 != null && t2 != null) {
            if (t1.value < t2.value) {
                // В результат идет элемент из list1
                list.pushToTail(t1.value);
                t1 = t1.next;
            } else {
                // В результат идет элемент из list2
                list.pushToTail(t2.value);
                t2 = t2.next;
            }
        }
        // Обрабатываем возможный "хвост" в list1
        while (t1 != null) {
            list.pushToTail(t1.value);
            t1 = t1.next;
        }
        // Обрабатываем возможный "хвост" в list2
        while (t2 != null) {
            list.pushToTail(t2.value);
            t2 = t2.next;
        }
        list.print();
    }

}
