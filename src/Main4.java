public class Main4 {

    public static void main(String[] args) {
        // Найти элемент, стоящий посередине односвязного списка.
        // Используем два указателя - быстрый и медленный
        LinkedList list2 = new LinkedList();
        list2.pushToHead(5);
        list2.pushToTail(9);
        list2.pushToTail(11);
        list2.pushToTail(16);
        list2.pushToTail(21);
        LinkedList.Node fast = list2.getHead();
        LinkedList.Node slow = list2.getHead();
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println(slow.value);
    }

}
