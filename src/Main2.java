public class Main2 {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(10);
        tree.add(5);
        tree.add(2);
        tree.add(6);
        tree.add(5);
        tree.add(20);
        tree.print();
        System.out.println();
        tree.pass();
    }

}
