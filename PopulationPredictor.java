import java.util.Scanner;

public class PopulationPredictor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int current = 312032786;
        System.out.println("   ---------------------");
        System.out.println("   PREDICTING POPULATION");
        System.out.println("   ---------------------");
        System.out.println("");
        System.out.println("Current Population is 312,032,786 ");
        System.out.print("For After how many Years you wanna predict Population : ");
        long years = input.nextInt();
        long births = years * 365 * 24 * 60 * 60 / 7;
        long deaths = years * 365 * 24 * 60 * 60 / 13;
        long immigrants = years * 365 * 24 * 60 * 60 / 45;
        System.out.printf("   Babies born in next %d years : %d \n", years, births);
        System.out.printf("   People Die in next %d years : %d \n", years, deaths);
        System.out.printf("   New Immigrants were added within %d years : %d \n", years, immigrants);
        System.out.printf("   Total Population after %d years will be : %d \n", years, current + immigrants);
    }
}