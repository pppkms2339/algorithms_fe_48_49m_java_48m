public class Main4 {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(10);
        for (int i = 0; i < 10; i ++) {
            queue.add(i * 10);
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }

}
