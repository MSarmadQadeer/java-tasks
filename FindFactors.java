public class FindFactors {

    public static boolean isPerfect(int a) {
        int num = 0;
        for (int i = 1; i <= (a / 2); i++) if (a % i == 0) num += i;
        if (a == num) return true;
        else return false;
    }

    public static String generateFactors(int a) {
        String factors = "";
        for (int i = 1; i <= (a / 2); i++) if (a % i == 0) factors += String.valueOf(i) + "  ";
        return factors;
    }

    public static void main(String[] args) {
        System.out.printf("%-23s | %-8s", "List Of PERFECT Numbers", "Factors");
        System.out.println();
        System.out.println("----------------------------------");
        for (int i = 1; i <= 1000; i++) if (isPerfect(i)) System.out.printf("%-23d | %s \n", i, generateFactors(i));
    }
}