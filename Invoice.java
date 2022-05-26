import java.io.FileWriter;

public class Invoice {
	
	public static void getFile() {
		if(GetDriver.driverInArea == false || getRestaurant.restaurantInArea == false) {
			
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
				
				fw.write("Order Number: " + getCustomer.custOrderNumber +"\n"+"\n");
				
				fw.write("Customer: " + getCustomer.custcustomerName +"\n"+"\n");
				
				fw.write("Email: " + getCustomer.custEmail +"\n"+"\n");
				
				fw.write("Contact Number: " + getCustomer.custContactNumber +"\n"+"\n");
				
				fw.write("Location: " + getCustomer.custLocation +"\n"+"\n");
				
				fw.write("You have ordered the following from " + getRestaurant.restRestaurantName + " in " + getCustomer.custLocation   + "\n"+"\n" );
				
				
				int total = 0;
		
				for(int i = 0 ; i<getItems.itemsString.size();i++) {
					
					fw.write(getItems.itemsString.get(i).toString() + " " + getItems.itemsPriceInt.get(i) + ",");
					
					total += getItems.itemsPriceInt.get(i);
				}
				
				fw.write("\nTotal= R" + total+"\n"+"\n"); 
				
				
				fw.write(GetDriver.correpspondingDriver + " is nearest to the restaurant and so he will be delivering your\r\n"
						+ "order to you at:" + getCustomer.custAdress +"\n"+"\n");
				
				fw.write("If you need to contact the restaurant, their number is: " + getRestaurant.restContactNumber);
				
				fw.close();
				
		}
	    catch (Exception e) {
	    	
	        e.getStackTrace();
	        
	    }
		
	}

}
