public class LeapYears {
    public static void main(String[] args) {
        int count = 0;
        for (int year = 101; year <= 2100; year++) {
            if (year % 4 == 0) {
                System.out.printf("%4d ", year);
                count = count + 1;
                if (count % 10 == 0) System.out.println();
            }
        }
        System.out.printf("\nTHE Total LEAP YEARS From 101 TO 2100 are : %d", count);
    }
}