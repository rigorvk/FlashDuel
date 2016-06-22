package com.example.bjorn.flashduel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupNewGame();
    }

    private void setupNewGame() {

        // make two players
        Player player1 = Player.createNewPlayer("player1", "Player 1", 1);
        Player player2 = Player.createNewPlayer("player2", "Player 2", 2);
        // System.out.println(player1.toString());
        // System.out.println(player2.toString());

        // make the decks
        Deck drawDeck = Deck.makeNewDrawDeck();
        System.out.println(drawDeck.toString());

        // draw initial hands

    }

}