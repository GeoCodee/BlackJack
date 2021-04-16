/**
 * Assignment: Deliverable 3: Group 4
 * SYST17796
 * Description: Java program that models a game of blackjack using OOP.
 */
package ca.sheridancollege.project;


import java.util.ArrayList;
import java.util.Collections;


/**
 * A deck of 52 cards each with suit and value.
 */
public class Deck {
    // An arraylist that holds the cards of the deck
    private ArrayList<Card> cards = new ArrayList();
    
    public Deck() {
        this.cards = new ArrayList<Card>();
    }
    
    //A method to shuffle the deck
    public void shuffle() {
        Collections.shuffle(cards);
    }
    
    //A method to return the cards to the deck once the game is over
    public void moveToDeck() {
        for(Suit s: Suit.values()) {
            for(Value c: Value.values()) {
                this.cards.add(new Card(s, c));
            }
        }
    }
    
    // To add the cards to the deck
    public void createCards(Card cardAdded) {
        this.cards.add(cardAdded);
    }
    
    // To remove the cards from the deck
    public void removeCards(int index) {
        this.cards.remove(index);
    }
    
    // Get card from the deck
    public Card getCards(int index) {
        return this.cards.get(index);
    }
    
    // Get and remove a card from the deck
    public void drawFromDeck(Deck d) {
        this.cards.add(d.getCards(0));
        d.removeCards(0);
    }
    
    // Return the size of the deck
    public int deckSize() {
        return this.cards.size();
    }
    
    // Return the total value of the card based on the value and suit of the card
    public int cardsValue() {
        int totalValue = 0;

        for (Card card: this.cards) {
            
            if (card.getValue().equals("TWO")) {
                totalValue += 2;
            } else if (card.getValue().equals("THREE")) {
                totalValue += 3;
            } else if (card.getValue().equals("FOUR")) {
                totalValue += 4;
            } else if (card.getValue().equals("FIVE")) {
                totalValue += 5;
            } else if (card.getValue().equals("SIX")) {
                totalValue += 6;
            } else if (card.getValue().equals("SEVEN")) {
                totalValue += 7;
            } else if (card.getValue().equals("EIGHT")) {
                totalValue += 8;
            } else if (card.getValue().equals("NINE")) {
                totalValue += 9;
            } else if (card.getValue().equals("TEN")) {
                totalValue += 10;
            } else if (card.getValue().equals("JACK")) {
                totalValue += 10;
            } else if (card.getValue().equals("QUEEN")) {
                totalValue += 10;
            } else if (card.getValue().equals("KING")) {
                totalValue += 10;
            } else if (card.getValue().equals("ACE")) {
                totalValue += 11;
            }
 
        }
        return totalValue;

    }
    
    // Return a string of the list of cards
    public String toString() {
        String listOfCards = "";
    
        for(Card myCard: this.cards) {
            listOfCards = listOfCards + " " + myCard.toString();
            
        }
        return listOfCards;
    }
}

