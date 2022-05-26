import java.util.ArrayList;
import java.util.Scanner;	
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;


public class Main {
	//assign all of the global input i will need
	static String custLocation = new String();
	
	static String custcustomerName = new String();
	
	static String custEmail = new String();
	
	static String custAdress = new String();
	
	static String restRestaurantName = new String();
	
	static String correpspondingDriver = new String();
	
	
	//made use of arrayLists here for their dynamic size
	static ArrayList<String> correpspondingDrivers = new ArrayList<>();
	
	static ArrayList<String> correpspondingDriverLoad = new ArrayList<>();
	
	static ArrayList<String> itemsString = new ArrayList<>();
	
	static ArrayList<Integer> itemsPriceInt = new ArrayList<>();
	
	
	static String custOrderNumber = new String();
	
	static String custContactNumber = new String();
	
	static String restContactNumber = new String();
	
	static boolean driverInArea;
	
	static boolean restaurantInArea;
	

	public static void main(String[] args) {
		
		GetCustomer();
		
		GetRestaurant();
		
	    Items();
	    
	    GetDriver();	
	    
	    getFile();
	    
	    
	    
	    
	    
	}

	public static void Items() {
		
		//get how many items the user wants to input to determine the length of the items array
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("How many items do you want to enter?");
		
        int num = s.nextInt();
        
        String items[] = new String[num];

        
        System.out.println("Enter item " + 1 + " now.");
        
        String fisrtItem = s.nextLine();
        
        items[0] = fisrtItem;
        
        if(num!=1) {
        	
        	for (int i = 0 ; i < num ; i++ ) {
            	
            	items[i] = s.nextLine();
            	
            	//get user to input as many items as they have selected
                System.out.println("Enter item " + (i+2) + " now.");
                
               
            }
        	
        }
        
        else {
        	//do nothing
        	
        }
        

        //the elements have been stored in the array .. items[]

        System.out.println("These are the items you have entered.");
        
        for (int i = 0 ; i < items.length; i++ ) {
        	
        	itemsString.add(items[i]);
        	
            System.out.println(items[i] + "\n");
            
        }
        
        
        //get the price of the ordered items
        int priceArray[] = new int[items.length];
        
        System.out.println("Please enter the prices of the items in the order displayed above.");
        
        for (int i = 0 ; i < priceArray.length; i++ ) {
        	
        	priceArray[i] = s.nextInt();
        	
        }
        
        System.out.println("These are the items and prices you have entered.");
        
        for (int i = 0 ; i < items.length; i++ ) {
        	
        	itemsPriceInt.add(priceArray[i]) ;
        	
            System.out.println(items[i] + " R" + priceArray[i] + "\n");
            
        }
        
        return;
		
	}

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


	    
	    if(reataurantLocation.equals(custLocation)) {
	    	restaurantInArea = true;
	    }
	    else {
	    	restaurantInArea = false;
	    }
	    
	    restaurant.displayRestaurant(restaurant);
		
	}

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
	public static String[] GetDriver() {
		
		try {
			
			//retrieve drivers.txt
			File x = new File("drivers.txt");
			
			Scanner sc = new Scanner(x);
			//check for drivers in customer location while text file has next line
			while(sc.hasNext() == true){																		
				
				//split driver up by ","
				String[] driverArray = sc.nextLine().split(",");											     	                                                     
																											
				String driverLocation = driverArray[1];																		
																													
				//compare customer location to the drivers
				if(driverLocation.equals(" " + custLocation)) {
					
					//drivers in customer location
					correpspondingDrivers.add(driverArray[0]);	
					
					//And their load
					correpspondingDriverLoad.add(driverArray[2]);
					
					//invoice will be printed if the input is valid
					driverInArea = true;
					
				}
				
				
				
				
																								                 
			
				
			}
			
			findSmallestLoad();
			
			
			sc.close();
			
		}
		catch (FileNotFoundException e) {
			
			System.out.println("Error could not retrieve drivers.txt");
			
			}
		
		return null;


		
	}
	

	private static void findSmallestLoad() {
		//find driver with the smallest load
		for(int i = 1 ; i<correpspondingDrivers.size()-1;i++) {
			
			if(Integer.parseInt(correpspondingDriverLoad.get(i).split(" ")[1]) > Integer.parseInt(correpspondingDriverLoad.get(i+1).split(" ")[1])) {
				
				correpspondingDriver = correpspondingDrivers.get(i);					              
				                                                                                          
			}
			                                                                                            
		}
		
	}

	public static void getFile() {
		if(driverInArea == false || restaurantInArea == false) {
			
			System.out.print("No Service Available");
			
		}
		else {
			
			craeteInvoice();
			
		}
		
		
		
		
	}

	private static void craeteInvoice() {
		System.out.print("Invoice Created!!!");
		try {
			
			//if there is a driver in the customers location an invoice will be printed
				
			//create invoice.txt and enter the values
				FileWriter fw = new FileWriter("invoice.txt");
				
				fw.write("Order Number: " + custOrderNumber +"\n"+"\n");
				
				fw.write("Customer: " + custcustomerName +"\n"+"\n");
				
				fw.write("Email: " + custEmail +"\n"+"\n");
				
				fw.write("Contact Number: " + custContactNumber +"\n"+"\n");
				
				fw.write("Location: " + custLocation +"\n"+"\n");
				
				fw.write("You have ordered the following from " + restRestaurantName + " in " + custLocation   + "\n"+"\n" );
				
				
				int total = 0;
		
				for(int i = 0 ; i<itemsString.size();i++) {
					
					fw.write(itemsString.get(i).toString() + " " + itemsPriceInt.get(i) + ",");
					
					total += itemsPriceInt.get(i);
				}
				
				fw.write("\nTotal= R" + total+"\n"+"\n"); 
				
				
				fw.write(correpspondingDriver + " is nearest to the restaurant and so he will be delivering your\r\n"
						+ "order to you at:" + custAdress +"\n"+"\n");
				
				fw.write("If you need to contact the restaurant, their number is: " + restContactNumber);
				
				fw.close();
				
		}
	    catch (Exception e) {
	    	
	        e.getStackTrace();
	        
	    }
		
	}
	

}
