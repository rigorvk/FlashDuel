package com.example.bjorn.flashduel;

import java.util.ArrayList;

/**
 * Created by Bjorn on 6/22/2016.
 */
public class Game {

    private Player player1;
    private Player player2;
    private Player activePlayer;
    private Deck drawDeck;
    private Deck discardPile;
    private ViewController vc;

    public void setUpGame(){
        // make two players
        player1 = Player.createNewPlayer("player1", "Player 1", 1);
        player2 = Player.createNewPlayer("player2", "Player 2", 2);
        // System.out.println(player1.toString());
        // System.out.println(player2.toString());

        // make the decks
        drawDeck = Deck.makeNewDrawDeck();
        discardPile = Deck.makeNewDiscardPile();
        // System.out.println(drawDeck.toString());
        // System.out.println(discardPile.toString());

        // draw initial hands
        player1.drawUp(drawDeck);
        player2.drawUp(drawDeck);
        System.out.println(player1.toString());
        System.out.println(player2.toString());
        System.out.println(drawDeck.toString());

        updateViews();
        //

    }

    public void runGame(){

    }

    private void updateViews(){

        // player 1 hand
        ArrayList<Integer> player1Hand = player1.getHandAsArrayList();
        vc.setTextOfView("pos1_cardslot1", player1Hand.get(0).toString());
        vc.setTextOfView("pos1_cardslot2", player1Hand.get(1).toString());
        vc.setTextOfView("pos1_cardslot3", player1Hand.get(2).toString());
        vc.setTextOfView("pos1_cardslot4", player1Hand.get(3).toString());
        vc.setTextOfView("pos1_cardslot5", player1Hand.get(4).toString());

    }

    public Game(ViewController viewController){
        vc = viewController;
    }

}
