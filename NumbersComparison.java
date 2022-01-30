import java.util.Scanner;

public class NumbersComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("|    ENTER THREE NUMBERS    |");
        System.out.println("-----------------------------");
        System.out.print("Enter any number: ");
        double a = input.nextDouble();
        System.out.print("Enter any number: ");
        double b = input.nextDouble();
        System.out.print("Enter any number: ");
        double c = input.nextDouble();
        if ((a == b) && (a == c)) {
            System.out.println("All NUMBERS ARE EQUAL");
        } else if ((a == b) || (a == c) || (b == c)) {
            System.out.println("TWO NUMBERS ARE EQUAL");
        } else {
            System.out.println("ALL NUMBERS ARE DIFFERENT");
        }
    }
}