package com.example.bjorn.flashduel;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Bjorn on 6/12/2016.
 */
public class Deck {

    private String deckName;    // internal name of the deck
    private String deckDisplayName;    // display name of the deck
    private ArrayList<Card> cardStack;   // the ordered list of cards in the deck, from the bottom up

    /** deck manipulation methods **/
    private void addCard(Card card) {
        cardStack.add(card);
        card.setLocation(deckName);
    }

    public Deck shuffleDeck(){
        Collections.shuffle(this.cardStack);
        return this;
    }

    public int getDeckSize(){
        return cardStack.size();
    }

    /** setup methods **/
    public static Deck makeNewDrawDeck(){

        Deck newDrawDeck = new Deck("drawdeck", "Draw Deck");

        int cardCount = 0;
        for (int i=1; i<6; i++){
            for (int j=1; j<11; j++){
                newDrawDeck.addCard(Card.makeNewCard(cardCount+1, Integer.toString(i), i));
                cardCount++;
            }
        }
        newDrawDeck.shuffleDeck();
        return newDrawDeck;
    }

    public static Deck makeNewDiscardPile(){
        return new Deck("discardpile", "Discard Pile");
    }

    /** private constructor **/
    private Deck(String deckName, String deckDisplayName){
        this.deckName = deckName;
        this.deckDisplayName = deckDisplayName;
        this.cardStack = new ArrayList<Card>();
    }

    /** toString **/
    @Override public String toString() {
        StringBuilder result = new StringBuilder();
        String NEW_LINE = System.getProperty("line.separator");

        result.append(this.getClass().getName() + " Object {" + NEW_LINE);
        result.append("    Name (internal): " + this.deckName + NEW_LINE);
        result.append("    Name (display): " + this.deckDisplayName + NEW_LINE);
        result.append("    # of cards: " + this.getDeckSize() + NEW_LINE);
        result.append("    Card Stack: " + this.cardStack + NEW_LINE);
        result.append("}");

        return result.toString();

    }
}
