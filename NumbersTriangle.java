public class NumbersTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int num = i;
            for (int j = 1; j <= i; j++, num--) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}