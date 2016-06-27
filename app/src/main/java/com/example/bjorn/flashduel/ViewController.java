package com.example.bjorn.flashduel;

import android.view.View;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Bjorn on 6/26/2016.
 */
public class ViewController {

    public Map<String,View> views = new HashMap<>(); // can't instantiate Map, use HashMap instead

    public void addView(String viewName, View view){
        views.put(viewName,view);
    }

    public TextView getTextView(String textViewName){
        return (TextView) views.get(textViewName);
    }

    public void setTextOfView(String textViewName,String text){
        getTextView(textViewName).setText(text);
    }

    /** constructor **/
    public ViewController() {
    }
}
