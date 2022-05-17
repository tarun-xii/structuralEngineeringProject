
public class Customer {

	//Attributes of Customer Class
	String name;
	String telephoneNumber;
	String email;
	String physicalAddress;

	
	
	//Constructor
	public void CustomerClass(String name,String telephoneNumber,String email,String physicalAddress) 
	{
		this.name = name;
		this.telephoneNumber = telephoneNumber;
		this.email = email;
		this.physicalAddress = physicalAddress;
	}
	//To string method to display object details of Architect class
	public String toString()
	{
		String output = "Customer Infomation:";
		output += "\nName: " + name;
		output += "\nTelephone Number: " + telephoneNumber;
		output += "\nemail: " + email;
		output += "\nPhysical Address: " + physicalAddress;

		return output;	
	}
	
}
