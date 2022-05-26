
public class Restaurant {
	String name;
	String location;
	String contactNumber;
	
	
	public Restaurant(String name, String location , String restaurantcontactNumber) {
		this.name = name;
		this.location = location;
		this.contactNumber = restaurantcontactNumber;
	}
	public void displayRestaurant(Restaurant restaurant) {
		System.out.println(restaurant.name + "\n" + restaurant.location + "\n" + "\n" + restaurant.contactNumber + "\n");
	}
}
