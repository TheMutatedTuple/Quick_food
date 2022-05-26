import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GetDriver {
	
	
	static String correpspondingDriver = new String();
	
	static ArrayList<String> correpspondingDrivers = new ArrayList<>();
	
	static ArrayList<String> correpspondingDriverLoad = new ArrayList<>();
	
	static boolean driverInArea;
	
	
	
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
				if(driverLocation.equals(" " + getCustomer.custLocation)) {
					
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

}
