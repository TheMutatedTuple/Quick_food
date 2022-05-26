import java.util.Scanner;

public class Items {
	public Items() {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("How many items do you want to enter?");
			int num = s.nextInt();
			String items[] = new String[num];

			
			for (int i = 0 ; i < num; i++ ) {
				 items[i] = s.nextLine();
			     System.out.println("Enter item " + i + " now.");
			     
			   
			}

			//the elements have been stored in the array .. items[]

			System.out.println("These are the items you have entered.");
			for (int i = 0 ; i < num; i++ ) {
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
			    System.out.println(items[i] + " R" + priceArray[i] + "\n");
			}
		}
       
		
	}

}
