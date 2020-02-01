package learnJavaWeekOneProject_v1;

public class App {

	public static void main(String[] args) {
		// Tylor Davis
		// Learn Java Course - Week 1 - Coding Assignment 
		
		// TIP: If you want to use float, end the number with 'f'. 
		// Item Price
		float itemPrice = 19.95f; 
		
		// Amount of money currently in the wallet. 
		float cashOnHand = 230.50f;
		
		// Amount of money after the item has been purchased once. 
		float cashAfterPurchase = cashOnHand - itemPrice; 
		
		// Starting amount of friends. 
		int amountOfFriends = 40; 
		
		// Initial Age. 
		int startingAge = 20; 
		
		// Friends made on average per year since birth. 
		int friendsMadePerYear = amountOfFriends / startingAge; 

		
		// First name, middle initial, and last name.
		String firstName = "Wombo";
		String middleInitial = "D";
		String lastName = "Combo"; 
		String fullName = firstName + " " + middleInitial + " " + lastName; 
		
		// Display Text
		System.out.println("Cash on hand after a single purchase: $" + cashAfterPurchase +"."); 
		System.out.println("");
		System.out.println("Friends made on average per year since birth: " + friendsMadePerYear); 
		System.out.println("");
		System.out.println("The user's full name is " + fullName + ".");
		System.out.println("");
	}
}
