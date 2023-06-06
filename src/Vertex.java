public class Vertex {

    private final int number;
    private int value;

    public int getNumber() {
        return number;
    }

    public int getValue() {
        return value;
    }

    public Vertex(int number) {
        this.number = number;
        this.value = Integer.MAX_VALUE;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "number=" + number +
                ", value=" + value +
                '}';
    }

}
