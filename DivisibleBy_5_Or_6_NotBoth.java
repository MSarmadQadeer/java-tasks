public class DivisibleBy_5_Or_6_NotBoth {
    public static void main(String[] args) {
        System.out.println("---------------------------------------");
        System.out.println("|  Divisible By 5 OR 6 BUT NOT BOTH   |");
        System.out.println("---------------------------------------");
        for (int num = 100, count = 0; num <= 200; num++) {
            if ((num % 5 == 0) ^ (num % 6 == 0)) {
                System.out.print(num + " ");
                count = count + 1;
                if (count % 10 == 0) System.out.println();
            }
        }
    }
}