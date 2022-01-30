public class FindHypotenuse {

    public static double hypotenuse(double x, double y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public static void main(String[] args) {
        System.out.println(hypotenuse(3, 4));
        System.out.println(hypotenuse(5, 12));
        System.out.println(hypotenuse(8, 15));
    }
}