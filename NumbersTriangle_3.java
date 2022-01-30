public class NumbersTriangle_3 {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++, num++) {
                System.out.printf("%-3d", num);
            }
            System.out.println();
        }
    }
}