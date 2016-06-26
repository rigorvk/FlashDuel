package com.example.bjorn.flashduel;

/**
 * Created by Bjorn on 6/22/2016.
 */
public class Game {

    private Player player1;
    private Player player2;
    private Player activePlayer;
    private Deck drawDeck;
    private Deck discardPile;

    public void runGame(){

    }

    private void setupNewGame(){

        // make two players
        player1 = Player.createNewPlayer("player1", "Player 1", 1);
        player2 = Player.createNewPlayer("player2", "Player 2", 2);
        // System.out.println(player1.toString());
        // System.out.println(player2.toString());

        // make the decks
        drawDeck = Deck.makeNewDrawDeck();
        discardPile = Deck.makeNewDiscardPile();
        System.out.println(drawDeck.toString());
        System.out.println(discardPile.toString());

        // draw initial hands

    }


}
