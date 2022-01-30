import java.util.Scanner;

public class SortRows {

    public static double[][] sortRows(double[][] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                for (int k = j; k < list[0].length; k++) {
                    if (list[i][j] > list[i][k]) {
                        double a = list[i][j];
                        list[i][j] = list[i][k];
                        list[i][k] = a;
                    }
                }
            }
        }
        return list;
    }

    public static double[][] readList() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int rows = input.nextInt();
        System.out.print("Enter Columns: ");
        int columns = input.nextInt();
        double[][] list = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter value in Row:" + i + " Column:" + j + "  : ");
                list[i][j] = input.nextDouble();
            }
        }
        return list;
    }

    public static void displayList(double[][] list) {
        for (int row = 0; row < list.length; row++) {
            for (int column = 0; column < list[row].length; column++) {
                System.out.printf("%-6.1f   ", list[row][column]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        double[][] list = readList();
        sortRows(list);
        displayList(list);
    }
}