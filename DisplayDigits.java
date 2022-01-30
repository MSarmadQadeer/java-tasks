import java.util.Scanner;

public class DisplayDigits {

    public static int quotient(int a, int b) {
        return a / b;
    }

    public static int remainder(int a, int b) {
        return a % b;
    }

    public static void displayDigits(int a) {
        int len = String.valueOf(a).length();
        int denominator = 1;
        for (int i = 1; i <= len - 1; i++) denominator *= 10;
        for (int i = denominator; i >= 10; i /= 10) {
            int val = quotient(a, i);
            a = remainder(a, i);
            System.out.print(val + "  ");
            if (i == 10) System.out.println(a);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Integer Number with more than 1 Digit: ");
        int num = input.nextInt();
        displayDigits(num);
    }
}