package model;

public class Campaign {
	
	//Gamze Alver
	//14.04.2018

	private String title;
	private String startDate;
	private String finishDate;
	private Double estimatedCost;
	
	public Campaign(String title, String startDate, String finishDate, Double estimatedCost) {
		super();
		this.title = title;
		this.startDate = startDate;
		this.finishDate = finishDate;
		this.estimatedCost = estimatedCost;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getFinishDate() {
		return finishDate;
	}
	public void setFinishDate(String finishDate) {
		this.finishDate = finishDate;
	}
	public Double getEstimatedCost() {
		return estimatedCost;
	}
	public void setEstimatedCost(Double estimatedCost) {
		this.estimatedCost = estimatedCost;
	}
	
	
}
