/**
 * Assignment: Deliverable 3: Group 4
 * SYST17796
 * Description: Java program that models a game of blackjack using OOP.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * A class representation of the player's hand
 */
public class Hand extends Deck{
    ArrayList<Card> hand;
    public Hand() {
        this.hand = new ArrayList<Card>();
    }

   
}
