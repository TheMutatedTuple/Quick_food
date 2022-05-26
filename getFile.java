import java.io.FileWriter;
import java.util.ArrayList;

public class getFile {
	
	static String custOrderNumber = new String();
	
	static String custContactNumber = new String();
	
	static String custLocation = new String();
	
	static String custcustomerName = new String();
	
	static String custEmail = new String();
	
	static String custAdress = new String();
	
	static String restRestaurantName = new String();
	
	static String correpspondingDriver = new String();
	
	static String restContactNumber = new String();
	
	
	static ArrayList<String> itemsString = new ArrayList<>();
	
	static ArrayList<Integer> itemsPriceInt = new ArrayList<>();
	
	
	
	public static void getFile() {
		
		
		
		
		
		boolean driverInArea;
		
		boolean restaurantInArea;
		
		
		if(driverInArea == false) {
			
			System.out.print("No Drivers In Your Area");
			
		}
		else if(restaurantInArea == false) {
			
			System.out.print("The restaurant is too far away");
			
		}
		else {
			
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

}
