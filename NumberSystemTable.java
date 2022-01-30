public class NumberSystemTable {

    public static String binary(int a) {
        String binary = "";
        while (true) {
            binary = String.valueOf(a % 2) + binary;
            a /= 2;
            if (a == 0) break;
        }
        return binary;
    }

    public static String octal(int a) {
        String octal = "";
        while (true) {
            octal = String.valueOf(a % 8) + octal;
            a /= 8;
            if (a == 0) break;
        }
        return octal;
    }

    public static String hexadecimal(int a) {
        String hexa = "";
        while (true) {
            if (a % 16 == 10) hexa = "A" + hexa;
            else if (a % 16 == 11) hexa = "B" + hexa;
            else if (a % 16 == 12) hexa = "C" + hexa;
            else if (a % 16 == 13) hexa = "D" + hexa;
            else if (a % 16 == 14) hexa = "E" + hexa;
            else if (a % 16 == 15) hexa = "F" + hexa;
            else hexa = String.valueOf(a % 16) + hexa;
            a /= 16;
            if (a == 0) break;
        }
        return hexa;
    }

    public static void main(String[] args) {
        System.out.printf("%-7s | %-6s | %-5s | %-11s \n", "Decimal", "Binary", "Octal", "Hexadecimal");
        System.out.println("--------------------------------------");
        for (int i = 1; i <= 256; i++) {
            System.out.printf("%-7d | %-6s | %-5s | %-11s \n", i, binary(i), octal(i), hexadecimal(i));
        }
    }
}