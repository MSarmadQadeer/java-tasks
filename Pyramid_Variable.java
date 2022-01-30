import java.util.Scanner;

public class Pyramid_Variable {
    public static void main(String[] args) {
        System.out.print("   ENTER LENGTH OF PYRAMID : ");
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        for (int row = 1, left = len, right = len; row <= len; row++, left--, right++) {
            int num = 1;
            for (int column = 1; (column <= right); column++) {
                if ((column == left) || (column == right)) {
                    num = 1;
                    System.out.printf("%4d", num);
                } else if ((column > left) && (column <= len)) {
                    num = num * 2;
                    System.out.printf("%4d", num);
                } else if ((column < right) && (column > len)) {
                    num = num / 2;
                    System.out.printf("%4d", num);
                } else System.out.printf("%4s", " ");
            }
            System.out.println();
        }
    }
}
