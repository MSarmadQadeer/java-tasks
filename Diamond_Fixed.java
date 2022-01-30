public class Diamond_Fixed {
    public static void main(String[] args) {
        int len = 5;
        int right = len;
        int left = len;
        for (int i = 1; i <= len + 1; right++, left--, i++) {
            for (int j = 1; j <= (2 * len - 1); j++) {

                if (left == 0) {
                    left += 2;
                    right -= 2;
                    for (; left <= right; left++, right--) {
                        for (int k = 1; k <= (2 * len - 1); k++) {
                            if ((k >= left) && (k <= right)) System.out.print("*");
                            else System.out.print(" ");
                        }
                        System.out.println();
                    }
                } else if ((j >= left) && (j <= right)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}