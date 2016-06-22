package com.example.bjorn.flashduel;

/**
 * Created by Bjorn on 6/12/2016.
 */
public class Player {

    private String name;
    private String displayName;
    private int position;
    private boolean isActive;
    private int numWins;
    private int numLosses;

    /** methods **/
    public void drawCard(){

    }

    public void discardCard(){

    }

    public static Player createNewPlayer(String name, String displayName, int position){
        return new Player(name, displayName, position);
    }

    /** private constructors **/

    private Player(String name, String displayName, int position, int numWins, int numLosses) {
        this.name = name;
        this.displayName = displayName;
        this.position = position;
        this.numWins = numWins;
        this.numLosses = numLosses;
    }

    private Player(String name, String displayName, int position) {
        this.name = name;
        this.displayName = displayName;
        this.position = position;
        this.numWins = 0;
        this.numLosses = 0;
    }

    private Player() {
        this.name = "defaultname";
        this.displayName = "Default Name";
        this.numWins = 0;
        this.numLosses = 0;
    }

    /** getters and setters **/

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getNumWins() {
        return numWins;
    }

    public void setNumWins(int numWins) {
        this.numWins = numWins;
    }

    public int getNumLosses() {
        return numLosses;
    }

    public void setNumLosses(int numLosses) {
        this.numLosses = numLosses;
    }

    /** toString **/
    @Override public String toString() {
        StringBuilder result = new StringBuilder();
        String NEW_LINE = System.getProperty("line.separator");

        result.append(this.getClass().getName() + " Object {" + NEW_LINE);
        result.append("    Name (internal): " + this.name + NEW_LINE);
        result.append("    Name (display): " + this.displayName + NEW_LINE);
        result.append("    Position: " + this.position + NEW_LINE );
        result.append("    Is Active?: " + this.isActive + NEW_LINE);
        result.append("    # of wins: " + this.numWins + NEW_LINE);
        result.append("    # of losses: " + this.numLosses + NEW_LINE);
        result.append("}");

        return result.toString();
    }
}
