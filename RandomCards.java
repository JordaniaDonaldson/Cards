//Name: Jordania Donaldson
//Program: RandomCards.java
// This program prints a number of cards; the amount selected by the user
import java.util.Scanner;
public class RandomCards
{
 public static void main (String[] args)
 { 
	 DeckofCards play = new DeckofCards();
	 play.shuffle();
	 Scanner scan = new Scanner(System.in);
	 int cardRequest;
	 char ans;
	 
	 do
	 {
	 System.out.println("This program prints playing cards. Please enter the amount of cards needed." +
	 		"(Number must be between 1 and 52)");
	 cardRequest=scan.nextInt();
	 if (cardRequest!=0&&(cardRequest<53))
	 {
	 play.deal(cardRequest);
	 }
	 else
	 {
		 System.out.println("Invlaid input. Please enter a value between 1 and 52");
		 cardRequest=scan.nextInt();
	 }
	 play.cardsLeft();
	 
	 System.out.println("Do you want to play again?");
	 ans=scan.next().charAt(0);
	 }
	 while (ans=='y'||ans=='Y');
	 System.out.println("Thank you for playing");
	 
	 scan.close();
 }
 
}
