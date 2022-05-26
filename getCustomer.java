import java.util.Scanner;

public class getCustomer {
	
	
	static String custLocation = new String();
	
	static String custcustomerName = new String();
	
	static String custEmail = new String();
	
	static String custAdress = new String();
	
	static String custOrderNumber = new String();
	
	static String custContactNumber = new String();
	
	
public static void GetCustomer() {
		
		//get customer information through user input
		Scanner s = new Scanner(System.in);
		
		
	    System.out.print("Please enter the customer's name: ");
	    
	    String customerName = s.nextLine();
	    
	    
	    System.out.print("Please enter the customers order number: " );
	    
	    String orderNumber = s.nextLine();
	    
	    
	    System.out.print("Please enter the customers contact number: " );
	    
	    String contactNumber = s.nextLine();

	    
	    System.out.print("Please enter the customer's adress: ");
	    
	    String adress = s.nextLine();
	    

	    System.out.print("Please enter the customer's location(city): ");
	    
	    String customerLocation = s.nextLine();
	    
	    
	    System.out.print("Please enter the customer's email: ");
	    
	    String email = s.nextLine();
	    
	    
	    Customer customer = new Customer(orderNumber , customerName , contactNumber , adress, customerLocation , email);
	    
	    //assign to global variable values
	    custAdress = adress;
	    
	    custContactNumber = contactNumber;
	    
	    custEmail = email;
	    
	    custcustomerName = customerName;
	    
	    custOrderNumber = orderNumber;
	    
	    custLocation = customerLocation;
	    
	    customer.displayCustomer(customer);
	    
		
	}

}
