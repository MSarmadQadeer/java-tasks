import java.util.Scanner;

public class PickNumbersPatternCard {
    public static void main(String[] args) {
        String[] ranks = {"Ace NumbersPattern", "Ace 2", "Ace 3", "Ace 4", "Ace 5", "Ace 6", "Ace 7", "Ace 8", "Ace 9", "Ace 10", "Jack", "Queen", "King"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        Scanner input = new Scanner(System.in);
        System.out.println("   ----------------------");
        System.out.println("   BE READY TO PICK A CARD");
        System.out.println("   ----------------------");
        System.out.print("Choose A Suit (1-4) : ");
        int suit = input.nextInt();
        System.out.print("Choose A Rank (1-13) : ");
        int rank = input.nextInt();
        System.out.printf("The card you picked is %s of %s", ranks[rank - 1], suits[suit - 1]);
    }
}