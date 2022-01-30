import java.util.Scanner;

public class MatrixMultiplication {

    public static void displayList(double[][] list) {
        for (int row = 0; row < list.length; row++) {
            for (int column = 0; column < list[row].length; column++) {
                System.out.printf("%-6.1f   ", list[row][column]);
            }
            System.out.println();
        }
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

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] list = new double[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                int value = 0;
                for (int k = 0; k < a[0].length; k++) {
                    value += (a[i][k] * b[k][j]);
                }
                list[i][j] = value;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        double[][] Array1 = readList();
        double[][] Array2 = readList();
        double[][] A1_A2 = multiplyMatrix(Array1, Array2);
        System.out.println("\nMatrix 01");
        System.out.println("----------");
        displayList(Array1);
        System.out.println("\nMatrix 02");
        System.out.println("----------");
        displayList(Array2);
        System.out.println("\nProduct of Matrix 01 and Matrix 02");
        System.out.println("------------------------------------");
        displayList(A1_A2);
    }
}