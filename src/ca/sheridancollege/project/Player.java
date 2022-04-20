package ca.sheridancollege.project;

/*
*Player.java
*Player class with player name and initial hand of cards
*Assigns random cards
*author: Priyanshu Patel, Mandeep Singh, Harriet Liwayan, Zhenqian Fan
*created date: 4 March 2022 
*modified Date: 17 April 2022
*/

import java.util.ArrayList;



public class Player extends Game{
	
	private String playerName;
	private ArrayList<Card> cards = new ArrayList<>();
        
        public Player(){
            super();
        }
	public Player(String playerName) {
                super(playerName);
		this.playerName = playerName;
	}
	
        /*
         * @return cards
        */
	public ArrayList<Card> getCards() {
		return cards;
	}
	
        /*
         * @return void
         * sets playerName
        */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
        
        /*
         * @return playerName
        */
        public String getPlayerName() {
            return this.playerName;
        }
        
        /*
         * @return void
         * set cards
        */
	public void setCards(ArrayList<Card> cards){
		this.cards = cards;
	}
        
        //prints the cards to console
	public void printCards() {
		for(int i=0; i<cards.size();i++) {
			//System.out.println("Card "+(i+1)+": "+cards[i].getValue()+ "     "+cards[i].getSuit());
                    System.out.println("Card "+(i+1)+": "+cards.get(i).getValue()+ "     "+cards.get(i).getSuit());    
                }
        }
        
        /*
         * @return void
         * changes cards
        */
        public void changeCard(Card card, int index){
            cards.set(index, card);
        }
    
    //overriding the declareWinner() method in Game    
    @Override
    public void declareWinner() {
        System.out.println("Congratulations "+this.playerName+" has won the game with");
        printCards();
    }
}
