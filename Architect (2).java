
public class Architect {

	//Attributes of secretary Class
	String name;
	String telephoneNumber;
	String email;
	String physicalAddress;

	
	
	//Constructor
	public void ArchitectClass(String name,String telephoneNumber,String email,String physicalAddress) 
	{
		this.name = name;
		this.telephoneNumber = telephoneNumber;
		this.email = email;
		this.physicalAddress = physicalAddress;
	}
	//To string method to display object details of Architect class
	public String toString()
	{
		
		String output = "Architect Infomation:";
		output += "\nName: " + name;
		output += "\nTelephone Number: " + telephoneNumber;
		output += "\nemail: " + email;
		output += "\nPhysical Address: " + physicalAddress;

		return output;	
	}
	
}
