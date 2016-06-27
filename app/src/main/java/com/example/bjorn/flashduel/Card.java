package com.example.bjorn.flashduel;

/**
 * Created by Bjorn on 6/12/2016.
 */
public class Card {

    private int id;             // internal id for card
    private String name;        // in-game name of card
    private int value;          // number value of card (1-5)
    private String location;    // where in play is the card?

    public void setLocation(String newLocation){
        this.location = newLocation;
    }

    public static Card makeNewCard(int id, String name, int value){
        return new Card(id, name, value);
    }

    public int getValue(){
        return this.value;
    }

    /** constructor, no location **/
    private Card(int id, String name, int value) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.location = "none";
    }

    /** constructor **/
    private Card(int id, String name, int value, String location) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.location = location;
    }

    /** toString **/
    @Override public String toString() {
        return String.valueOf(this.value); // just return the value of the card, mostly for Deck.toString()
    }
}
