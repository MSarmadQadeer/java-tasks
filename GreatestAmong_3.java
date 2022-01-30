import java.util.Scanner;

public class GreatestAmong_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        double a = input.nextDouble();
        System.out.print("Enter Number : ");
        double b = input.nextDouble();
        System.out.print("Enter Number : ");
        double c = input.nextDouble();
        if ((a == b) & (b == c)) {
            System.out.print("All nos# are equal");
        } else if (a > b) {
            if (a > c) {
                System.out.print(a);
            } else {
                System.out.print(c);
            }
        } else if (b > c) {
            System.out.print(b);
        } else {
            System.out.print(c);
        }
    }
}