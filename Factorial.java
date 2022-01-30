import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x = input.nextInt();
        int a = 1;
        for (int z = 1; z <= (x); z++) {
            a = a * z;
        }
        System.out.println(x + " Factorial is =  " + a);
    }
}