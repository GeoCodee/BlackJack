/**
 * Assignment: Deliverable 3: Group 4
 * SYST17796
 * Description: Java program that models a game of blackjack using OOP.
 */

package ca.sheridancollege.project;

/**
 * Class to represent a card in deck. Each card consist of a suit and a value.
 */
public class Card {

    private Suit suit;
    private Value value;

    public Card(Suit mySuit, Value myValue) {
        this.suit = mySuit;
        this.value = myValue;
    }

    public Value getValue() {
        return this.value;
    }

    public Suit getSuit() {
        return this.suit;
    }

    /**
     *@return a String representation of the card.
     */
    public String toString() {
        return this.value.toString() + " OF " + this.suit.toString();
    }

}
