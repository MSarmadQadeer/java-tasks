import java.util.Scanner;

public class Fibonacci {
    public static void fibonacci(int num) {
        int a = 0;
        int b = 1;
        System.out.print(a + "  " + b + "  ");
        for (int count = 3; count <= num; count++) {
            int c = a + b;
            System.out.print(c + "  ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Terms Count : ");
        int num = input.nextInt();
        fibonacci(num);
    }
}