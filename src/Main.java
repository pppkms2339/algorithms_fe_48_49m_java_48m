public class Main {
    public static void main(String[] args) {
        int n = 4, m = 5;
        int[][] array = new int[n][m];
        // Заполнение нулевой строки единицами
        for (int i = 0; i < m; i++) {
            array[0][i] = 1;
        }
        // Заполнение нулевого столбца единицами
        for (int i = 0; i < n; i++) {
            array[i][0] = 1;
        }
        // Заполнение остальных элементов
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                // Все остальные ячейки заполняем по формуле
                array[i][j] = array[i - 1][j] + array[i][j - 1];
            }
        }
        // Вывод
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}