package ca.sheridancollege.project;

/*
*Factory.java
*Assigns random cards
*author: Priyanshu Patel, Mandeep Singh, Harriet Liwayan, Zhenqian Fan
*created date: 4 March 2022 
*modified Date: 17 April 2022
*/


public class Factory {
    
    public Factory(){
        
    }
    
    /*
     * @return player
    */
    public static Player createPlayer(String type)
    {
        Player player = null;
        player = new Player(type);
        return player;
    }
    
}
