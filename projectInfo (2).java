import java.util.Scanner;



//This project utilises Classes that seeks to create a database where we can store, manipulate and view various different 
//project information, such as the Project name, number, address, payment details, and deadlines, 
//We also are able to view the Architect, contractor and customer of each of the projects
//We have created test objects to ensure that the code works


public class projectInfo {

	String projectNumber;
	String projectName;
	String typeOfBuilding;
	String projectAddress;
	String erfNumber;
	float totalFee;
	float totalPaid;
	String deadlineProject;
	
	public void ProjectClass(String projectNumber,String projectName,String typeOfBuilding,String projectAddress,String erfNumber,float totalFee,float totalPaid,String deadlineProject ) 
	{
		this.projectNumber = projectNumber;
		this.projectName = projectName;
		this.typeOfBuilding = typeOfBuilding;
		this.projectAddress = projectAddress;
		this.erfNumber= erfNumber;
		this.totalFee=totalFee;
		this.totalPaid=totalPaid;
		this.deadlineProject =deadlineProject;

	}
	
	public String toString()
	{
		String output = "Project Number: " + projectNumber;
		output += "\nProject Name: " + projectName;
		output += "\nType of Building: " + typeOfBuilding;
		output += "\nProject Address: " + projectAddress;
		output += "\nERF Number: " + erfNumber;
		output += "\nTotal Fee: R" + totalFee;
		output += "\nTotal Paid: R" + totalPaid;
		output += "\nDeadline of Project: " + deadlineProject;
		
		return output;		
	}

	public static void main(String[] args) {
		projectInfo eskom = new projectInfo();
		eskom.ProjectClass("PO737", "Madusi Power", "Apartment Block", "10 Washington Drive, Bergbron, South Africa", "PQA27677",1200000,300000,"10 September 2023" );
		//System.out.println(eskom.toString()+"\n");
		
		Architect eskomA = new Architect();
		eskomA.ArchitectClass("Jennifer Lawrence", "+27 71 677 2182", "jennifer@design4u.com","10 Houston Street, Johannesburg");
		//System.out.println(eskomA.toString()+"\n");
		
		Contractor eskomC = new Contractor();
		eskomC.ContractorClass("Micheal Phelps", "+27 82 483 3292", "m.phelps@builditfelix.com","22 Sorbet Street, Sandton");
		//System.out.println(eskomC.toString()+"\n");
		
		Customer eskomCustomer = new Customer();
		eskomCustomer.CustomerClass("Eskom Holdings SA Pty(Ltd)", "+27 86 223 5673", "director@eskom.com","22 Mbathi Street, Milnerton");
		//System.out.println(eskomCustomer.toString()+"\n");
		
		int userInt;
		//New project variables 
		String newProjectNumber;
		String newProjectName;
		String newTypeOfBuilding;
		String newProjectAddress;
		String newErfNumber;
		float newTotalFee;
		float newTotalPaid;
		String newDeadlineProject;
		
		//New Architect variables 
		String newArchitectName;
		String newArchitectTelNumber;
		String newArchitectEmail;
		String newArchitectAddress;
		
		//New Contractor variables 
		String newContractorName;
		String newContractorTelNumber;
		String newContractorEmail;
		String newContractorAddress;
		
		//New Customer variables 
		String newCustomerName;
		String newCustomerTelNumber;
		String newCustomerEmail;
		String newCustomerAddress;
	
		//Changing due date
		String newDueDate;
		
		//Changing total fee paid to date 
		float newTotalFeePaid;		
		
		int exit = 0;
		//used to give user options to add new project, change existing project details etc. 
		while(exit==0)
		{
			Scanner userNum = new Scanner(System.in);
			System.out.println("To create a new Project, [Enter 1] \n"
					+ "To change the due date of an existing Project, [Enter 2] \n"
					+ "To change the total feel paid to date, [Enter 3] \n"
					+ "To change the contractor contact details, [Enter 4] \n"
					+ "To exit menu, [Enter 0]");
			userInt = userNum.nextInt();

			
			if(userInt==1) //New Project 
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Enter new project Number: ");
				newProjectNumber = userInput.nextLine();
				

				System.out.println("Enter new project Name: ");
				newProjectName = userInput.nextLine();
				
				System.out.println("Enter new project Building Type: ");
				newTypeOfBuilding = userInput.nextLine();
				
				System.out.println("Enter new project Address: ");
				newProjectAddress = userInput.nextLine();
				
				System.out.println("Enter new project ERF Number: ");
				newErfNumber = userInput.nextLine();
				
				System.out.println("Enter new project Total Fee: R");
				newTotalFee = userInput.nextFloat();
				
				System.out.println("Enter new project Total Paid: ");
				newTotalPaid = userInput.nextFloat();
				
				System.out.println("Enter new project Deadline Date: ");
				newDeadlineProject = userInput.nextLine();
				
				//Acquire details for Architects information
				System.out.println("Architect Information");
				System.out.println("Enter new Architect Name: ");
				newArchitectName = userInput.nextLine();
				
				System.out.println("Enter new Architect Phone Number: ");
				newArchitectTelNumber = userInput.nextLine();
				
				System.out.println("Enter new Architects Email address: ");
				newArchitectEmail = userInput.nextLine();
				
				System.out.println("Enter new Architects Physical Address: ");
				newArchitectAddress = userInput.nextLine();
				
				//Acquire details for Contractor information
				System.out.println("Contractor Information");
				System.out.println("Enter new Contractor Name: ");
				newContractorName = userInput.nextLine();
				
				System.out.println("Enter new Contractor Phone Number: ");
				newContractorTelNumber = userInput.nextLine();
				
				System.out.println("Enter new Contractor Email address: ");
				newContractorEmail = userInput.nextLine();
				
				System.out.println("Enter new Contractor Physical Address: ");
				newContractorAddress = userInput.nextLine();
				
				//Acquire Details for customer information
				System.out.println("Customer Information");
				System.out.println("Enter new Customer Name: ");
				newCustomerName = userInput.nextLine();
				
				System.out.println("Enter new Customer Phone Number: ");
				newCustomerTelNumber = userInput.nextLine();
				
				System.out.println("Enter new Customer Email address: ");
				newCustomerEmail = userInput.nextLine();
				
				System.out.println("Enter new Customer Physical Address: ");
				newCustomerAddress = userInput.nextLine();

	
				//Create new object for project 
				projectInfo brandNewProject = new projectInfo();
				brandNewProject.ProjectClass(newProjectNumber,newProjectName, newTypeOfBuilding, newProjectAddress, newErfNumber,newTotalFee,newTotalPaid,newDeadlineProject);
				System.out.println(brandNewProject.toString()+"\n");
				
				Architect brandNewArchitect = new Architect();
				brandNewArchitect.ArchitectClass(newArchitectName, newArchitectTelNumber, newArchitectEmail,newArchitectAddress);
				System.out.println(brandNewArchitect.toString()+"\n");
				
				Contractor brandnewContractor = new Contractor();
				brandnewContractor.ContractorClass(newContractorName, newContractorTelNumber, newContractorEmail,newContractorAddress);
				System.out.println(brandnewContractor.toString()+"\n");
						
				Customer brandNewCustomer = new Customer();
				brandNewCustomer.CustomerClass(newCustomerName, newCustomerTelNumber, newCustomerEmail,newCustomerAddress);
				System.out.println(brandNewCustomer.toString()+"\n");
				
			}
			else if(userInt==2)  //Changes due date of project [I have used the existings objects here to edit to ensure the user edits a project that exists
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Enter new Due Date: ");
				newDueDate = userInput.nextLine();
				eskom.deadlineProject= newDueDate;
				System.out.println(eskom.toString()+"\n");
				
			}
			else if(userInt==3) //Changes total fee paid to date
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Enter new Total fee paid to date: ");
				newTotalFeePaid = userInput.nextFloat();
				eskom.totalPaid= newTotalFeePaid;
				System.out.println(eskom.toString()+"\n");
			   
			}
			else if(userInt==4) //Changes contractor contact details 
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Contractor Information");
				System.out.println("Enter new Contractor Phone Number: ");
				newContractorTelNumber = userInput.nextLine();
				
				System.out.println("Enter new Contractor Email address: ");
				newContractorEmail = userInput.nextLine();
				
				//Contractor brandnewContractor = new Contractor();
				eskomC.telephoneNumber = newContractorTelNumber;
				eskomC.email = newContractorEmail;
				System.out.println(eskomC.toString()+"\n");
			}
			else if(userInt==0)
			{	
				exit =1; //Exits loop 
			}
			
		} //end of while loop 
			
		//Finalising the project 
		float totalDue = eskom.totalFee -  eskom.totalPaid;
		
		if(totalDue>0) 
		    { 
			    System.out.println("Invoice \n");
			    System.out.println(eskomCustomer.name);
			    System.out.println(eskomCustomer.telephoneNumber);
			    System.out.println(eskomCustomer.email);
		    
		        System.out.println("Total Due: R "+totalDue);
		    }
	}
}
