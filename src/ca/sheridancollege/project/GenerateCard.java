package ca.sheridancollege.project;

/*
*GenerateCard.java
*Assigns random cards
*author: Priyanshu Patel, Mandeep Singh, Harriet Liwayan, Zhenqian Fan
*created date: 4 March 2022 
*modified Date: 17 April 2022
*/

public class GenerateCard {

	private static int counter = 0;
	private static Card[] cards = new Card[Card.Suits.values().length*Card.Values.values().length];
	
        public GenerateCard(){
            
        }
        
        //generates cards
	public static void generateCards() {
		
		for(Card.Suits s: Card.Suits.values()) {
			
			for(Card.Values v : Card.Values.values()) {
				
				cards[counter] = new Card(s,v);
				counter++;
			}
		}
	}
	
        /*
         * @return cards
        */
	public static Card[] getCards() {
		return cards;
	}
}

