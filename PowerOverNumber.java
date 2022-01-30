import java.util.Scanner;

public class PowerOverNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x = input.nextInt();
        System.out.print("Enter Power: ");
        int y = input.nextInt();
        int a = 1;
        for (int z = 1; z <= y; z++) {
            a = a * x;
        }
        System.out.println(x + " Raised to Power " + y + " = " + a);
    }
}