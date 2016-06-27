package com.example.bjorn.flashduel;

import java.util.ArrayList;

/**
 * Created by Bjorn on 6/22/2016.
 */
public class Hand {

    private String handName;
    private ArrayList<Card> hand;

    public void addCardToHand(Card card){
        hand.add(card);
        card.setLocation(handName);
    }

    public int getHandSize(){
        return hand.size();
    }

    public Card getCard(int i){
        return hand.get(i);
    }

    public ArrayList<Integer> getHandAsArrayList(){
        ArrayList<Integer> arrayToReturn = new ArrayList<>();
        for (int i = 0; i < getHandSize(); i++){
            arrayToReturn.add(getCard(i).getValue());
        }
        return arrayToReturn;
    }

    /** constructor **/
    public Hand(String handName){
        this.handName = handName;
        this.hand = new ArrayList<Card>();
    }

    /** toString **/
    @Override public String toString() {
        return String.valueOf(hand);
    }

    /** toString
    @Override public String toString() {
        StringBuilder result = new StringBuilder();
        String NEW_LINE = System.getProperty("line.separator");

        result.append(this.getClass().getName() + " Object {" + NEW_LINE);
        result.append("    Name (internal): " + this.handName + NEW_LINE);
        result.append("    # of cards: " + this.getHandSize() + NEW_LINE);
        result.append("    hand: " + this.hand + NEW_LINE);
        result.append("}");

        return result.toString();

    } **/

}
