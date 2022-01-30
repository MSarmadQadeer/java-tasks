import java.util.Scanner;

public class StarsTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.print("Enter Rows : ");
        int len = input.nextInt();
        int n = 1;
        for (int i = 1; i <= len; i++, n++) {
            for (int j = 1; j <= len; j++) {
                if ((j >= n)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
