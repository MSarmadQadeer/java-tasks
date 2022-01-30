import java.util.Scanner;

public class TuitionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int current = 10000;
        System.out.printf("\n The current tuition of a University is $%-6d \n", current);
        System.out.println(" | The Tuition is increasing at 5% Per Year |");
        System.out.println("----------------------------------------------");
        System.out.print("For After How Many Years You Wanna Calculate Tuition : ");
        int years = input.nextInt();
        for (int i = 1; i <= years; i++) {
            double increase = 0.05 * current;
            current = (int) (current + increase);
        }
        System.out.printf("Tuition After %d Years will be : %d", years, current);
    }
}