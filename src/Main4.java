public class Main4 {

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(10);
        dynamicArray.printArray();
        dynamicArray.add(20);
        dynamicArray.printArray();
        dynamicArray.add(30);
        dynamicArray.printArray();
        dynamicArray.add(40, 4);
        dynamicArray.add(100, 1);
        dynamicArray.printArray();
        dynamicArray.add(200, 2);
        dynamicArray.printArray();
        dynamicArray.remove();
        dynamicArray.printArray();
        dynamicArray.remove(1);
        dynamicArray.printArray();
        dynamicArray.trim();
        dynamicArray.printArray();
        dynamicArray.add(30);
        dynamicArray.printArray();
    }

}
