package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card.
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Maskeen Singh
 * @date 26 May 2023
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] hand = new Card[7];
        
        // Fill the hand with random cards
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            Random random = new Random();
            card.setValue(random.nextInt(13) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i] = card;
        }

        // Ask the user to pick a card
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick a card value (1-13): ");
        int value = scanner.nextInt();
        System.out.print("Pick a card suit (1-4): ");
        int suitIndex = scanner.nextInt() - 1;
        String suit = Card.SUITS[suitIndex];
        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(suit);

        // Search the hand for the user's card
        boolean found = false;
        for (Card card : hand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                found = true;
                break;
            }
        }

        if (found) {
            printInfo();
        } else {
            System.out.println("Sorry, your card is not in the hand.");
        }
    }

    /**
     * A simple method to print out personal information. Replace this information with your own.
     */
    private static void printInfo() {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        System.out.println("My name is Maskeen");
        System.out.println();
        System.out.println("My career ambitions:");
        System.out.println("-- I want to become a proficient programmer");
        System.out.println();
        System.out.println("My hobbies:");
        System.out.println("-- I love music as i play tabla.");
        //this comment was added on github
        //I am done
    }
}
