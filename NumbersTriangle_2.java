public class NumbersTriangle_2 {
    public static void main(String[] args) {
        int row = 1;
        for (int i = 1; i <= 5; i++) {
            int num = 1;
            for (int j = 1; j <= row; j++, num++) {
                System.out.print(num);
            }
            row += 2;
            System.out.println();
        }
    }
}