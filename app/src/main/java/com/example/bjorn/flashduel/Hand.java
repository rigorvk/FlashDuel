package com.example.bjorn.flashduel;

import java.util.ArrayList;

/**
 * Created by Bjorn on 6/22/2016.
 */
public class Hand {

    private String handName;
    private ArrayList<Card> hand;

    public int getHandSize(){
        return hand.size();
    }

    public void addCardToHand(Card card){
        hand.add(card);
        card.setLocation(handName);
    }

    /** constructor **/
    public Hand(String handName){
        this.handName = handName;
        this.hand = new ArrayList<Card>();
    }



}
