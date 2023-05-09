public class Main2 {

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push(1);
        for (int i = 1; i < 10; i++) {
            stack.push(i * 10);
        }
        stack.push(100);
        System.out.println(stack.peek());
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println(stack.pop());
    }

}
