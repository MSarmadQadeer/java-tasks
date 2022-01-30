public class NumbersTriangle_5 {
    public static void main(String[] args) {
        for (int i = 1, col = 9; i <= 9; i++, col--) {
            for (int j = 1, row = 9; j <= 9; j++, row--) {
                if (j >= col) System.out.print(row);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}