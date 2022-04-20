package ca.sheridancollege.project;

/*
*AssignCards.java
*Assigns random cards
*author: Priyanshu Patel, Mandeep Singh, Harriet Liwayan, Zhenqian Fan
*created date: 4 March 2022 
*modified Date: 17 April 2022
*/


public class Card {
        //enums for card value and suits
	public enum Values{
		ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING;
	}
	public enum Suits{
		HEART,DIAMOND,SPADES,CLUBS;
	}
	
        //instance variable
	private final Values value;
	private final Suits suit;
	
        //constructors
	public Card(Card.Suits s, Card.Values v) {
		this.value = v;
		this.suit = s;
	}
	public Card() {
		this.value=null;
		this.suit=null;
	}
        
        /*
        *@return the value
        */
	public Values getValue(){
		
		return this.value;
	}
        
        /*
        *@return the suit
        */
	public Suits getSuit() {
		return this.suit;
	}
        
        //Overriding the default toString() method
        @Override
	public String toString() {
		return (getValue() + "     " + getSuit());
	}
}

