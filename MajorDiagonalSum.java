import java.util.Scanner;

public class MajorDiagonalSum {

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

    public static double sumMajorDiagonal(double[][] list) {
        double sum = 0;
        for (int i = 0; i < list[0].length; i++) {
            sum += list[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        double[][] Array = readList();
        double sum = sumMajorDiagonal(Array);
        System.out.println("Sum of major Diagonal is " + sum);
    }
}