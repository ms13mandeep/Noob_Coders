
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
* The class that models your game. You should create a more specific
* child of this class and instantiate the methods given.
* @author dancye, 2018
* Game.java
* gets/sets players, plays the game, declares winner
*author: Priyanshu Patel, Mandeep Singh, Harriet Liwayan, Zhenqian Fan
*created date: 4 March 2022 
*modified Date: 17 April 2022
*/

public abstract class Game 
{
    private final String gameName;//the title of the game
    private ArrayList <Player> players;// the players of the game
    
    public Game(){
        gameName = "";
    }
    public Game(String givenName)
    {
        gameName = givenName;
        players = new ArrayList();
    }

    /**
     * @return the gameName
     */
    public String getGameName() 
    {
        return gameName;
    }
    
     /**
     * @return the players of this game
     */
    public ArrayList <Player> getPlayers() 
    {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList <Player> players) 
    {
        this.players = players;
    }
    /**
     * Play the game. This might be one method or many method calls depending
     * on your game.
     */
    public abstract void declareWinner();

   
    
}//end class
