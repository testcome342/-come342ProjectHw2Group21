package model;

import java.util.ArrayList;
import java.util.List;

import helper.Database;

public class Client {
	
	//Nisa Berfin Yesin
	//14.04.2018
	
	private String name;
	private String address;
	private String email;
	private String contactName;
	private String contactEmail;
	private List<Campaign> campaignList = new ArrayList<Campaign>();
	
	public Client(String name, String address, String email, String contactName, String contactEmail) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.contactName = contactName;
		this.contactEmail = contactEmail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	
	public static void getClients() {
		List<Client> clientList = Database.clientList;
		
		for(int i = 0; i < clientList.size(); i++) {
			System.out.println(i + " " + clientList.get(i).getName());
		}
	}
	
	//Gamze Alver
	//14.04.2018
	public void addNewCampaign(Campaign campaign) {
		this.campaignList.add(campaign);
	}

}
