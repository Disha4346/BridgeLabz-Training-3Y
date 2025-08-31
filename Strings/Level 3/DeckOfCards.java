// L3-Q10: Deck of cards - init, shuffle, distribute
// File: DeckOfCards.java
import java.util.*;

public class DeckOfCards {

    public static String[] initDeck() {
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        int n = suits.length * ranks.length;
        String[] deck = new String[n];
        int k = 0;
        for (String s : suits) for (String r : ranks) deck[k++] = r + " of " + s;
        return deck;
    }

    public static void shuffle(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int j = i + (int)(Math.random() * (deck.length - i));
            String tmp = deck[i]; deck[i] = deck[j]; deck[j] = tmp;
        }
    }

    public static String[][] distribute(String[] deck, int nCards, int players) {
        if (nCards * players > deck.length) throw new IllegalArgumentException("Not enough cards to distribute.");
        String[][] table = new String[players][nCards];
        int idx = 0;
        for (int p = 0; p < players; p++) for (int c = 0; c < nCards; c++) table[p][c] = deck[idx++];
        return table;
    }

    public static void printPlayers(String[][] table) {
        for (int p = 0; p < table.length; p++) {
            System.out.println("Player " + (p+1) + ": " + java.util.Arrays.toString(table[p]));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of players: ");
        int players = sc.nextInt();
        System.out.print("Cards per player: ");
        int nCards = sc.nextInt();
        String[] deck = initDeck();
        shuffle(deck);
        String[][] dist = distribute(deck, nCards, players);
        printPlayers(dist);
        sc.close();
    }
}
