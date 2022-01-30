import java.util.Scanner;

public class CharacterCounter {

    public static int count(char[] chars, char ch) {
        return count(chars, ch, 0);
    }

    public static int count(char[] chars, char ch, int high) {
        if (high == chars.length) return 0;
        else if (chars[high] == ch) return 1 + count(chars, ch, high + 1);
        else return count(chars, ch, high + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String : ");
        String x = input.nextLine();
        char[] list = x.toCharArray();
        outer:
        for (int i = 0; i < list.length; i++) {
            if (String.valueOf(list[i]).equals(" ")) continue;
            for (int j = 0; j < i; j++) if (list[j] == list[i]) continue outer;
            System.out.printf("%s occurs %2d times \n", list[i], count(list, list[i]));
        }
    }
}