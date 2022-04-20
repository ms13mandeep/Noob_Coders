package ca.sheridancollege.project;

/*
*Advances the game by giving the player a choice to able to swap a card if they choose to do so 
*PickOneCard,java
*Assigns random cards
*author: Priyanshu Patel, Mandeep Singh, Harriet Liwayan, Zhenqian Fan
*created date: 4 March 2022 
*modified Date: 17 April 2022
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class PickOneCard extends Deck{

    
    private Card card= new Card(); 
    private int randomNumber;
    private Scanner input = new Scanner(System.in);
    private String choice;
    
    public PickOneCard(){
        
    }
    
    /*
     * @return void
     * continues the game by giving the player a choice to be able to swap a card
    */
    public void getCard(Player player) {
	randomNumber = (int)(Math.random()*(Card.Values.values().length * Card.Suits.values().length));
        card = super.getCards().get(randomNumber);
        while(card.getValue()==null || card.getSuit()==null){
            randomNumber = (int)(Math.random()*(Card.Values.values().length * Card.Suits.values().length));
            card = super.getCards().get(randomNumber);
        }
        super.getCards().set(randomNumber, new Card());
        System.out.println("For  "+player.getPlayerName());
        player.printCards();
        System.out.println("You got "+card.getValue()+"     "+card.getSuit());
        System.out.println("Would you like to change the card ?(yes/no)");

        
        
            choice = input.next();
            choice = choice.trim();
            while(!(choice.equalsIgnoreCase("yes")||choice.equalsIgnoreCase("no"))){
                
                System.out.println("Answer must be yes or no.\nWrite yes or no");
                choice = input.next();
                choice = choice.trim();
            }
            if(choice.equalsIgnoreCase("yes")){
                System.out.println("Which card would you like to change it with "+card.getValue()+"     "+card.getSuit());
                System.out.println("Your cards are: ");
                
                player.printCards();
                int x=1;
                int temp=0;
                while(x==1){
                    try{
                        temp = Integer.parseInt(input.next());
                        if(temp>=6 || temp<=0){
                            throw new InputMismatchException();
                        }
                        break;
                    }
                    catch(InputMismatchException ex){
                        System.out.println("Input must be between 1 to 5");
                        System.out.println("which card would you like to change it with "+card.getValue()+"     "+card.getSuit());
                        continue;
                    }
                    catch(NumberFormatException ex1){
                        System.out.println("Input must be between 1 to 5");
                        System.out.println("which card would you like to change it with "+card.getValue()+"     "+card.getSuit());
                        continue;
                    }
                }
       
                player.changeCard(card, temp-1);
                System.out.println("Now your cards are ");
                player.printCards();
             
            }
            else if(choice.equalsIgnoreCase("no")){
                System.out.println("Dropped the card "+ card.getValue()+"     "+card.getSuit());
               
            }
            else{
                System.out.println("Answer must be yes or no");
            }
        
    }
	
    /*
     * @return card
    */
    public Card getCard() {
	return card;
    }
	
}
