import java.util.Scanner;

public class SpeedCalculator_kmph {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("   ----------------------------");
        System.out.println("   SPEED IN KILOMETERS PER HOUR");
        System.out.println("   ----------------------------");
        System.out.print("Kindly Enter Distance in Miles: ");
        double miles = input.nextFloat();
        double kilometers = miles * 1.6;
        System.out.println("Enter Time: ");
        System.out.print("_   hrs \r");
        int hrs = input.nextInt();
        System.out.print("_   mins \r");
        int mins = input.nextInt();
        System.out.print("_   secs \r");
        int secs = input.nextInt();
        double time = hrs + (mins / 60.0) + (secs / 3600.0);
        System.out.printf("Dear Customer %.2f kmph is your Average Speed", (kilometers / time));
    }
}