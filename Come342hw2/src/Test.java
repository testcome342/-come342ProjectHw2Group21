import java.util.Scanner;

import helper.Database;
import model.Campaign;
import model.Client;

public class Test {
	
	//Nisa Berfin Yesin - Gamze Alver
	//14.04.2018
	
	
	public static void main(String[] args) {
		
		int choice;
		
		while(true) {
			System.out.println("********AGATE LTD********");
			System.out.println("1 - Add a new client");
			System.out.println("2 - Add a new campaign");
			System.out.println("5 - Assign stff to work on a campaign ");
			System.out.println("11 - Add a new advert to a campaign ");
			System.out.println("12 - Add a new member of staff ");
			System.out.println("0 - Exit");
			System.out.println("Please enter a number");
			System.out.print("Answer=> ");
			choice = new Scanner(System.in).nextInt();
			
			switch(choice) {
			 case 1:
				 AddNewClientUI();
				 break;
			 case 2:
				 System.out.println("2 - Add a new campaign");
				 break;
			 case 5:
				 System.out.println("5 - Assign stff to work on a campaign ");
				 break;
			 case 11:
				 System.out.println("11 - Add a new advert to a campaign ");
				 break;
			 case 12:
				 System.out.println("12 - Add a new member of staff ");
				 break;
			 case 0:
				 System.exit(0);
			 	break;
			 default:
				 System.out.println("Error! Please try enter a number");
			 	break;
			}
			
			for(int i = 0; i < 20; i++) {
				System.out.println("");
			}
		}
		
		
		
		
	}

	private static void AddNewClientUI() {

		//Gamze Alver
		//14.04.2018
		
		Client.getClients();
		
		System.out.print("Company Name= ");
		String name = new Scanner(System.in).nextLine();
		
		System.out.print("Company Address= ");
		String address = new Scanner(System.in).nextLine();
		
		System.out.print("Company Email= ");
		String email = new Scanner(System.in).nextLine();
		
		System.out.print("Contact Name= ");
		String contactName = new Scanner(System.in).nextLine();
		
		System.out.print("Contact Email= ");
		String contactEmail = new Scanner(System.in).nextLine();
		
		
		Client client = new Client(name, address, email, contactName, contactEmail);
		
		
		System.out.println("Would you like to add a campaign? (Yes/No)");
		
		String response = new Scanner(System.in).nextLine();
		
		if(response.toLowerCase().equals("yes")) {
			System.out.print("Campaign Title= ");
			String campaignTitle = new Scanner(System.in).nextLine();
			
			System.out.print("Campaign StartDate= ");
			String startDate = new Scanner(System.in).nextLine();
			
			System.out.print("Campaign FinishDate= ");
			String finishDate = new Scanner(System.in).nextLine();
			
			System.out.print("Campaign Estimated Cost= ");
			Double estimatedCost = new Scanner(System.in).nextDouble();
			
			Campaign campaign = new Campaign(campaignTitle, startDate, finishDate, estimatedCost);
			
			client.addNewCampaign(campaign);
			
			Database.clientList.add(client);
		}

		
	}

}
