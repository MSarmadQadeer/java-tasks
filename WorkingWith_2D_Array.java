import java.util.Scanner;

public class WorkingWith_2D_Array {

    public static int[][] createArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int row = input.nextInt();
        System.out.print("Enter Columns : ");
        int column = input.nextInt();
        int[][] myList = new int[row][column];
        return myList;
    }

    public static void inputArray(int[][] x) {
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < x.length; row++) {
            for (int column = 0; column < x[0].length; column++) {
                System.out.print("Enter value at (ROW : " + row + " COLUMN : " + column + ") : ");
                x[row][column] = input.nextInt();
            }
        }
    }

    public static void displayArray(int[][] x) {
        for (int row = 0; row < x.length; row++) {
            for (int column = 0; column < x[0].length; column++) {
                System.out.printf("%-5d", x[row][column]);
            }
            System.out.println();
        }
    }

    public static int Sum(int[][] x) {
        int sum = 0;
        for (int row = 0; row < x.length; row++) {
            for (int column = 0; column < x[0].length; column++) {
                sum += x[row][column];
            }
        }
        return sum;
    }

    public static void rowWiseSum(int[][] x) {
        for (int row = 0; row < x.length; row++) {
            int sum = 0;
            for (int column = 0; column < x[0].length; column++) {
                sum += x[row][column];
            }
            System.out.println("Sum of Row(" + row + ") = " + sum);
        }
    }

    public static void columnWiseSum(int[][] x) {
        for (int column = 0; column < x[0].length; column++) {
            int sum = 0;
            for (int row = 0; row < x.length; row++) {
                sum += x[row][column];
            }
            System.out.println("Sum of Column(" + column + ") = " + sum);
        }
    }

    public static void swapArray(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a[0].length];
        int[][] d = new int[b.length][b[0].length];
        for (int i = 0; i < a.length; i++) c[i] = a[i];
        for (int i = 0; i < a.length; i++) d[i] = b[i];
        for (int i = 0; i < a.length; i++) a[i] = d[i];
        for (int i = 0; i < a.length; i++) b[i] = c[i];
    }

    public static void main(String[] args) {
        System.out.println("-------------------------------------------");
        System.out.println("|        HERE THE 2D MENU BEGINS          |");
        System.out.println("-------------------------------------------");
        int[][] myList = new int[1][1];
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("1 : To create a 2D Array");
            System.out.println("2 : To input Array values");
            System.out.println("3 : To display Array values");
            System.out.println("4 : To display Sum of Array");
            System.out.println("5 : To display Row wise Sum");
            System.out.println("6 : To display Column wise Sum");
            System.out.println("7 : To Swap Two Array");
            System.out.println("0 : To Exit");
            System.out.print("Enter a number from Menu: ");
            int option = input.nextInt();
            if (option == 0) break;
            switch (option) {
                case 1 -> {
                    myList = createArray();
                    System.out.println();
                    System.out.println();
                }
                case 2 -> {
                    inputArray(myList);
                    System.out.println();
                    System.out.println();
                }
                case 3 -> {
                    displayArray(myList);
                    System.out.println();
                    System.out.println();
                }
                case 4 -> {
                    int sum = Sum(myList);
                    System.out.println(sum);
                    System.out.println();
                    System.out.println();
                }
                case 5 -> {
                    rowWiseSum(myList);
                    System.out.println();
                    System.out.println();
                }
                case 6 -> {
                    columnWiseSum(myList);
                    System.out.println();
                    System.out.println();
                }
                case 7 -> {
                    int[][] a1 = createArray();
                    inputArray(a1);
                    int[][] a2 = createArray();
                    inputArray(a2);
                    System.out.println("Array 1: ");
                    displayArray(a1);
                    System.out.println("Array 2: ");
                    displayArray(a2);
                    swapArray(a1, a2);
                    System.out.println();
                    System.out.println("Array 1: ");
                    displayArray(a1);
                    System.out.println("Array 2: ");
                    displayArray(a2);
                    System.out.println();
                    System.out.println();
                }
            }
        }
    }
}