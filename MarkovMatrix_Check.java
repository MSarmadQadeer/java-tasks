import java.util.Scanner;

public class MarkovMatrix_Check {

    /*
    An n * n matrix is called a positive Markov matrix if each element is positive
    and the sum of the elements in each column is 1.
     */

    public static boolean isMarkovMatrix(double[][] list) {
        for (int i = 0; i < list[0].length; i++) {
            double sum = 0;
            for (int j = 0; j < list.length; j++) {
                sum += list[j][i];
                if (list[j][i] < 0) return false;
            }
            if (sum != 1) return false;
        }
        return true;
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

    public static void main(String[] args) {
        double[][] list = readList();
        boolean property = isMarkovMatrix(list);
        if (property) System.out.println("It is a Markov matrix");
        else System.out.println("It is not a Markov matrix");
    }
}