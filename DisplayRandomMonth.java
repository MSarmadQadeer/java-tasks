public class DisplayRandomMonth {
    public static void main(String[] args) {
        System.out.println("   --------------------");
        System.out.println("   DISPLAY RANDOM MONTH");
        System.out.println("   --------------------");
        int num = (int) (Math.random() * 12) + 1;
        switch (num) {
            case 1 -> System.out.println("\t January");
            case 2 -> System.out.println("\t February");
            case 3 -> System.out.println("\t March");
            case 4 -> System.out.println("\t April");
            case 5 -> System.out.println("\t May");
            case 6 -> System.out.println("\t June");
            case 7 -> System.out.println("\t July");
            case 8 -> System.out.println("\t August");
            case 9 -> System.out.println("\t September");
            case 10 -> System.out.println("\t October");
            case 11 -> System.out.println("\t November");
            case 12 -> System.out.println("\t December");
        }
    }
}