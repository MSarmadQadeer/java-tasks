public class RowColumnOnes {

    public static int[][] createList() {
        int[][] list = new int[6][6];
        for (int row = 0; row < list.length; row++) {
            for (int column = 0; column < list[row].length; column++) {
                int num = (int) (Math.random() * 2);
                list[row][column] = num;
            }
        }
        return list;
    }

    public static void displayList(int[][] list) {
        for (int row = 0; row < list.length; row++) {
            for (int column = 0; column < list[row].length; column++) {
                System.out.print(list[row][column] + "  ");
            }
            System.out.println();
        }
    }

    public static void rowOnes(int[][] list) {
        for (int row = 0; row < list.length; row++) {
            int countRow = 0;
            for (int column = 0; column < list[row].length; column++) {
                int num = list[row][column];
                if (num == 1) countRow += 1;
            }
            if (countRow == 0) ;
            else if (countRow % 2 == 0) System.out.printf("Row (%d) has EVEN 1's \n", row);
        }
    }

    public static void columnOnes(int[][] list) {
        for (int column = 0; column < list[0].length; column++) {
            int countColumn = 0;
            for (int row = 0; row < list.length; row++) {
                int num = list[row][column];
                if (num == 1) countColumn += 1;
            }
            if (countColumn == 0) ;
            else if (countColumn % 2 == 0) System.out.printf("Column (%d) has EVEN 1's \n", column);
        }
    }

    public static void main(String[] args) {
        int[][] list = createList();
        displayList(list);
        rowOnes(list);
        columnOnes(list);
    }
}