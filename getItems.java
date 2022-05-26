import java.util.ArrayList;
import java.util.Scanner;

public class getItems {
	
	static ArrayList<String> itemsString = new ArrayList<>();
	
	static ArrayList<Integer> itemsPriceInt = new ArrayList<>();
	
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

}
