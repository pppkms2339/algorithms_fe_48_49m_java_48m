import java.util.Arrays;
import java.util.stream.Collectors;

public class Backpack {

    private Item[] items;
    private int price;

    public Backpack(Item[] items, int price) {
        this.items = items;
        this.price = price;
    }

    public Item[] getItems() {
        return items;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        if (items == null || items.length == 0) {
            return "";
        }
        String s = Arrays.stream(items).map(Item::getName).collect(Collectors.joining("+")) + "-" + getPrice();
        return s;
    }

}
