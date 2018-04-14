import java.util.Scanner;

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

		
		
	}

}
