/*Name: Jordania Donaldson
 *Cards.java
 *This program creates card objects and includes the setter and getter methods for the objects 
 */

public class Cards
{
	
private int cardnum;
private int suit; 

public Cards(int num)
{
 suit=(num%4);
 cardnum=(num%13);
}
 // Verifies that the suit is within range for the setSuit method
 public int setSuit (int NewSuit)
 {
   if (NewSuit!= 0 && (NewSuit >= 4))
	suit=NewSuit;
   return suit;
 }
 //Returns the facevalue of the card
 public int getCardNum()
 {
   return cardnum;
 }
 //Sets the facevalue of the card
 public void setCardNum (int newNum)
 {
	 while (newNum!=0&&(newNum<14))
	 {
	   cardnum=newNum;
	 }
 }
 //Formats the facevalue and suit to an acceptable string that is user-friendly
 public String toString()
 {
	 String suitString="";
	 String facevalue="";
	 switch (suit)
	 {
	 case 0:
	  suitString=("Diamond");
	  break;
	 case 1:
	  suitString=("Spades");
	  break;
	 case 2:
	  suitString=("Hearts");
	  break;
	 case 3:
	  suitString=("Clover");
	  break;
	 }
	 switch (cardnum+1)
	  {
	  case 1:
		 facevalue="Ace";
	  break;
	  case 11:
		  facevalue="Jack";
	  break;
	  case 12:
		  facevalue="Queen";
	  break;
	  case 13: 
		  facevalue="King";
	  break;
	  default:
		  facevalue=Integer.toString(cardnum+1);
	  }
   String CardDescription="Card: "+facevalue+" of "+suitString;
   return CardDescription;
 }
}
