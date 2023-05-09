public class Main3 {

    public static void main(String[] args) {
        int[][] field = new int[8][8];
        ArrayStack queenRow = new ArrayStack(8);
        ArrayStack queenColumn = new ArrayStack(8);
        int row = 0, column = 0;
        boolean f;
        int count = 0;
        while (row < 8) {
            f = false;
            while (column < 8) {
                if (field[row][column] == 0) {
                    // Это поле свободно, ставим туда ферзя
                    addQueen(row, column, field);
                    queenRow.push(row);
                    queenColumn.push(column);
                    f = true;
                    break;
                }
                column++;
            }
            if (!f) {
                // Ферзя в текущей строке поставить не удалось
                // Снять последнего ферзя
                row = queenRow.pop();
                column = queenColumn.pop();
                removeQueen(row, column, field);
                count++;    // счетчик того, сколько раз мы "снимаем" ферзя с доски и делаем ход назад
                column++;
            } else {
                // Ферзя в текущей строке удалось поставить
                // Проверим, а не поставили ли мы все 8 ферзей
                if (queenRow.size() == 8) {
                    // Выходим - алгоритм закончен
                    break;
                }
                // Ферзей стоит на поле меньше 8, значит идем на след. строку
                row++;
                column = 0;
            }
        }
        // Вывод результатов
        while (!queenRow.isEmpty()) {
            System.out.println(queenRow.pop() + ", " + queenColumn.pop());
        }
        System.out.println(count);
    }

    private static void addQueen(int row, int column, int[][] field) {
        for (int i = 0; i < 8; i++) {
            field[row][i]++;
            field[i][column]++;
        }
        // Заполняем поля вправо вниз от row, column;
        int i = row, j = column;
        while (i < 8 && j < 8) {
            field[i][j]++;
            i++;
            j++;
        }
        // Заполняем поля влево вниз от row, column;
        i = row;
        j = column;
        while (i < 8 && j >= 0) {
            field[i][j]++;
            i++;
            j--;
        }
        // Заполняем поля влево вверх от row, column;
        i = row;
        j = column;
        while (i >= 0 && j >= 0) {
            field[i][j]++;
            i--;
            j--;
        }
        // Заполняем поля вправо вверх от row, column;
        i = row;
        j = column;
        while (i >= 0 && j < 8) {
            field[i][j]++;
            i--;
            j++;
        }
        field[row][column] = -1;
    }

    private static void removeQueen(int row, int column, int[][] field) {
        for (int i = 0; i < 8; i++) {
            field[row][i]--;
            field[i][column]--;
        }
        // Заполняем поля вправо вниз от row, column;
        int i = row, j = column;
        while (i < 8 && j < 8) {
            field[i][j]--;
            i++;
            j++;
        }
        // Заполняем поля влево вниз от row, column;
        i = row;
        j = column;
        while (i < 8 && j >= 0) {
            field[i][j]--;
            i++;
            j--;
        }
        // Заполняем поля влево вверх от row, column;
        i = row;
        j = column;
        while (i >= 0 && j >= 0) {
            field[i][j]--;
            i--;
            j--;
        }
        // Заполняем поля вправо вверх от row, column;
        i = row;
        j = column;
        while (i >= 0 && j < 8) {
            field[i][j]--;
            i--;
            j++;
        }
        field[row][column] = 0;
    }

}
