import java.util.Arrays;
import java.util.stream.Stream;

public class Main3 {

    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        Item[] items = {new Item("гитара", 1, 1500),
                new Item("бензопила", 4, 3000),
                new Item("ноутбук", 3, 2000)};
        Backpack[][] bp = new Backpack[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0 || j == 0) {
                    // Нулевая строка или нулевой столбец - заполняем их нулями
                    bp[i][j] = new Backpack(new Item[]{}, 0);
                } else if (i == 1) {
                    // Первая строка заполняется просто: первый предмет кладем или нет в
                    // зависимости от веса
                    bp[i][j] = items[0].getWeight() <= j ? new Backpack(new Item[]{items[0]}, items[0].getPrice())
                            : new Backpack(new Item[]{}, 0);
                } else {
                    if (items[i - 1].getWeight() > j) {
                        // Очередной предмет не влезает в рюкзак
                        bp[i][j] = bp[i - 1][j];    // записываем предыдущий максимум
                    } else {
                        // Рассчитаем цену очередного предмета + максимальную цену
                        int price = items[i - 1].getPrice() + bp[i - 1][j - items[i - 1].getWeight()].getPrice();
                        if (bp[i - 1][j].getPrice() > price) {
                            // Если предыдущий максимум больше нового
                            bp[i][j] = bp[i - 1][j]; // запишем его
                        } else {
                            // Фиксируем новый максимум
                            bp[i][j] = new Backpack(Stream.concat(Arrays.stream(new Item[]{items[i - 1]}),
                                    Arrays.stream(bp[i - 1][j - items[i - 1].getWeight()].getItems())).toArray(Item[]::new), price);
                        }
                    }
                }
            }
        }
        // Вывод результатов
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                System.out.print(bp[i][j].getDescription() + " ");
            }
            System.out.println();
        }
    }

}
