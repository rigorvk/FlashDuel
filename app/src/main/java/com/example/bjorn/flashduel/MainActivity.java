package com.example.bjorn.flashduel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // create ViewController
        ViewController vc = createViewController();


        Game game = new Game(vc);
        game.setUpGame();
    }

    private ViewController createViewController(){

        ViewController vc = new ViewController();
        System.out.println(vc.toString());

        TextView pos1_cardslot1 = (TextView) findViewById(R.id.pos1_cardslot1);
        TextView pos1_cardslot2 = (TextView) findViewById(R.id.pos1_cardslot2);
        TextView pos1_cardslot3 = (TextView) findViewById(R.id.pos1_cardslot3);
        TextView pos1_cardslot4 = (TextView) findViewById(R.id.pos1_cardslot4);
        TextView pos1_cardslot5 = (TextView) findViewById(R.id.pos1_cardslot5);
        TextView pos2_cardslot1 = (TextView) findViewById(R.id.pos2_cardslot1);
        TextView pos2_cardslot2 = (TextView) findViewById(R.id.pos2_cardslot2);
        TextView pos2_cardslot3 = (TextView) findViewById(R.id.pos2_cardslot3);
        TextView pos2_cardslot4 = (TextView) findViewById(R.id.pos2_cardslot4);
        TextView pos2_cardslot5 = (TextView) findViewById(R.id.pos2_cardslot5);

        vc.addView("pos1_cardslot1",pos1_cardslot1);
        vc.addView("pos1_cardslot2",pos1_cardslot2);
        vc.addView("pos1_cardslot3",pos1_cardslot3);
        vc.addView("pos1_cardslot4",pos1_cardslot4);
        vc.addView("pos1_cardslot5",pos1_cardslot5);
        vc.addView("pos2_cardslot1",pos2_cardslot1);
        vc.addView("pos2_cardslot2",pos2_cardslot2);
        vc.addView("pos2_cardslot3",pos2_cardslot3);
        vc.addView("pos2_cardslot4",pos2_cardslot4);
        vc.addView("pos2_cardslot5",pos2_cardslot5);

        //vc.getTextView("pos1_cardslot1").setText("HI");

        return vc;
    }

}