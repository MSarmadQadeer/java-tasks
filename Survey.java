import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] scales = {"Awful", "Worse", "Very Poor", "Poor", "Below Average", "Average", "Above Average", "Good", "Very Good", "Excellent"};
        int[] num_scale = new int[10];
        for (int i = 0; i < num_scale.length; i++) {
            System.out.print("Rate the food quality in cafeteria 1-10 : ");
            num_scale[i] = input.nextInt();
        }
        System.out.println("\n--- RESULT of the POLL ---");
        for (int i = 0; i < scales.length; i++) {
            double count = 0;
            for (int j = 0; j < num_scale.length; j++) {
                if (num_scale[j] == i + 1) count++;
            }
            double pcent = (count / num_scale.length) * 100;
            System.out.printf("%-15s =  %4.0f Percent \n", scales[i], pcent);
        }
    }
} 