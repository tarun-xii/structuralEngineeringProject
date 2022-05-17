
public class Contractor {

	//Attributes of secretary Class
	String name;
	String telephoneNumber;
	String email;
	String physicalAddress;

	
	
	//Constructor
	public void ContractorClass(String name,String telephoneNumber,String email,String physicalAddress) 
	{
		this.name = name;
		this.telephoneNumber = telephoneNumber;
		this.email = email;
		this.physicalAddress = physicalAddress;
	}
	//To string method to display object details of Architect class
	public String toString()
	{
		
		String output = "Contractor Infomation:";
		output += "\nName: " + name;
		output += "\nTelephone Number: " + telephoneNumber;
		output += "\nemail: " + email;
		output += "\nPhysical Address: " + physicalAddress;

		return output;	
	}
	
}
