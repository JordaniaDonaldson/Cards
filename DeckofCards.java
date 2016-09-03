/* Name: Jordania Donaldson
 * DeckofCards.java
 * This program creates a deck of card objects stored in an array and includes the shuffle and the deal methods
 * 
 */
import java.util.Random;
public class DeckofCards
{
 private Cards deck[] = new Cards[52];
 private int count=0;
  public DeckofCards()
  {
	 for (int i=0;i<52;i++)
	 {
		 deck[i]= new Cards(i);
		 int counter=0;
		 count=counter;
	 }
  }
  //Shuffles the cards by swapping them at random
  public void shuffle()
  {
	  System.out.println("Shuffling, please wait");
	  Random generator = new Random();
	  for(int i=0;i<52;i++)
	  {
		  int randomPosition = generator.nextInt(52);
		  Cards temp = new Cards(i);
		  temp=deck[i];
		  deck[i]=deck[randomPosition];
		  deck[randomPosition]=temp;
	  }
	  
  }
  // prints any number of cards between 1 and 52
  public void deal(int numberOfCards)
  {  
	  for (int i=0; i<numberOfCards;i++)
	  {  
		  System.out.println(deck[count].toString());
		  count++;
	  }
  }
  //prints number of cards left
  public void cardsLeft()
  {
	  System.out.println("There are "+(52-count)+" cards left in the deck");
  }

}

