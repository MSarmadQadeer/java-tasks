import java.util.Scanner;

public class Diamond_Variable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int len = input.nextInt();
        int right = len;
        int left = len;
        for (int i = 1; i <= len; right++, left--, i++) {
            for (int j = 1; j <= (2 * len - 1); j++) {
                if ((j >= left) && (j <= right)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        left += 2;
        right -= 2;
        for (; left <= right; left++, right--) {
            for (int k = 1; k <= (2 * len - 1); k++) {
                if ((k >= left) && (k <= right)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}