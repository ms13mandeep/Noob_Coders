package ca.sheridancollege.project;

/*
*CheckWinner.java
*Assigns random cards
*author: Priyanshu Patel, Mandeep Singh, Harriet Liwayan, Zhenqian Fan
*created date: 4 March 2022 
*modified Date: 17 April 2022
*/


import java.util.ArrayList;


public class CheckWinner extends Deck {
        private static boolean winner = true;
        private Player whoWon = new Player();
        private ArrayList<Card> player1Cards = new ArrayList<Card>();
        private ArrayList<Card> player2Cards = new ArrayList<Card>();
        
        public CheckWinner(){
            
        }
        
        /*
         * @return true or false
        */
	public boolean checkWinner(Player player1, Player player2) {
            //checks whether a winner is found of if the deck is empty
            
            player1Cards = player1.getCards();
            player2Cards = player2.getCards();
            
            if((player1Cards.get(0).getSuit() == player1Cards.get(1).getSuit()) && (player1Cards.get(1).getSuit()==player1Cards.get(2).getSuit())&& (player1Cards.get(2).getSuit()==player1Cards.get(3).getSuit())&& (player1Cards.get(3).getSuit()==player1Cards.get(4).getSuit()) ){
                setWinner(player1);
                return winner = false;
            }
            else if((player2Cards.get(0).getSuit() == player2Cards.get(1).getSuit()) && (player2Cards.get(1).getSuit()==player2Cards.get(2).getSuit())&& (player2Cards.get(2).getSuit()==player2Cards.get(3).getSuit())&& (player2Cards.get(3).getSuit()==player2Cards.get(4).getSuit()) ){
                setWinner(player2);
                return winner = false; 
            }
            
            return super.checkDeck();
	}
        
        /*
         * @return whoWon
        */
        public Player getWinner(){
            return whoWon;
        }
        
        /*
         * @return void
         * assign winning player to whoWon
        */
        public void setWinner(Player player){
            this.whoWon = player;
        }
}
