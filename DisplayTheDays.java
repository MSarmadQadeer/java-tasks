import java.util.Scanner;

public class DisplayTheDays {
    public static void main(String[] args) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Scanner input = new Scanner(System.in);
        System.out.println("   ----------------");
        System.out.println("   DISPLAY THE DAYS");
        System.out.println("   ----------------");
        System.out.print("   Choose Month (1-12) : ");
        int month = input.nextInt();
        System.out.print("   Enter Year : ");
        int year = input.nextInt();
        if ((month == 2) && (year % 4 == 0)) System.out.printf("   %s %d holds 29 Days", months[month - 1], year);
        else System.out.printf("   %s %d holds %d Days", months[month - 1], year, days[month - 1]);
    }
}