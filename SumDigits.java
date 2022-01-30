import java.util.Scanner;

public class SumDigits {

    public static int sumDigits(long n) {
        int len = String.valueOf(n).length();
        if (len == 1) return (int) n;
        int d = 1;
        for (int i = 1; i < len; i++) d *= 10;
        return (int) n / d + sumDigits(n % d);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int x = input.nextInt();
        int sum = sumDigits(x);
        System.out.printf("Digit Sum of %d is %2d", x, sum);
    }
}