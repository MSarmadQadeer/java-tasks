public class Pyramid_Fixed {
    public static void main(String[] args) {
        int len = 8, r = 8, l = 8;
        for (int i = 1; i <= len; i++, r++, l--) {
            int num = 1;
            for (int j = 1; j <= (2 * len - 1); j++) {
                if (j >= l && j <= r) {
                    if (j <= 8 && j > l) num *= 2;
                    else if (j > 8) num /= 2;
                    System.out.printf("%4d", num);
                } else System.out.printf("%4s", " ");
            }
            System.out.println();
        }
    }
}