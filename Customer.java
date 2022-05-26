
public class Customer {
	String orderNumber;
	String customerName;
	String contactNumber;
	String adress;
	String location;
	String email;
	
	
	public Customer(String orderNumber , String customerName ,  String contactNumber , String adress , String location , String email) {
		this.orderNumber = orderNumber;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.adress = adress;
		this.location = location;
		this.email = email;
	}
	public void displayCustomer(Customer customer) {
		System.out.println(customer.customerName + "\n" + customer.orderNumber + "\n" + "\n" + customer.contactNumber+ "\n" + customer.adress + "\n" + customer.location + "\n" + customer.email + "\n");
	}
	
	

}
