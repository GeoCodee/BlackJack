/**
 * Assignment: Deliverable 3: Group 4
 * SYST17796
 * Description: Java program that models a game of blackjack using OOP.
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 * Main class that models the game of Blackjack.
 * Player is given two cards and asked to hit or stand
 * based on the value of their hand as well as shown the hand
 * of the dealer. If the player hits 21 they win, over they bust.
 * If they have higher value than the dealer than they win, otherwise they lose.
 */
public class Game {
   public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       // Create the deck of cards for the game and return all cards from previous game
       Deck deck = new Deck();
       deck.moveToDeck();
       deck.shuffle();
       // Create the players hand and the dealer's hand
       Hand playersHand = new Hand();
       Dealer dealersHand = new Dealer();
       
       System.out.println("The Blackjack Game");
       System.out.println("*-----------------------------------------*");
       System.out.println("You will be delt two cards to begin\n"
               + "after which you will have the choice\n"
               + "to hit or stand. Go over 21 and you bust.");
       System.out.println("*-----------------------------------------*");
       
       // Deal two cards to the player
       for (int i = 0; i <= 1; i++) {
           playersHand.drawFromDeck(deck);
       }
       // Deal two cards to the dealer
       for (int i = 0; i <= 1; i++) {
           dealersHand.drawFromDeck(deck);
       }
       
       // Loop to deal cards
       while(true) {
           // Player is given their hand along with the value of their cards and
           // the dealers hand
           System.out.println("Your hand is: ");
           System.out.println(playersHand.toString());
           System.out.println("TOTAL VALUE: " + playersHand.cardsValue());
           System.out.println("Dealer's Hand: " + dealersHand.getCards(0).toString());
           // Player is given the option to either hit or stand
           System.out.println("Hit or Stand:");
           if (sc.nextLine().equalsIgnoreCase("hit")) {
               playersHand.drawFromDeck(deck);
               System.out.println("You drew: " + playersHand.getCards(playersHand.deckSize()-1).toString());
               if(playersHand.cardsValue() > 21) {
                   System.out.println("You bust :(");
                   break;
               }
           // Else if response is to stand
           } else {
               break;
           }
       }
       // Show the dealer's hand to the player
       System.out.println("Dealer Cards: " + dealersHand.toString());
       
       // Check if the value of the dealer's hand is higher than the player's
       if((dealersHand.cardsValue() > playersHand.cardsValue())) {
           System.out.println("Dealer Wins");
       }
       
       // Check if the value of the player's hand is higher than the dealer's
       if((playersHand.cardsValue() > dealersHand.cardsValue())) {
           System.out.println("You win");
       }
       
       System.out.println("Game over");
       // Return the player and dealer's cards to the deck.
       playersHand.moveToDeck();
       dealersHand.moveToDeck();
       
   }
}
