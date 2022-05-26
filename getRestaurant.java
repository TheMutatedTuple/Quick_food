import java.util.Scanner;

public class getRestaurant {
	
	
	
	static String restRestaurantName = new String();
	
	static String restContactNumber = new String();
	
	static boolean restaurantInArea;
	
	
	
public static void GetRestaurant() {
		
		//get restaurant information through user input
		Scanner s = new Scanner(System.in);
		
	    System.out.print("Please enter the restaurant's name: ");
	    
	    String reataurantName = s.nextLine();;
	    
	    System.out.print("Please enter the restaurant's location: ");
	    
	    String reataurantLocation = s.nextLine();
	    
	    System.out.print("Please enter the restaurant's contact number: " );
	    
	    String restaurantcontactNumber = s.nextLine(); 
	    
	    Restaurant restaurant = new Restaurant(reataurantName , reataurantLocation , restaurantcontactNumber);
	    
	    //assign to global variable values
	    restRestaurantName = reataurantName;
	    
	    restContactNumber = restaurantcontactNumber;


	    
	    if(reataurantLocation.equals(getCustomer.custLocation)) {
	    	restaurantInArea = true;
	    }
	    else {
	    	restaurantInArea = false;
	    }
	    
	    restaurant.displayRestaurant(restaurant);
		
	}

}
