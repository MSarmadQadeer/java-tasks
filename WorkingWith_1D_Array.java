import java.util.Scanner;

public class WorkingWith_1D_Array {

    public static int[] createArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int len = input.nextInt();
        int[] myList = new int[len];
        return myList;
    }

    public static void inputArray(int[] x) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < x.length; i++) {
            System.out.print("Enter value at " + i + " location: ");
            x[i] = input.nextInt();
        }
    }

    public static void displayArray(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "  ");
        }
    }

    public static int searchArray(int[] x, int y) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] == y) return i;
        }
        return -1;
    }

    public static int largestElement(int[] x) {
        int largest = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] > largest) largest = x[i];
        }
        return largest;
    }

    public static void smallestElement(int[] x) {
        int smallest = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] < smallest) smallest = x[i];
        }
        System.out.print("Smallest Element in [ ");
        displayArray(x);
        System.out.println("] is " + smallest);
    }

    public static int[] copyArray(int[] x) {
        int[] array = new int[x.length];
        for (int i = 0; i < x.length; i++) array[i] = x[i];
        return array;
    }

    public static void main(String[] args) {
        System.out.println("----------------------------------------");
        System.out.println("|        HERE THE MENU BEGINS          |");
        System.out.println("----------------------------------------");
        int[] myList = null;
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("1 : To create an Array");
            System.out.println("2 : To input Array values");
            System.out.println("3 : To display Array values");
            System.out.println("4 : To search element in an Array");
            System.out.println("5 : To find largest element in an Array");
            System.out.println("6 : To find smallest element in an Array");
            System.out.println("7 : To copy data to another Array");
            System.out.println("0 : To Exit");
            System.out.print("Enter a number from Menu: ");
            int option = input.nextInt();
            if (option == 0) break;
            switch (option) {
                case 1:
                    myList = createArray();
                    System.out.println();
                    System.out.println();
                    break;

                case 2:
                    inputArray(myList);
                    System.out.println();
                    System.out.println();
                    break;

                case 3:
                    displayArray(myList);
                    System.out.println();
                    System.out.println();
                    break;

                case 4:
                    System.out.print("Enter Key : ");
                    int key = input.nextInt();
                    int index = searchArray(myList, key);
                    if (index == -1) System.out.println(" NOT FOUND ");
                    else System.out.println(key + " is at Index: " + index);
                    System.out.println();
                    System.out.println();
                    break;

                case 5:
                    int lar = largestElement(myList);
                    System.out.print("Largest Element in [ ");
                    displayArray(myList);
                    System.out.println("] is " + lar);
                    System.out.println();
                    System.out.println();
                    break;

                case 6:
                    smallestElement(myList);
                    System.out.println();
                    System.out.println();
                    break;

                case 7:
                    int[] copy = copyArray(myList);
                    System.out.print("ORIGINAL   ");
                    displayArray(myList);
                    System.out.println();
                    System.out.print("COPIED   ");
                    displayArray(copy);
                    System.out.println();
                    System.out.println();
                    break;
            }
        }
    }
}